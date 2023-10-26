package day6;

import java.util.Scanner;

public class day06_20231026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// 문제 3-6
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("fahrenheit : "+ fahrenheit);
		System.out.println("celcius : " + celcius);
		
		// 4-1번 문제
		// if문을 사용하기전에 관께연산으로 기초적인 조건식
		// 1. int형 변수 x가 10보다 크고 20보다 작을때 true
		int x = 15;
		System.out.println(10<x && 20>x);
		// 2. char형 변수 ch가 공백이나 탭이 아닐때 true
		char ch = '3';
		System.out.println(!(ch == ' ' || ch=='\t'));
		// 3.char형 변수 ch가 숫자('0'~'9')일때 true인 조건식
		System.out.println('0'<= ch && ch<= '9');
		// ||(or)연산자 = 논리곱연산자 = 둘중의 하나만 진짜면 진짜
		char ch1 = 'a';
		System.out.println(('a'<= ch1 && 'z'>=ch1));
		
		// int형 변수 year(년도)가 400으로 나눠 떨어지거나 또는 4로 나눠떨어지고
		// 100으로는 나눠 떨어지지 않을때
		int year = 2023;
		System.out.println((year%400 != 0)||(year%4 == 0 && year%100!=0));
		
		// 문자열 참조변수 str "yes"일 때 true인 조건식
		String str = new String();
		str.equals("yes");
		"yes".equals(str);
		System.out.println(str.equals("yes"));
		
		// 문제 4-2 
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		
		int sum = 0; //총합
		
		for(int i=1; i<=20; i++) {
			//i가 2또는 3의 배수가 아닐때만 sum ++(1씩증가)
			if (i%2 == 0 || i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 문제 4-3 1+(1+2)+(1+2+3)+(1+2+3+4+)+.........+(1+2+3+...+10)
		
		int sum_ = 0;
		int total_ = 0;
		for(int i=1; i<=10; i++) {
			
			sum_ += i;
			total_ = sum_ + i;
		}
		System.out.println("total_sum = " + total_);
		
		// 문제5) 1+(-2)+3+(-4)+5+(-6).... = 100이상이 될때 멈추는것
		// 100 보다 같거나 크면 반복문이 빠져 나간다.
		// for 문으로 증감식 으로 바꿔서 부호(+) (-)
		// 반복문의 증감식 단항연산자를 이용해서 부호를 바꿔준다
		// 증감식 + 1 =-1 증감식-1=1 
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
		
		// 문제 4-7 숫자로 이루워진 문자열 str "12345" fullname = 1+2+3+4+5
		// 15라고 출력하자
		String str7 = "12345";
		
		System.out.print(str7.length());
		int sum7 = 0;
		for(int i = 0; i< str7.length(); i++) {
			sum7 += str7.charAt(i)-'0'; // 문자 객체 '0'을 빼줘야 숫자로 바꿀수 있다.
		}
		System.out.println("sum = "+sum7);
		
		// whule 문제 1
		// 초기값 X 증감식 X
		// I can do it
		// I can do it
		// I can do it
		// I can do it
		// I can do it
		//을 5번 출력하자 (초기값을 0으로 하고 만들자)
		
		int k = 0;
		while (k<5) {
			System.out.println("I can do it");
			k++; //내부증가
		}
		
		System.out.println();
		// while 문제 2
		// 1부터 몇까지 더해야 100을 넘지 않을까?
		// 1. 더해진 수를 조건으로 만든다
		// 2. 더해진 수를 100이랑 비교해서 100이상이 되는지 확인하고 맞으면 OUT (fales)
		int sum2 = 0;
		int i = 0;
		while(sum2<=100) {
			System.out.println(i+ " - "+sum2);
			sum2 += ++i;
			
		}
		
		// do-while 문제1
		// 1과 100사이의 정수를 입력하고 정답을 아아내는 게임
		// 업앤다운 게임을 만들자
		// 업앤다운 : 숫자를 랜덤으로 만들고 숫자를 알아내는게임
		
		// 1. 랜덤으로 숫자를 랜덤함수가 들어간다.
		int answer = (int) (Math.random()*100)+1;
		int input = 0;
		
		// 2. 스캐너로 반복하면서 숫자가 맞을때까지를 계속 입력한다.
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = scanner.nextInt();
			// 3. 입력한 숫자가 랜덤보다 작으면 정답은 크다 라고 알려준다.
			// 4. 입력한 숫자가 랜덤보다 큽면 정답은 작다 라고 알려준다.
			if(input>answer) {
				System.out.println("더 작은수로 다시 시도하시오");
			}else if (input<answer) {
				System.out.println("더 큰수로 다시 시도하시오");
			}
			
		}while(input!=answer);

		// 5. 정답을 맞추면 마지막에 정답입니다 라고 알려준다.
		System.out.println("정답입니다");
		*/
		
		System.out.println();
		// continue : 반복이 진행되는 동안 조건에 해당하는 부분에 넣어준다.
		// 문제 1 : 1부터 10까지 반복문을 출력한다
		// 3의 배수일때는 continue 실행
		// 1 2 4 5 7 8 10 : 출력함수를 아래 놓고 if를 미리 처리해서 continue 사용
		for (int y=1; y<=10; y++) {
			if(y%3==0) {
				continue;
			}
			System.out.println(y);
		}
		
		System.out.println();
		// break문제 1
		// 1. while 조건을 사용하고 sum 합계가 100을 넘어가면 break;
		int sumz = 0;
		int z = 0;
		while(true) {
			//if문으로 처리해서 break
			if(sumz>100) {
				break;
			}
			++z; // 증감함수를 사용자가 만들어서 증가시킨다.
			sumz += z;
		}
		System.out.println("z = "+ z);
		System.out.println("sumz = "+ sumz);
		
		// 결과 실행
		// z = 14 // 몇번 반복 실행했는지
		// sumz = 105 
		

	}

}
