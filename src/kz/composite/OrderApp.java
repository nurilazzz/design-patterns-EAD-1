package kz.composite;

import java.util.Scanner;

public class OrderApp {
    OrderObject root = new Box("root");

    private void exampleExecute(){
        OrderObject container = new Box("Main Container");

        OrderObject box1 = new Box("Section 1");
        OrderObject box2 = new Box("Section 2");
        OrderObject box3 = new Box("Section 3");

        container.add(box1);
        container.add(box2);
        container.add(box3);

        OrderObject smartphone = new Product("IPhone 11", 500);
        OrderObject laptop = new Product("Acer Swift 350", 400);
        OrderObject mouse = new Product("PS100 Mouse", 30);
        OrderObject modem = new Product("TP-Link", 60);

        box1.add(smartphone);
        box2.add(laptop);
        box2.add(mouse);
        box3.add(modem);

        container.print();
        container.list();
    }

    private int mainMenu(){
        System.out.print("\nMenu\n---------------\n 1 - Add \n 2 - Remove \n 3 - List \n 4 - Total Price \n 5 - Example \n 6 - Exit \n >>> ");
        return (new Scanner(System.in).nextInt());
    }

    private void listRoot(){
        System.out.println("----------------------------");
        root.print();
        root.list();
        System.out.println("----------------------------");
    }

    public void run(){
        boolean status = true;
        Scanner scanner = new Scanner(System.in);
        while (status) {
            switch (mainMenu()) {
                case 1: // add
                    {
                        OrderObject object;
                        System.out.print("Object type?\n 1 - Product   2 - Box\n >>> ");
                        int choose = scanner.nextInt();
                        System.out.print("Name: ");
                        String name = scanner.next();
                        if (choose == 1) {
                            System.out.print("Price: ");
                            int price = scanner.nextInt();
                            object = new Product(name, price);
                        } else {
                            object = new Box(name);
                        }

                        listRoot();
                        System.out.print("Put in which box?(box name): ");
                        String boxName = scanner.next();
                        if (boxName.equals(root.getName()))
                            root.add(object);
                        else
                            root.getObjectByName(boxName).add(object);
                    }
                    break;
                case 2: // remove
                    {
                        listRoot();
                        System.out.print("Removed box name: ");
                        String boxName = scanner.next();
                        root.remove(root.getObjectByName(boxName));
                    }
                    break;
                case 3: // list
                    listRoot();
                    break;
                case 4: // total price
                    System.out.println("Total price: " + root.getPrice() + "$");
                    break;
                case 5: // example
                    exampleExecute();
                    break;
                case 6:
                    status = false;
                    System.out.println("LOG: Good bye!!!");
                    break;
                default:
                    System.out.println("LOG: Enter again!!!");
                    break;
            }
        }
    }
}


