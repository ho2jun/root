package day5;

public class day05_20231024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//���빮�� 3-3 (��������ڷ� ���� �ٲ㼭 ����ϴ� ����)
		int num = 456;
		//456 1
		System.out.println(456/100*100);
		//������ : 400
		//�ڸ�����ŭ�� ������ �������� ����� ������ �ڸ�����ŭ�� ���ؼ� = ������ ���� �����
		
		
		System.out.println();
		//���빮�� 3-4
		int apple = 123; // ����� ����
		int apple_bucket = 123/10; // ����� ���� �ڷ��
		int bucket = apple%10; // ����� ��������
		
		if(bucket>0) {
			apple_bucket += 1;
		}
		
		System.out.println("�ʿ��� �ٱ����� �� : "+ apple_bucket);
		
		System.out.println();
		// ���빮�� 3-5
		int num1 = 10;
		// ���׿����� - �ڵ尡 ������� - �����ϰ� ������ ����� ���ؼ� ����
		System.out.println(num1>0?"���":(num1<0?"����":0));
		
		
		System.out.println();
		//�ݺ���
		// ���� 1: for���� �̿��ؼ� 1���� 5���� �������
		// ��°��
		// 1
		// 2
		// 3
		// 4
		// 5
		// 12345
		
		int num2 = 1;
		
		
		for(int i = 1; i<=5; i++) { // 1<=5 2<=5 3<=5 4<=5 5<=5
			System.out.println(i);
		}
		for(int i = 1; i<=5; i++) { // 1<=5 2<=5 3<=5 4<=5 5<=5
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("�ѤѤѤѤѤѤѤ�");
		// ���� : 1~10 �ȿ��� �Ѱ��� ���ڰ� �������� �ϳ� ����Ѵ�
		
		for (int i=1; i<=5; i++) {
		int value = (int)(Math.random()*10000)+1;
		System.out.println(value);
		}
		
		System.out.println("");
		System.out.println("�ݺ���");
		// ���� 3 : 1���� 100���� �ݺ��ϸ鼭 ¦���� ���غ���
		// ¦���� ���ð�� �հ踦 ���Ҽ��ִ� ������ ��������
		
		int sum = 0;
		// �ݺ����� ������ (�ʱⰪ, ���ǽ�, ������) ���ǽ� : 1~100���� ���
		// 1) �������� 2�� �����ϸ鼭 �ղ��� ����غ���
		for(int i = 2; i <=100; i+=2) {
			//System.out.print(i+", ");
			// sum = sum + i; 0+2+4+6~
			sum = sum + i;
		}
		System.out.println(sum);
		

		
		// if���ǹ����� 2�� ������ �������� 0�� ���
		// 1~100 ���� �ݺ��ϰ� �������� ¦���� �Ǵ� ��츦 �������� �����Ű��
		
		sum = 0;
		
		//for(int i = 1; i <=100; i++) {
			// ¦���� ��� �հ踦 ������ i % 2 == 0 (true = ¦��)
			
			//if (i % 2 == 0) {
				//sum += i;
		//}
		//System.out.println(sum);
		
		//��øfor�� : �ܺ� �ݺ����� ���� �ݺ��� ������ ������ �����Ѵ�. �ܺ� �ݺ����� ������ ������
		// ��� for���� ����ȴ�.
		
		System.out.println("#############");
		// ���� 1
		// 1. 1�� �ݺ��� (for���� 1���� �̿�) ������ 2���� �ڵ�� ����� ����.
		// 2*1=2
		// 2*2=2
		// 2*3=2
		// 2*4=2
		// 2*5=2
		// 2*6=2
		// 2*7=2
		// 2*8=2
		// 2*9=2
		
		for (int i=1; i<=9; i++) {
			//System.out.println(i);
			System.out.println("2 * "+i+" = "+(2*i));
			}
		
		System.out.println("#############");
		//���� 2 :
		// 1. 2�� �ݺ��� ������ 2�� ~ 9���� �ڵ�� ������.
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 2*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 3*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 4*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 5*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 6*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 7*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 8*/1/2/3/4/5/6/7/8/9
		// �ܺ� �ݺ��� (2~9) ���� �ݺ���(1~9) : 9*/1/2/3/4/5/6/7/8/9
		
		for (int i=2; i <=9; i++) {
			// 2*1=2 //3*1=3 //4*1=4
			for(int j=1; j<=9; j++) {
				System.out.print(i+" * "+ j + " = "+ (i*j)+ " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#############");
		
		//���� 3�� �����
		// 1) 1�� �ݺ������� ���� ����
		// *
		for (int i= 1; i<=1; i++) {
			System.out.print("*");
		} System.out.println();
		// **
		for (int i= 1; i<=2; i++) {
			System.out.print("*");
		} System.out.println();
		// ***
		for (int i= 1; i<=3; i++) {
			System.out.print("*");
		} System.out.println();
		// ****
		for (int i= 1; i<=4; i++) {
			System.out.print("*");
		} System.out.println();
		// *****
		for (int i= 1; i<=5; i++) {
			System.out.print("*");
		} System.out.println();
		
		System.out.println();
		System.out.println("#############");
		// 1) 2�� �ݺ������� ���� ���� (�ܺ� for�� : 1�� / ���� for�� : 1)
		// *
		// **
		// ***
		// ****
		// *****

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("�ǽ� 3");
		//�ǽ� 3
		for (int i = 1; i<= 5; i++) {
			for (int j = 5; i>=j; j--);
			System.out.print("*");
		}
		System.out.println();
}
}