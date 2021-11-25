package kz.abstractFactory.task2;

import kz.abstractFactory.task2.style.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Welcome!");
            chooseFurniture();
            if(exit()){
                break;
            }
        }
    }
    public static FurnitureFactory chooseStyle(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Select a style(Enter an integer number in the list):");
            System.out.println("1. Art-deco");
            System.out.println("2. Victorian");
            System.out.println("3. Modern");
            if(sc.hasNextInt()){
                int choice = sc.nextInt();
                if(choice == 1) {
                    return new ArtDecoFactory();
                }
                else if(choice == 2) {
                    return new VictorianFactory();
                }
                else if(choice == 3) {
                    return new ModernFactory();
                }
                else {
                    System.out.println("Incorrect input");
                }
            }
            else {
                sc.nextLine();
                System.out.println("Error! Please input integer numbers");
            }
        }
    }
    public static boolean exit(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want exit?(Enter an integer number in the list):");
            System.out.println("1. Yes");
            System.out.println("2. No");

            if(sc.hasNextInt()){
                int choice = sc.nextInt();
                if(choice == 1) {
                    break;
                } else if(choice == 2){
                    return false;
                }
            }
            else {
                sc.nextLine();
                System.out.println("Error! Please input integer numbers");
            }
        }
        return true;
    }
    public static void chooseFurniture(){
        Furniture furniture = new Furniture(chooseStyle());
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Select a furniture(Enter an integer number in the list):");
            System.out.println("1. Chair");
            System.out.println("2. Coffee table");
            System.out.println("3. Sofa");
            System.out.println("4. Back");
            if(sc.hasNextInt()){
                int choice = sc.nextInt();
                if(choice == 1) {
                    furniture.getChair().getChair();
                }
                else if(choice == 2) {
                    furniture.getCoffeeTable().getCoffeeTable();
                }
                else if(choice == 3) {
                    furniture.getSofa().getSofa();
                }
                else if(choice == 4) {
                    break;
                }
                else {
                    System.out.println("Incorrect input");
                }
            }
            else {
                sc.nextLine();
                System.out.println("Error! Please input integer numbers");
            }
        }
    }
}
