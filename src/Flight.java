public class Flight {
	private String from;//출발지
	private String to;//도착지 
	private int total=0;//전체 좌석 수 
	private int reserved;//예약된 좌석 수
	
	public Flight(String from,String to,int total) {//생성자
		this.from=from;
		this.to=to;
		this.total=total;
	}
	
	public String getFrom() {//출발지 getter
		return from;
	}
	
	public String getTo() {//도착지 getter
		return to;
	}
	
	public int available() {//빈 좌석 수를 알려주는 메소드
		return this.total-this.reserved;
	}
	
	public void book(int seat) {//좌석 수를 매개변수로 받아 그 수만큼 좌석 수 예약
		if(total>=seat) {
			reserved=seat;
		}
		else
			System.out.println("좌석수가 모자랍니다.");
	}
	
	public void transfer(Flight f, int seat) {//다른 항공 노선과 좌석수를 매개변수로 받아 그 수만큼의 자신의 예약 좌석을 다른 항공 노선으로 옮김
		if(reserved>=seat) {
			reserved-=seat;
			f.reserved=seat;
			f.total-=f.reserved;
		}
		else
			System.out.println("좌석수가 모자랍니다.");
	}

}
