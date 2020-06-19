package iterator_notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import javax.management.Notification;

public class FacebookNotification implements INotification{
	ArrayList lstNotification;
	//List<Notifications> lstNotification = new ArrayList<Notifications>();
	public FacebookNotification() {
		lstNotification = new ArrayList();
		AddNotification(1, "Facebook notification 1");
		AddNotification(2, "Facebook notification 2");
		AddNotification(3, "Facebook notification 3");
	}
	
	private void AddNotification(int id, String msg) {
		Notifications notification = new Notifications(id, msg);
		lstNotification.add(notification);
	}

	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return lstNotification.iterator();
	}
	
	
}
