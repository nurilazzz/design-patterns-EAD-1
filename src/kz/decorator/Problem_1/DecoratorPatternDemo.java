package kz.decorator.Problem_1;

import java.util.Scanner;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("\t\t\t* Shape Selection Menu *\n\t1. Circle\n\t2. Rectangle\n\t3. Circle with Red border\n\t4. Rectangle with Red border\n\t0. Exit");
            int selection = sc.nextInt();
            if (selection == 1) {
                Shape circle = new Circle();
                circle.draw();
                System.out.println("\n");
            } else if (selection == 2) {
                Shape rectangle = new Rectangle();
                rectangle.draw();
                System.out.println("\n");
            } else if (selection == 3) {
                Shape circleRedBorder = new RedShapeDecorator(new Circle());
                circleRedBorder.draw();
            } else if (selection == 4) {
                Shape rectangleRedBorder = new RedShapeDecorator(new Rectangle());
                rectangleRedBorder.draw();
            } else if (selection == 0) {
                System.out.println("\t\t\t*** Good Bye! ***");
                bool = false;
            } else {
                System.err.println("Wrong choice! Try again\n");
            }
        }
    }
}
