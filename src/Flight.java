public class Flight {
	private String from;//�����
	private String to;//������ 
	private int total=0;//��ü �¼� �� 
	private int reserved;//����� �¼� ��
	
	public Flight(String from,String to,int total) {//������
		this.from=from;
		this.to=to;
		this.total=total;
	}
	
	public String getFrom() {//����� getter
		return from;
	}
	
	public String getTo() {//������ getter
		return to;
	}
	
	public int available() {//�� �¼� ���� �˷��ִ� �޼ҵ�
		return this.total-this.reserved;
	}
	
	public void book(int seat) {//�¼� ���� �Ű������� �޾� �� ����ŭ �¼� �� ����
		if(total>=seat) {
			reserved=seat;
		}
		else
			System.out.println("�¼����� ���ڶ��ϴ�.");
	}
	
	public void transfer(Flight f, int seat) {//�ٸ� �װ� �뼱�� �¼����� �Ű������� �޾� �� ����ŭ�� �ڽ��� ���� �¼��� �ٸ� �װ� �뼱���� �ű�
		if(reserved>=seat) {
			reserved-=seat;
			f.reserved=seat;
			f.total-=f.reserved;
		}
		else
			System.out.println("�¼����� ���ڶ��ϴ�.");
	}

}
