package iterator_notification;

import java.util.Iterator;

public class TweeterNotificationIterator implements Iterator{
	private int position=0;
	private Notifications[] notification;
	
	public TweeterNotificationIterator(Notifications[] notification) {
		// TODO Auto-generated constructor stub
		this.notification = notification;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (notification[position] == null || position >= notification.length) {
			return false;
		}
		else {			
			return true;			
		}
		
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Notifications notf = notification[position];
		position += 1;
		return notf;		
	}

}
