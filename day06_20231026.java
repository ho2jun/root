package day6;

import java.util.Scanner;

public class day06_20231026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// ���� 3-6
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("fahrenheit : "+ fahrenheit);
		System.out.println("celcius : " + celcius);
		
		// 4-1�� ����
		// if���� ����ϱ����� ������������ �������� ���ǽ�
		// 1. int�� ���� x�� 10���� ũ�� 20���� ������ true
		int x = 15;
		System.out.println(10<x && 20>x);
		// 2. char�� ���� ch�� �����̳� ���� �ƴҶ� true
		char ch = '3';
		System.out.println(!(ch == ' ' || ch=='\t'));
		// 3.char�� ���� ch�� ����('0'~'9')�϶� true�� ���ǽ�
		System.out.println('0'<= ch && ch<= '9');
		// ||(or)������ = ���������� = ������ �ϳ��� ��¥�� ��¥
		char ch1 = 'a';
		System.out.println(('a'<= ch1 && 'z'>=ch1));
		
		// int�� ���� year(�⵵)�� 400���� ���� �������ų� �Ǵ� 4�� ������������
		// 100���δ� ���� �������� ������
		int year = 2023;
		System.out.println((year%400 != 0)||(year%4 == 0 && year%100!=0));
		
		// ���ڿ� �������� str "yes"�� �� true�� ���ǽ�
		String str = new String();
		str.equals("yes");
		"yes".equals(str);
		System.out.println(str.equals("yes"));
		
		// ���� 4-2 
		// 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		
		int sum = 0; //����
		
		for(int i=1; i<=20; i++) {
			//i�� 2�Ǵ� 3�� ����� �ƴҶ��� sum ++(1������)
			if (i%2 == 0 || i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// ���� 4-3 1+(1+2)+(1+2+3)+(1+2+3+4+)+.........+(1+2+3+...+10)
		
		int sum_ = 0;
		int total_ = 0;
		for(int i=1; i<=10; i++) {
			
			sum_ += i;
			total_ = sum_ + i;
		}
		System.out.println("total_sum = " + total_);
		
		// ����5) 1+(-2)+3+(-4)+5+(-6).... = 100�̻��� �ɶ� ���ߴ°�
		// 100 ���� ���ų� ũ�� �ݺ����� ���� ������.
		// for ������ ������ ���� �ٲ㼭 ��ȣ(+) (-)
		// �ݺ����� ������ ���׿����ڸ� �̿��ؼ� ��ȣ�� �ٲ��ش�
		// ������ + 1 =-1 ������-1=1 
		int s = 1;
		int sum5 = 0;
		int num = 0;
		for(int i=1; true; i++,s=-s) { //1, -1, -(-1)=1, -1,-(-1)=1
			
			num = s*i;
			sum5 += num;
			
			if(sum5>=100) {
				break;
			}
			
		}
		
		System.out.println("num = "+num);
		System.out.println("sum = "+sum);
		
		// ���� 4-7 ���ڷ� �̷���� ���ڿ� str "12345" fullname = 1+2+3+4+5
		// 15��� �������
		String str7 = "12345";
		
		System.out.print(str7.length());
		int sum7 = 0;
		for(int i = 0; i< str7.length(); i++) {
			sum7 += str7.charAt(i)-'0'; // ���� ��ü '0'�� ����� ���ڷ� �ٲܼ� �ִ�.
		}
		System.out.println("sum = "+sum7);
		
		// whule ���� 1
		// �ʱⰪ X ������ X
		// I can do it
		// I can do it
		// I can do it
		// I can do it
		// I can do it
		//�� 5�� ������� (�ʱⰪ�� 0���� �ϰ� ������)
		
		int k = 0;
		while (k<5) {
			System.out.println("I can do it");
			k++; //��������
		}
		
		System.out.println();
		// while ���� 2
		// 1���� ����� ���ؾ� 100�� ���� ������?
		// 1. ������ ���� �������� �����
		// 2. ������ ���� 100�̶� ���ؼ� 100�̻��� �Ǵ��� Ȯ���ϰ� ������ OUT (fales)
		int sum2 = 0;
		int i = 0;
		while(sum2<=100) {
			System.out.println(i+ " - "+sum2);
			sum2 += ++i;
			
		}
		
		// do-while ����1
		// 1�� 100������ ������ �Է��ϰ� ������ �ƾƳ��� ����
		// ���شٿ� ������ ������
		// ���شٿ� : ���ڸ� �������� ����� ���ڸ� �˾Ƴ��°���
		
		// 1. �������� ���ڸ� �����Լ��� ����.
		int answer = (int) (Math.random()*100)+1;
		int input = 0;
		
		// 2. ��ĳ�ʷ� �ݺ��ϸ鼭 ���ڰ� ������������ ��� �Է��Ѵ�.
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���");
			input = scanner.nextInt();
			// 3. �Է��� ���ڰ� �������� ������ ������ ũ�� ��� �˷��ش�.
			// 4. �Է��� ���ڰ� �������� Ů�� ������ �۴� ��� �˷��ش�.
			if(input>answer) {
				System.out.println("�� �������� �ٽ� �õ��Ͻÿ�");
			}else if (input<answer) {
				System.out.println("�� ū���� �ٽ� �õ��Ͻÿ�");
			}
			
		}while(input!=answer);

		// 5. ������ ���߸� �������� �����Դϴ� ��� �˷��ش�.
		System.out.println("�����Դϴ�");
		*/
		
		System.out.println();
		// continue : �ݺ��� ����Ǵ� ���� ���ǿ� �ش��ϴ� �κп� �־��ش�.
		// ���� 1 : 1���� 10���� �ݺ����� ����Ѵ�
		// 3�� ����϶��� continue ����
		// 1 2 4 5 7 8 10 : ����Լ��� �Ʒ� ���� if�� �̸� ó���ؼ� continue ���
		for (int y=1; y<=10; y++) {
			if(y%3==0) {
				continue;
			}
			System.out.println(y);
		}
		
		System.out.println();
		// break���� 1
		// 1. while ������ ����ϰ� sum �հ谡 100�� �Ѿ�� break;
		int sumz = 0;
		int z = 0;
		while(true) {
			//if������ ó���ؼ� break
			if(sumz>100) {
				break;
			}
			++z; // �����Լ��� ����ڰ� ���� ������Ų��.
			sumz += z;
		}
		System.out.println("z = "+ z);
		System.out.println("sumz = "+ sumz);
		
		// ��� ����
		// z = 14 // ��� �ݺ� �����ߴ���
		// sumz = 105 
		

	}

}
