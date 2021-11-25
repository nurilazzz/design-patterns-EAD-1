package kz.proxy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientSide {
    public static final Scanner sc = new Scanner(System.in);
    public static final ProxyDatabase database = new ProxyDatabase(new RealDatabase());

    public static void main(String[] args) {
        boolean loopOn = true;
        while (loopOn) {
            System.out.println("Enter 1 for product operations");
            System.out.println("Enter 2 to exit");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 4 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            switch (choice) {
                case 1:
                    productOperations();
                    break;
                case 2:
                    System.out.println("♡ Good bye ♡");
                    loopOn = false;
                    break;
            }
        }
    }

    public static void productOperations() {
        boolean loopOn = true;
        while (loopOn) {
            boolean b = true;
            while (b) {
                System.out.println("Enter login");
                String login = sc.next();

                System.out.println("Enter password");
                String password = sc.next();

                if (database.access(login, password)) {
                    b = false;
                }
            }
            System.out.println("Enter 1 to create a product");
            System.out.println("Enter 2 to remove a product");
            System.out.println("Enter 3 to list products");
            System.out.println("Enter 4 back");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 4 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the name: ");
                    String pName = sc.next();
                    System.out.println("Enter the amount: ");
                    int pAmount = sc.nextInt();
                    System.out.println("Enter the description: ");
                    String pDescription = sc.next();

                    Product newProduct = new Product(pName, pAmount, pDescription);
                    database.create(newProduct);
                    loopOn = false;
                    break;
                case 2:
                    System.out.println("Enter an id of a post");
                    int pId = sc.nextInt();
                    database.delete(pId);
                    loopOn = false;
                    break;
                case 3:
                    database.getProducts();
                    loopOn = false;
                    break;
                case 4:
                    loopOn = false;
                    break;
            }
        }
    }
}
