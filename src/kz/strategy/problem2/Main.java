package kz.strategy.problem2;

import kz.strategy.problem2.strategies.BoatTravellingStrategy;
import kz.strategy.problem2.strategies.CarTravellingStrategy;
import kz.strategy.problem2.strategies.PlaneTravellingStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Context context = new Context();
        int choice = -1;
        while (choice != 0) {
            System.out.println("PLEASE CHOOSE TRAVELLING STRATEGY:\n" +
                    "PRESS[1] TO TRAVEL BY BOAT\n" +
                    "PRESS[2] TO TRAVEL BY CAR\n" +
                    "PRESS[1] TO TRAVEL BY PLANE\n" +
                    "PRESS[0] TO EXIT");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    context.setTravellingStrategy(new BoatTravellingStrategy());
                    context.travel();
                    break;
                case 2:
                    context.setTravellingStrategy(new CarTravellingStrategy());
                    context.travel();
                    break;
                case 3:
                    context.setTravellingStrategy(new PlaneTravellingStrategy());
                    context.travel();
                    break;
                default:
                    System.out.println("PRESS ONLY 1,2,3");
            }
        }
    }
}
