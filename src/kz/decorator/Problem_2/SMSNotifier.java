package kz.decorator.Problem_2;

public class SMSNotifier extends NotifierDecorator{
	public SMSNotifier(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSMSNotification(message);
	}
	
	public void sendSMSNotification(String message) {
		System.out.println( message + "\t\uD83D\uDD14 SMS notification");
	}
}
