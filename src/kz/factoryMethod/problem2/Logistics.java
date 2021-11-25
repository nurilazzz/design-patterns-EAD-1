package kz.factoryMethod.problem2;

import kz.factoryMethod.problem2.first_company.*;
import kz.factoryMethod.problem2.second_company.*;

import java.util.Scanner;

public class Logistics {
    public void choiceLogistics() {
        boolean bool = true;
        Scanner in = new Scanner(System.in);
        while (bool) {
            System.out.println("\n>>> Welcome to LogisticsApp <<< " +
                    "\nChoose a logistics company: " +
                    "\n1. First company " +
                    "\n2. Second company" +
                    "\n3. EXIT");
            int chooseCompany = in.nextInt();
            if (chooseCompany == 1) {
                while (bool) {
                    System.out.println("\n>> First company <<\nSelect the type of transport for delivery:\n1. Truck\n2. Ship\n3. Airplane\n4. MAIN MENU");
                    int choose = in.nextInt();
                    if (choose == 1) {
                        Transportation1 transportation1 = StartLogistics1.getTransportation(TransportType1.TRUCK);
                        transportation1.transportation();
                        System.out.println("Enter the distance (km), please: ");
                        double distance1 = in.nextDouble();
                        System.out.println("Amount spent: " + transportation1.calculateDelivery(distance1) + " $");
                        System.out.println("Time of delivery: " + transportation1.calculateTime(distance1) + " hours");
                    } else if (choose == 2) {
                        Transportation1 transportation1 = StartLogistics1.getTransportation(TransportType1.SHIP);
                        transportation1.transportation();
                        System.out.println("Enter the distance (km), please: ");
                        double distance1 = in.nextDouble();
                        System.out.println("Amount spent: " + transportation1.calculateDelivery(distance1) + " $");
                        System.out.println("Time of delivery: " + transportation1.calculateTime(distance1) + " hours");
                    } else if (choose == 3) {
                        Transportation1 transportation1 = StartLogistics1.getTransportation(TransportType1.AIRPLANE);
                        transportation1.transportation();
                        System.out.println("Enter the distance (km), please: ");
                        double distance1 = in.nextDouble();
                        System.out.println("Amount spent: " + transportation1.calculateDelivery(distance1) + " $");
                        System.out.println("Time of delivery: " + transportation1.calculateTime(distance1) + " hours");
                    } else if (choose == 4) {
                        break;
                    } else {
                        System.out.println("Wrong choice! Try again");
                    }
                }
            } else if (chooseCompany == 2) {
                while (bool) {
                    System.out.println("\n>> Second company <<\nSelect the type of transport for delivery:\n1. Truck\n2. Ship\n3. MAIN MENU");
                    int choose2 = in.nextInt();
                    if (choose2 == 1) {
                        Transportation2 transportation2 = StartLogistics2.getTransportation(TransportType2.TRUCK);
                        transportation2.transportation();
                        System.out.println("Enter the distance (km), please: ");
                        double distance2 = in.nextDouble();
                        System.out.println("Amount spent: " + transportation2.calculateDelivery(distance2) + " $");
                        System.out.println("Time of delivery: " + transportation2.calculateTime(distance2) + " hours");
                    } else if (choose2 == 2) {
                        Transportation2 transportation2 = StartLogistics2.getTransportation(TransportType2.SHIP);
                        transportation2.transportation();
                        System.out.println("Enter the distance (km), please: ");
                        double distance2 = in.nextDouble();
                        System.out.println("Amount spent: " + transportation2.calculateDelivery(distance2) + " $");
                        System.out.println("Time of delivery: " + transportation2.calculateTime(distance2) + " hours");
                    } else if (choose2 == 3) {
                        break;
                    } else {
                        System.out.println("Wrong choice! Try again");
                    }
                }
            } else if (chooseCompany == 3) {
                System.out.println("Good Bye!");
                bool = false;
            }  else {
                System.out.println("Wrong choice! Try again");
            }
        }
    }
}
