import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int seat1, seat2;//�� �װ��� �� �¼� ��
		int reSeat, tranSeat;//������ �¼� ���� �Űܼ� ������ �¼� ��
		System.out.println("ke22�װ��� �� �¼��� �Է�:");
		seat1=scan.nextInt();
		System.out.println("oz33�װ��� �� �¼��� �Է�:");
		seat2=scan.nextInt();
		Flight ke22=new Flight("����","����",seat1);
		Flight oz33=new Flight("����","����",seat2);
		
		System.out.println("ke22�װ��� ������ �¼� �� �Է�:");
		reSeat=scan.nextInt();
		System.out.println("oz33�װ����� �ű���� �� �¼� �� �Է�:");
		tranSeat=scan.nextInt();
		
		ke22.book(reSeat);
		ke22.transfer(oz33, tranSeat);
		
		System.out.println("From: "+ ke22.getFrom());
		System.out.println("To: "+ ke22.getTo());
		System.out.println("�ܿ��¼�: "+ ke22.available());

	}

}
