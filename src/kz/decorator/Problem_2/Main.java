package kz.decorator.Problem_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		Notifier smsNotifier = null;
        Notifier facebookNotifier = null;
        Notifier slackNotifier = null;
		int smsTurn = 0;
		int facebookTurn = 0;
		int slackTurn = 0;
        ArrayList<Notifier> arrNotifiers = new ArrayList<>();
		while (bool) {
			System.out.println("\t\t\t* NOTIFICATION APP MENU *\n\t1. SMS Notifier \t\t(Turn ON/Turn OFF)\n\t2. Facebook Notifier \t(Turn ON/Turn OFF)\n\t3. Slack Notifier \t\t(Turn ON/Turn OFF)\n\t4. Send notification\n\t0. EXIT");
			int selection = sc.nextInt();
			if (selection == 1) {
				if (smsTurn == 0) {
					smsNotifier = new SMSNotifier(new NullNotifier());
                    arrNotifiers.add(smsNotifier);
					smsTurn += 1;
                    System.out.println("\t---------- SMS Notifier = Turn ON ----------\n");
				} else {
					arrNotifiers.remove(smsNotifier);
                    smsTurn -= 1;
                    System.err.println("\t---------- SMS Notifier = Turn OFF ----------\n");
				}
			} else if (selection == 2) {
                if (facebookTurn == 0) {
                    facebookNotifier = new FacebookNotifier(new NullNotifier());
                    arrNotifiers.add(facebookNotifier);
                    facebookTurn += 1;
                    System.out.println("\t---------- Facebook Notifier = Turn ON ----------\n");
                } else {
                    arrNotifiers.remove(facebookNotifier);
                    facebookTurn -= 1;
                    System.err.println("\t---------- Facebook Notifier = Turn OFF ----------\n");
                }
			} else if (selection == 3) {
                if (slackTurn == 0) {
                    slackNotifier = new SlackNotifier(new NullNotifier());
                    arrNotifiers.add(slackNotifier);
                    slackTurn += 1;
                    System.out.println("\t---------- Slack Notifier = Turn ON ----------\n");
                } else {
                    arrNotifiers.remove(slackNotifier);
                    slackTurn -= 1;
                    System.err.println("\t---------- Slack Notifier = Turn OFF ----------\n");
                }
			} else if (selection == 4) {
                System.out.println("Enter your notification text:");
                String text = sc.next();
                System.out.println();
                for (Notifier objects : arrNotifiers) {
                    objects.send(text);
                }
                System.out.println();
			} else if (selection == 0) {
				System.out.println("\t\t\t\t*** Good Bye! ***");
				bool = false;
			} else {
				System.err.println("\t\t\tWrong choice! Try again\n");
			}
		}
	}
}
