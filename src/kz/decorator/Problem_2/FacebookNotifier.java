package kz.decorator.Problem_2;

public class FacebookNotifier extends NotifierDecorator{
	public FacebookNotifier(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendFacebookNotification(message);
	}
	
	public void sendFacebookNotification(String message) {
		System.out.println( message + "\t\uD83D\uDD14 Facebook notification");
	}
}
