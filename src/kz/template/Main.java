package kz.template;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean loopOn = true;
        while(loopOn) {
            System.out.println("Enter 1 for creating coupe");
            System.out.println("Enter 2 for creating sedan");
            System.out.println("Enter 3 for creating van");
            System.out.println("Enter 4 exit");
            Scanner sc = new Scanner(System.in);
            int choice;
            try{
                choice = sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if(!(choice >= 1 && 4>= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            Car car;
            switch (choice) {
                case 1:
                    car = new Coupe();
                    car.createCar();
                    break;
                case 2:
                    car = new Sedan();
                    car.createCar();
                    break;
                case 3:
                    car = new Van();
                    car.createCar();
                    break;
                case 4:
                    loopOn = false;
                    break;
            }
        }
    }
}
