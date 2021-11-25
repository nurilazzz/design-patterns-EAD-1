package kz.decorator.Problem_2;

public class NotifierDecorator implements Notifier{
	Notifier notifier ;
	
	public NotifierDecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void send(String message) {
		this.notifier.send(message);
	}
}
