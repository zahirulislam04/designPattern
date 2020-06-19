package iterator_notification;

import java.util.Iterator;

public class NotificationManager {
	INotification tNotify;
	INotification fNotify;
	public NotificationManager(INotification tNotf,INotification fNotf) {
		this.tNotify = tNotf;
		this.fNotify = fNotf;
	}
	
	public void PrintNotification() {
		Iterator tweeter = tNotify.CreateIterator();
		Iterator facebook = fNotify.CreateIterator();
		System.out.println("Printing Tweeter Notification");
		PrintNotification(tweeter);
		System.out.println("=============");
		System.out.println("Printing Facebook Notification");
		PrintNotification(facebook);
	}
	
	private void PrintNotification(Iterator tweeter) {
		Notifications notification;
		while (tweeter.hasNext()) {
			notification = (Notifications)tweeter.next();
			System.out.println("Id is :" + notification.GetNotificationId());
			System.out.println("Message is :" + notification.GetNotificationMessage());
		}
	}
}
