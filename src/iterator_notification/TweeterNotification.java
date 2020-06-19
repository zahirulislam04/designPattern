package iterator_notification;

import java.util.Iterator;

public class TweeterNotification implements INotification {

	private int maxNotification=6;
	private int numOfNotification=0;
	private Notifications[] arrNotification;
	private TweeterNotificationIterator iterator;
	
	public TweeterNotification() {
		arrNotification = new Notifications[maxNotification];
		AddNotification(1, "Tweeter notification 1");
		AddNotification(2, "Tweeter notification 2");
		AddNotification(3, "Tweeter notification 3");
		AddNotification(4, "Tweeter notification 4");
		AddNotification(5, "Tweeter notification 5");
	}
	
	public void AddNotification(int id, String msg) {
		Notifications notification = new Notifications(id, msg);
		if (numOfNotification>=maxNotification) {
			System.out.println("maximum limit of tweeter notification has reached");
		}
		else {
			arrNotification[numOfNotification] = notification;
			numOfNotification += 1;
		}
	}
	
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new TweeterNotificationIterator(arrNotification);
	}

}
