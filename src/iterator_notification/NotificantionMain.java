package iterator_notification;

public class NotificantionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TweeterNotification tNotify = new TweeterNotification();
		FacebookNotification fNotify = new FacebookNotification();
		NotificationManager notifyManager = new NotificationManager(tNotify,fNotify);
		notifyManager.PrintNotification();

	}

}
