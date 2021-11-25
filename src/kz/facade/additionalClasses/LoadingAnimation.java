package kz.facade.additionalClasses;

import java.util.Random;

public class LoadingAnimation {
    public static void animate(String str){
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
                Thread.sleep(599);
                count++;
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
