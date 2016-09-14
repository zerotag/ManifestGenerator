package engine;

public class MonitorMessage {
	private final String time;
	private final String msg;

	public MonitorMessage(String time, String msg) {
		this.time = time;
		this.msg = msg;
	}

	public String getTime() {
		return time;
	}

	public String getMsg() {
		return msg;
	}
}
