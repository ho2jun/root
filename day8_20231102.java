package day8;


// ����� Ŭ���� : main �ż��带 ������ Ŭ���� ������ �����ϸ� ���������.
//				���α׷� ������ �ð� �ִ� Ŭ������.
public class day8_20231102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ŭ���� ����
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		// Ŭ���� �߰� (Tree��� Ŭ������ �����ϰ� ��ü���� tree�� ����)
		Tree tr1 = new Tree();
		tr1.leaf = "red";
		Tree tr2 = new Tree();
		
		//��ü : �ν��Ͻ�ȭ
		Tv tv1 = new Tv(); //TV ��ü�� ����Ѵ�
		Tv tv2 = new Tv(); //TV ��ü�� ����Ѵ�
		
		tv1.channel = 7;
		tv2.channeldown(); // �Ҹ��� 6���� �پ���.
		
		System.out.println("t1 ���� ������"+ tv1.channel+"�Դϴ�.");
		System.out.println("t1 ���� ������"+ tv2.channel+"�Դϴ�.");
		
		//tv1�� ��ü�� �ּҰ��� tv2 �ּҰ����� �ٲ��ش�.
		
		tv2 = tv1; //x200-->x100(tv1 ���� �ּ��� �޸𸮸� �����Ѵ�)
		System.out.println("t1 ���� ������"+ tv1.channel+"�Դϴ�.");
		System.out.println("t1 ���� ������"+ tv2.channel+"�Դϴ�.");
		
		// �ܺ����� class ���赵�� �̿��� ��ü ����
		Car_option car_ = new Car_option();
		car_.whell_gold = 2;
		System.out.println("�ڵ��� ����"+car_.whell_gold+"�Դϴ�");
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		
		//���� ����� static (�ν��Ͻ�/����/����) ������ �����Ѵ�.
		System.out.println("card.widht = " +Card.width);
		System.out.println("card.height = " +Card.height);
		
		Card ca1 = new Card(); //��ü ����
		ca1.kind = "Heart";
		ca1.number = 7;

		Card ca2= new Card(); //��ü ����
		ca2.kind = "spade";
		ca2.number = 4;
		
		System.out.println("ca1�� "+ca1.kind+", "+ca1.number+"�̸� "+ca1.width+", "+ca1.height);
		
		//�޸𸮰� ����ɶ����� ����ִ� !
		printHello();
		
		//�޼ҵ� ���� : ��� �޼ҵ�
		// 1. ������ ��ü�� �����Ѵ�.
		jogger jo = new jogger();
		// 2. ������ �̸�(�������)�� �� �̸����� �����Ѵ�.
		jo.name = "��ȸ��";
		// 3. ���Ÿ� �޸����Ѵ�.
		jo.run();
		// 4. ������ �̸��� ���ϰ� �Ѵ�.
		jo.sayName();
		
		// �޼ҵ� ���� : static �޼ҵ�
		// ��ȯ�� ���� �޼��带 printgoodbye��� ����� �߰���� �̾߱� �Ѵ�.
		
		
		
		
		
		
	}
	
	static void printHello() { //���� �޼��� (Ŭ������ ����ɶ� �޸𸮿� �޼ҵ尡 �ö󰣴�)
		System.out.println("������");
		System.out.println("�����ϰ��ֱ���");
		
	}
	static void printgoodbye() {
		System.out.println("�߰�");
	}
}


// ���̺귯�� Ŭ���� : ����� Ŭ������ �׻� 1�� �̸鼭 ������ ������� Ŭ����
class bus {
	void take(int m) {
		while (m < 3000) {
			System.out.println("����ī�� �����Ϸ� ���ϴ�");
			return;
		}
		System.out.println("������ ž�ϴ�");
		m -= 1250;
	}

}

class jogger{
	String name;
	void run() {
		System.out.println("�޸����־� ������");
	}
	//��ü�� �����ؼ� ����� �� �ִ� �޼��� : ����Լ�/����޼ҵ�--->heap ����
	void sayName() {
		System.out.println("�� �̸��� "+name+"�Դϴ�");
	}
}

class Card{
	String kind; // ���
	int number; // ī���ȣ
	static int width =100; // ����
	static int height = 250; // ����
}


class Tv{
	String color;
	boolean power;
	int channel;
	void power( ) { power = !power; } //���� ��� : �����ִ� 
	void channelup( ) { ++channel; }  
	void channeldown( ) { --channel; }
}

class Car{
	
}

class Tree{
	String leaf = "green";
}