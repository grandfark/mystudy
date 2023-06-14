package ex05.constructor;

public class TV {	
	private int channel;//멤버변수
	private String color;
	
	public TV() { //tv객체 생성
		channel = 17;
		color = "black";
	}
	
	public void setData(int channel, String color) {//값변경이 적을때만 사용하면 괜찮으나 가능한한 사용하지 말것
		this.channel = channel;
		this.color = color;
	}
	
	
	public TV(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	public TV(String color) {
		this.color = color;
	}
	
	public TV(int channel) {
		this.channel = channel;
		color = "red";
	}
	
	//getter, setter : getter외부로 표현 setter 외부의 변경값 수용 함수
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void display() {
//		System.out.println(getChannel()+", "+getColor());
		System.out.println(channel + ", " + color);
	}
	
	/*
	public String color, channel;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public void TVoutput() {
		System.out.println("TV의 색 : "+color+", TV의 채널 : "+channel);
	}
	*/
}
