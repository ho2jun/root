package class01;
import java.util.Scanner;

public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2���� �ڹ� ����
		
		//�Ҽ� : float /double = �⺻���� ����Ʈ
		// float - 7�ڸ�, double - 15�ڸ�
		//�Ҽ� : ���е�(=ǥ���ϴ� ���)
		
		//�������� �������� �����ϰ� double �� �ڷ����� ��������.		
		double marathon= 42.195;
		//���� ������ �������� �����ϰ� float�� �ڷ����� ��������.
		float halfmarathon = 21.0945f;
		
		
		System.out.println("�������� " + marathon + "Km�� �޸��ϴ�");
		System.out.println("������������ " + halfmarathon + "Km�� �޸��ϴ�");
		
		
		//3.14(�����Ҽ���) = 3.141592653589793
		
		double piedouble = 3.141592653589793;
		float piefloat = 3.141592653589793f;
		
		System.out.println("double : " + piedouble);
		System.out.println("double : " + piefloat);
		
		//������ �ҽ��ڵ�
		//char '��';(ĳ���� �ѱ��ڸ� ǥ��)
		//char �ڷ����� ���� alphabetA = 'A'����
		//char �ڷ����� ���� alphabetB = 'B'����
		//��� -> A=65 B=66
		
		
		int alphabetA = 'A';
		int alphabetB = 'B';
		char alphabetC = 'C';
		char alphabetD = 'D';
		
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		System.out.println(alphabetC);
		System.out.println(alphabetD);
		
		
		//�⺻���� boolean = 1byt = true/false
		
		//�л��̶�� �����̸��� ����� boolean���� �����ϰ�
		//����Ҷ� �л��� �´� (=true/false)��� ������ ��������
		
		boolean student = true;
		boolean notstudent = false;
		
		System.out.println(notstudent);
		
		//�ڵ� �� ��ȯ
		//char -> short -> int -> long
		//���� -> �Ҽ� 
		//int �� num1 �����Ѵ� 14�� ���� �����ϼ���
		//double num2 �����ϰ� num1 �����ϼ���
		//num2 ������ ����Ʈ ����.
		
		int num1 = 14;
		double num2 = num1;
		
		System.out.println(num2);
		
		// ��������ȯ
		int num3 = 10;
	    byte num4 = (byte)num3;
	    
	    System.out.println(num4); // �ս��� ����. ���� ���� 27-1 127
	    
	    
	    int num5 = 1000;
	    byte num6 = (byte)num5;
	    
	    System.out.println(num6); // �ս��� �ִ�. �ڷ����� �ش��ϴ� byte
		
	    
	    //�Է� �ޱ� : new Scanner(System.in);
	    
	    //Scaneer ��ü ����
	    
	    
	    Scanner input = new Scanner(System.in);
	    
	    //�Է� �ޱ�
	    //�̸� �ּ� ���� ü���� ��ĭ���� �����ؼ� �Է¹ް� ����ϱ�
	    
	    
	    System.out.println("�̸� �ּ� ���� ü���� ��ĭ���� �����ؼ� �Է¹ް� ����ϱ�");
	    
	    //�̸� �ּ� = String
	    //���� = int
	    //ü�� = double
	    
	    String name, address;
	    int age;
	    double weight;
	    
	    name = input.next();
	    address = input.next();
	    age = input.nextInt();
	    weight = input.nextDouble();
	    
	    System.out.println("����� �̸��� "+ name +"�Դϴ�");
	    System.out.println("����� �ּ� "+ address +"�Դϴ�");
	    System.out.println("����� ���� "+ age +"�Դϴ�");
	    System.out.println("����� ü���� "+ weight +"�Դϴ�");
	    
		

	} 

}
