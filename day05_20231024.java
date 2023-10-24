package day5;

public class day05_20231024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//응용문제 3-3 (산술연산자로 값을 바꿔서 출력하는 예제)
		int num = 456;
		//456 1
		System.out.println(456/100*100);
		//실행결과 : 400
		//자리수만큼을 나눠서 묶음으로 만들고 묶음에 자리수만큼을 곱해서 = 버림에 대한 결과값
		
		
		System.out.println();
		//응용문제 3-4
		int apple = 123; // 사과의 개수
		int apple_bucket = 123/10; // 사과를 담은 자루수
		int bucket = apple%10; // 사과의 나머지수
		
		if(bucket>0) {
			apple_bucket += 1;
		}
		
		System.out.println("필요한 바구니의 수 : "+ apple_bucket);
		
		System.out.println();
		// 응용문제 3-5
		int num1 = 10;
		// 삼항연산자 - 코드가 길어진다 - 간단하게 조건을 물어보기 위해서 쓴다
		System.out.println(num1>0?"양수":(num1<0?"음수":0));
		
		
		System.out.println();
		//반복문
		// 문제 1: for문을 이용해서 1부터 5까지 출력하자
		// 출력결과
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
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 랜덤 : 1~10 안에서 한가지 숫자가 무작위로 하나 출력한다
		
		for (int i=1; i<=5; i++) {
		int value = (int)(Math.random()*10000)+1;
		System.out.println(value);
		}
		
		System.out.println("");
		System.out.println("반복문");
		// 문제 3 : 1부터 100까지 반복하면서 짝수를 구해보자
		// 짝수가 나올경우 합계를 구할수있는 변수를 정의하자
		
		int sum = 0;
		// 반복문을 만들자 (초기값, 조건식, 증가식) 조건식 : 1~100까지 출력
		// 1) 증가식을 2씩 증가하면서 합께를 출력해보자
		for(int i = 2; i <=100; i+=2) {
			//System.out.print(i+", ");
			// sum = sum + i; 0+2+4+6~
			sum = sum + i;
		}
		System.out.println(sum);
		

		
		// if조건문으로 2로 나누면 나머지가 0일 경우
		// 1~100 까지 반복하고 변수값이 짝수가 되는 경우를 조건으로 실행시키기
		
		sum = 0;
		
		//for(int i = 1; i <=100; i++) {
			// 짝수일 경우 합계를 더하자 i % 2 == 0 (true = 짝수)
			
			//if (i % 2 == 0) {
				//sum += i;
		//}
		//System.out.println(sum);
		
		//중첩for문 : 외부 반복문을 내부 반복문 조건이 끝나야 증가한다. 외부 반복문의 조건이 끝나면
		// 모든 for문을 종료된다.
		
		System.out.println("#############");
		// 문제 1
		// 1. 1차 반복문 (for문을 1개만 이용) 구구단 2단을 코드로 만들어 보자.
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
		//문제 2 :
		// 1. 2차 반복문 구구단 2단 ~ 9단을 코드로 만들어보자.
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 2*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 3*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 4*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 5*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 6*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 7*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 8*/1/2/3/4/5/6/7/8/9
		// 외부 반복문 (2~9) 내부 반복문(1~9) : 9*/1/2/3/4/5/6/7/8/9
		
		for (int i=2; i <=9; i++) {
			// 2*1=2 //3*1=3 //4*1=4
			for(int j=1; j<=9; j++) {
				System.out.print(i+" * "+ j + " = "+ (i*j)+ " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#############");
		
		//문제 3번 별찍기
		// 1) 1차 반복문으로 별을 찍자
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
		// 1) 2차 반복문으로 별을 찍자 (외부 for문 : 1개 / 내부 for문 : 1)
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
		System.out.println("실습 3");
		//실습 3
		for (int i = 1; i<= 5; i++) {
			for (int j = 5; i>=j; j--);
			System.out.print("*");
		}
		System.out.println();
}
}