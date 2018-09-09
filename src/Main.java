import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int seat1, seat2;//각 항공의 총 좌석 수
		int reSeat, tranSeat;//예약할 좌석 수와 옮겨서 예약할 좌석 수
		System.out.println("ke22항공의 총 좌석수 입력:");
		seat1=scan.nextInt();
		System.out.println("oz33항공의 총 좌석수 입력:");
		seat2=scan.nextInt();
		Flight ke22=new Flight("서울","뉴욕",seat1);
		Flight oz33=new Flight("서울","뉴욕",seat2);
		
		System.out.println("ke22항공에 예약할 좌석 수 입력:");
		reSeat=scan.nextInt();
		System.out.println("oz33항공으로 옮기려고 할 좌석 수 입력:");
		tranSeat=scan.nextInt();
		
		ke22.book(reSeat);
		ke22.transfer(oz33, tranSeat);
		
		System.out.println("From: "+ ke22.getFrom());
		System.out.println("To: "+ ke22.getTo());
		System.out.println("잔여좌석: "+ ke22.available());

	}

}
