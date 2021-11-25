package kz.state;

import kz.state.states.NormalState;

import java.util.Scanner;

public class Mall {
    VendingMachine vendingMachines;
    Scanner scanner = new Scanner(System.in);

    Mall(){
        vendingMachines = new VendingMachine(new NormalState());
    }

    // methods for vending machines
    void makeInteractionsWithVendorMachine(){
        boolean status = true;
        while (status) {
            System.out.println("\n 1 - \"Update_Products\" in vending machine");
            System.out.println(" 2 - \"User interact\" with vending machine");
            System.out.println(" 3 - \"Info\" about vending maching");
            System.out.println(" 4 - \"Put currency\"");
            System.out.println(" 5 - \"Exit\"");
            System.out.print("Your choose: "); int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    workWithProducts();
                    break;
                case 2:
                    vendingMachines.doNextStep();
                    break;
                case 3:
                    System.out.println(vendingMachines.toString());
                    break;
                case 4:
                    putCurrency();
                    break;
                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("LOG: Try again! Wrong writing.");
            }
        }
    }

    private void putCurrency() {
        System.out.println("Current money in vending machine: ");
        System.out.println("100tg: " + vendingMachines.getCurrencies().getOrDefault("100tg",0));
        System.out.println("200tg: " + vendingMachines.getCurrencies().getOrDefault("200tg",0));
        System.out.println("500tg: " + vendingMachines.getCurrencies().getOrDefault("500tg",0));
        System.out.println("1000tg: " + vendingMachines.getCurrencies().getOrDefault("1000tg",0));

        System.out.print("\nPutting money:\n--------------\n100tg: "); int tg100 = scanner.nextInt();
        System.out.print("200tg: "); int tg200 = scanner.nextInt();
        System.out.print("500tg: "); int tg500 = scanner.nextInt();
        System.out.print("1000 tg: "); int tg1000 = scanner.nextInt();

        vendingMachines.getCurrencies().put("100tg", vendingMachines.getCurrencies().getOrDefault("100tg", 0) + tg100);
        vendingMachines.getCurrencies().put("200tg", vendingMachines.getCurrencies().getOrDefault("200tg", 0) + tg200);
        vendingMachines.getCurrencies().put("500tg", vendingMachines.getCurrencies().getOrDefault("500tg", 0) + tg500);
        vendingMachines.getCurrencies().put("1000tg", vendingMachines.getCurrencies().getOrDefault("1000tg", 0) + tg1000);
    }

    void workWithProducts(){
        boolean status = true;
        while (status) {
            System.out.println("\n 1 - \"addProducts\"");
            System.out.println(" 2 - \"updateProduct\"");
            System.out.println(" 3 - \"listProducts\"");
            System.out.println(" 4 - \"go back\"");
            System.out.print("Your choose: "); int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addProducts();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    listProducts();
                    break;
                case 4:
                    status = false;
                    break;
                default:
                    System.out.println("LOG: Try again! Wrong writing.");
            }
        }
    }

    void addProducts(){
        System.out.print("Product name: "); String name = scanner.next();
        System.out.print("Product price: "); int price = scanner.nextInt();
        System.out.print("Product amount: "); int amount = scanner.nextInt();
        vendingMachines.getProducts().add(new Product(name, price, amount));
    }

    void updateProduct(){
        int i = 1;
        for (Product product: vendingMachines.getProducts()) {
            System.out.println(i + ") " + product.getInfo());
        }
        System.out.print("your choose: "); i = new Scanner(System.in).nextInt() - 1;
        System.out.print("add amount: ");
        vendingMachines.getProducts().get(i).setAmount(vendingMachines.getProducts().get(i).getAmount() + scanner.nextInt());
    }

    void listProducts(){
        int i = 1;
        for (Product product: vendingMachines.getProducts()) {
            System.out.println(i + ") " + product.getInfo());
        }
    }
}
