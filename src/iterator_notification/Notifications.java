package iterator_notification;

public class Notifications {
	private int id;
	private String msg;
	
	public Notifications(int id, String msg) {
		this.id = id;
		this.msg = msg;
	}
	
	public int GetNotificationId() {
		return this.id;
	}
	
	public String GetNotificationMessage() {
		return this.msg;
	}
}
