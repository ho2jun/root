package day4;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class day04_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		if��
		score ������ ���� 60�� �ְ�
		score ������ 60���� Ŭ��� �հ� �Դϴ�. ���
		
		int score = 60;
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}
		
		System.out.println();
		// ��ĳ�� �̿� : input
		// ���̸� �Է��ϼ��� ��� ����ϰ� �Է��մϴ�.
		// ���̰� 19���� Ŭ���� �����Դϴٶ�� ����غ�����
		
		//System.out.println("���̸� �Է��ϼ���");
		//Scanner scanner = new Scanner(System.in);
		
		//int age = scanner.nextInt(); //�Է¹��� ������ �޴´�
		//if(age > 19) {
			//System.out.println("���� �Դϴ�");
		//}
		
		
		System.out.println();
		// 2)if-else : ���ǽĿ� ���� ������ �����ؾ��ϴ� ��ɹ��̴�.
		// number ������ �����ϰ� 5�� �����Ѵ�.
		// 5�� 4���� Ŭ��� ũ�ٶ�� ����ϰ� �ƴҰ�� �۴ٶ�� ���
		
		int number = 5;
		if(number > 4) {
			System.out.println("5�� 4���� ũ��");
		}else {
		System.out.println("5�� 4���� �۴�.");
		}

		System.out.println();
		//a��b�� ���ؼ� ū���� ��� max�ȿ� ������ �����Ѵ�.
		//�������� �ƽ��� ���� ���ִ� ������ max �ִ밪�� ����Ѵ�.
		//if-else ó���ؼ� ����� ������
		
		int a = 4;
		int b = 10;
		int max = 0;
		
		//������ a > b�� ������ ��Ƽ� ���ǹ����� �����.
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("a:"+a+"�� b:"+b+"�߿��� ū����"+max+"�Դϴ�.");
		
		
		System.out.println();
		// else-if : ���ǽ��� ������ ������ ����Ѵ�.
		// ����1: �����ϴ� �����Ѵ�. = ������ �ִ´�
		// 1) �����ϴ� ���ڰ� 5���� Ŭ���� "�����ϴ� ���ڰ� 5���� Ů�ϴ�."
		// 2) �����ϴ� ���ڰ� 7��쿡�� "�����ϴ� ���ڴ� 7�Դϴ�" ��� ���
		
		int fav = 3; // 7�� ������ �ִ´�
		
		if(fav == 7) {
			System.out.println("�����ϴ� ���ڰ� 5���� Ů�ϴ�.");
		}else if(fav > 5);{
			System.out.println("�����ϴ� ���ڴ� 7�Դϴ�.");
		//}else {
			//System.out.println("�����ϴ� ���ڰ� 5���� �۽��ϴ�");
		//}
		
		System.out.println();
		//����2 : ������ �Է��Ѵ�.
		//90���� ũ�ų� ������ = "A"
		//80���� ũ�ų� ������ = "B"
		//70���� ũ�ų� ������ = "C"
		//�������� = "D" 
		
		//Scanner input = new Scanner(System.in);
		//int score_ = input.nextInt();
		
		//if(score_ >= 90) {
			//System.out.println("A");
		//}else if(score_ >= 80){
			//System.out.println("B");
		//}else if(score_ >= 70){
			//System.out.println("C");
		//}else {
		//	System.out.println("D");
		//}
		
		//@swtich�� : if���� �Ǵ� (true/false)�� ���� ���๮�� �����Ǿ��ٸ�
		//swtich ���� ������ ���� ���� ���๮�� �����ȴ�
		//��°�� : number 7 �Դϴ�. �������
		// case 1 : number 1 �Դϴ� / case 7 : number 7 �Դϴ� / default : �Ѵ� �ƴϴ�
		
		int result = 7;
		
		switch(result){
			case 1:
				System.out.println("number 1");
				break;
			case 7:
				System.out.println("number 7");
				break;
			default:
				System.out.println("�Ѵ� X");
		}
		
		
		System.out.println();
		//���� 2 : ���� �Է��ϰ� ������ �������
		// case�� 3������ 11������ ���� ������ ����� ����
		// �� �������� " ���� ������ -�Դϴ�."
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�");
		int num =sc.nextInt();
		
		switch(num) {
		case 3,4,5:
			System.out.println("�� �Դϴ�");
			break;
		//case 4:
			//System.out.println("�� �Դϴ�");
			//break;
		//case 5:
			//System.out.println("�� �Դϴ�");
			//break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� �Դϴ�");
			break;
		//case 7:
			//System.out.println("���� �Դϴ�");
			//break;
		//case 8:
		//	System.out.println("���� �Դϴ�");
			//break;
		case 9: case 10: case 11:
			System.out.println("���� �Դϴ�");
			break;
		//case 10:
			//System.out.println("���� �Դϴ�");
			//break;
		//case 11:
			//System.out.println("���� �Դϴ�");
			//break;
		default:
			System.out.println("�ܿ� �Դϴ�");
		}
		
		//����3 : ��ĭ�� �ڵ带 swich������ ��������
		*/
		int a1 = 25;
		
		switch(a1/10) {
		case 2:
			System.out.println("a�� 20 �̻��� ���� �Դϴ�");
		}
		
		
}
}

