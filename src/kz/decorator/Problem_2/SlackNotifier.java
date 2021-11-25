package kz.decorator.Problem_2;

public class SlackNotifier extends NotifierDecorator{
	public SlackNotifier(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSlackNotification(message);
	}
	
	public void sendSlackNotification(String message) {
		System.out.println( message + "\t\uD83D\uDD14 Slack notification");
	}
}
