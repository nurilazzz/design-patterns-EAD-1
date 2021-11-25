package kz.proxy;

import java.util.Random;

public class ProxyDatabase implements Database{
    private Database database;

    public ProxyDatabase(Database database) {
        this.database = database;
    }

    public boolean access(String login, String password){
        if (login.equals("demo") && password.equals("demo")) {
            System.out.println("Authentication accessed");
            return true;
        }else{
            System.out.println("Try again!");
            return false;
        }
    }

    public void successfulExecution(){
        System.out.println("Successfully executed");
        System.out.println("=====================================\n");
    }

    @Override
    public void create(Product product) {
        if (database == null) {
            System.out.println("Authentication must be accessed to create a product");
        } else {
            database.create(product);
            System.out.println(animate("Creating"));
            successfulExecution();
        }
    }

    @Override
    public void delete(int id) {
        if (database == null) {
            System.out.println("Authentication must be accessed to delete a product");
        } else {
            database.delete(id);
            System.out.println(animate("Removing"));
            successfulExecution();
        }
    }

    @Override
    public void getById(int id) {
        database.getById(id);
        successfulExecution();
    }

    @Override
    public void getProducts() {
        database.getProducts();
        successfulExecution();
    }

    public String animate(String str){
        try {
            int count = 0;
            String points = ".";
            Random random = new Random();
            int countIterations = random.nextInt(15) + 5;
            while(count < countIterations) {
                System.out.print("\r" + str + points);
                if(points.length() < 3) {
                    points+=".";
                } else {
                    points=".";
                }
                Thread.sleep(199);
                count++;
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "\n" + str + " has finished";
    }
}
