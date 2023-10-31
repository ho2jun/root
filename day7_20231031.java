package day7;

import java.util.Arrays;
import java.util.Comparator;

public class day7_20231031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] arr = new int[5];
		// �������� : �ּҸ� ����ϸ� �迭�� ��ġ�� �ּҰ����� ��µȴ�.
		System.out.println(arr);
		
		// �迭�� ���� �߰�
		// �� �迭�� �ε����� �����ϰ� 1~5���� ���� �־��
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		System.out.println("arr[0] : "+arr[0]);
		System.out.println("arr[1] : "+arr[1]);
		System.out.println("arr[2] : "+arr[2]);
		System.out.println("arr[3] : "+arr[3]);
		System.out.println("arr[4] : "+arr[4]);
		
		// �迭�� ũ�⸦ �������.
		System.out.println("�迭�� ũ�� : "+arr.length);
		
		// �迭�� �ʱⰪ
		int [] intArray = new int[5];
		System.out.println(intArray);
		System.out.println(arr);
		String [ ] StrArray = new String[5];
		System.out.println(StrArray);
		
		int [ ] varArray = {1,2,3,4,5};
		
		// intArray ù��°�� �ι�°���� ����غ���
		System.out.println("intArray[0] = "+ intArray[0]);
		System.out.println("intArray[1] = "+ intArray[1]);
		// strArry ù��°�� �ι�°���� �������
		System.out.println("StrArray[0] = "+ StrArray[0]);
		System.out.println("StrArray[1] = "+ StrArray[1]);
		// varArray ù��°�� �ι�°���� �������
		System.out.println("varArray[0] = "+ varArray[0]);
		System.out.println("varArray[1] = "+ varArray[1]);
		
		
		// �迭 ���� 1: �迭���� �ܾ �����Ͽ� ����ϱ�
		// char [ ] �迭�� �����ϰ� = {'1','L' '0', 'v' 3, 'E'}
		char [] card = {'1','L', 'O', '2','V','3', 'E'};
		String myWord = "";
		
		//�ݺ����� �������
		for (int i = 0; i<card.length; i++) {
			//System.out.println(card[i]);
			
			int word = card [i];
			//�빮�� : 65ũ�ų� ���� ~ 90�۰ų� ���� && �ҹ��� : 97ũ�ų� ���� ~ 122 �۰ų� ����
			if((word >= 65 && word <=90) || (word >= 97 && word <=122) ) {
				myWord += (char)word;
				
			}
		}
		
		System.out.println("�ܾ� : "+ myWord);
		
		//@Array Ŭ����
		//- �迭�� ���
		
		int [] arrs = {1,6,2,3,10,7,4,5,8,9};
		// �迭�� �ִ°��� �����ϰ� ����Ѵ�
		System.out.println("���� �� �������� :"+Arrays.toString(arrs));
		
		//- �迭�� ���� (��������/��������) 
		//�������� : ���������� ���ʴ�� �����ϴ¹��
		//Arrays.sort(�迭�̸�);
		Arrays.sort(arrs);
		System.out.println("���� �� �������� :"+Arrays.toString(arrs));
		
		Integer [] arrs2 = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("���� �� �������� :"+Arrays.toString(arrs2));
		
		//�������� : ū������ ������ ���� ���ʴ�� �����ϴ� ���
		//Arrays.sort(arrs,comparator.reverseOrder());
		Arrays.sort(arrs2, Comparator.reverseOrder());
		System.out.println("�������� : "+ Arrays.toString(arrs2));
		
		//1. ���� ���� (shallow copy)
		//���� �� �迭�̳� ���� �迭�� ����ɶ� ���� ���� ���� ����ȴ�.
		//int [ ] arr01 = {1,2,3};
		//int [ ] arr02 = arr01;
		
		//int�� �迭 arr01 ������ ��� ���� �ִ´� = {1,2,3}
		int [] arr01 = {1,2,3};
		//�迭�� �������� �Ѵ�
		//���ο� �迭(arr02)�� �����ϰ� arr01 �����Ѵ�.
		int [] arr02 = arr01;
		
		//�迭�� ����Ѵ�.(arr01) = Arrays.toString(�迭�̸�)
		System.out.println("arr01 : "+ Arrays.toString(arr01));
		//arr02[1] : �ι�° �ε��� ���� 10���� �ٲ��ش�.
		arr02[1] = 10;
		//arr01�� arr02���� ����Ѵ�
		System.out.println("arr01 : "+ Arrays.toString(arr01));
		System.out.println("arr02 : "+ Arrays.toString(arr02));
		
		//2. ���� ���� (deep copy)
		//���� �� �迭�̳� ���� �迭�� ����ɶ� ���ΰ��� ���� �ٲ��� �ʴ´�.
		//- ������ �迭�� �����ϴ� ���
		//int [ ] card = {1,6,4,5,3,2};
		//int [ ] newcard = new int[card.length];
		
		int [] card01 = {1,6,4,5,3,2};
		int [] card02 = new int[card01.length];
		
		//���ο� �迭�� ���� �迭���� intsert
		
		for(int i=0; i<card01.length; i++) {
			card02[i] = card01[i];
		}
		// ���� ������ �迭�� ù��° �迭�� ���� �����Ѵ�.
		card02[0] = 100;
		//���
		System.out.println("card �迭 : "+ Arrays.toString(card01));
		System.out.println("card02 �迭 : "+ Arrays.toString(card02));
		
		// �������� 2
		//int [] card03 = Arrays.copyof(�����迭, �����迭ũ��)
		int [] card03 = Arrays.copyOf(card01, card01.length);
		
		card03[1] = 200;
		
		//���
		System.out.println("card01 �迭 : "+ Arrays.toString(card01));
		System.out.println("card03 �迭 : "+ Arrays.toString(card03));
		
		//�������� 3
		//System.arrayCopy(����, 0, ���纻, 0, �迭��ũ��)
		//�κ����� ���� ���簡 ������ ����
		
		int [] card04 = new int[card01.length-2]; //ũ�⸦ ������ŭ ������ش�
		System.arraycopy(card01, 0, card04, 0, card01.length-2);
		
		//card04[2]=300
		card04[2] = 300;
		//���
		System.out.println("card01 �迭 : "+ Arrays.toString(card01));
		System.out.println("card03 �迭 : "+ Arrays.toString(card04));
		
		//2���� �迭 ����
		int [ ] [ ] arrys = new int [3] []; // �������		
		//����ڰ� ���Ǵ�� ���� ������ ũ��� �����Ҽ��ִ�
		arrys[0] = new int [2];
		arrys[1] = new int [3];
		arrys[2] = new int [1];
		
		//2���� �迭�� �⺻���� �������� ���� ũ�⸦ ����� ���
		
		int [] [] arrys02 = new int[2][3];
		
		//2���� �迭�� ��2��3 ���� �Ҵ��غ���
		//ù��° ���� 3���� ���� ���� ������ ����
		arrys02[0][0] = 1;
		arrys02[0][1] = 2;
		arrys02[0][2] = 3;
		//�ι�° ���� 3���� ���� ���� ������ ����
		arrys02[1][0] = 11;
		arrys02[1][1] = 12;
		arrys02[1][2] = 13;	
		
		// 2���� �迭�ּҰ��� ���
		System.out.println("2�����迭 : "+ arrys02);
		//2���� �迭 ù��°���� �ּҰ��� ���
		System.out.println("2���� �迭 1�� : "+ arrys02[0]);
		//2���� �迭 �ι�°���� �ּҰ��� ���
		System.out.println("2���� �迭 2�� : "+ arrys02[1]);
		
		
		
		}
		
		
		
	}


