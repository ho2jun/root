package day3;

public class java_20231019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단항연산자_부호연산자
		// x 라는 변수가 100이고 음수 하나는 양수로 출력하자
		int x = 100;
		int resultplus = +x;
		int resultminus = -x;
		System.out.println(resultplus);
		System.out.println(resultminus);
		
		
		// 단항연산자_증감연산자(--/++)
		// 산술연산자를 간단하게 처리할때 사용한다.
		// 선 연산 후 증가 : (num++);
		// 선 증가 후 연산 : (++num);
		// 출력결과 : 10 / 11
		
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		// 문제 : int형 x라는 변수를 선언합니다. -> 1;
		// 출력결과 :
		//1 - 선 연산 후 증가
		//2
		//3 - 선 증가 후 연산
		
		int num1 = 1; // 변수에 증가할 값을 담아낸다
		
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(++num1);
		
		
		// 아스키코드 'A' = 65 / 'B' = 66
		
		char alphabet = 'x';
		// 실행결과 : 증강현산자를 한번 사용해서 X Y 출력
		// x
		// y
		
		System.out.println(alphabet);
		System.out.println(++alphabet);
		
		// 이항 연산자 (피연산자+피연산자)
		// 산술 연산자 : 변수+변수 -> 처리된 결과
		int numx = 100;
		int numy = 200;
		// 출력결과
		System.out.println(numx + numy);
		// 출력결과 : 20000
		System.out.println(numx * numy);
		// 출력 결과 : 0
		System.out.println(numx / numy); // 100/200 -> 0.5 int는 정수형
		// 출력 결과 : 100 
		System.out.println(numx % numy);
		
		// 2) 이항 연산자_복합대입연산자 y = y + 1
		
		System.out.println("");
		
		int numy1 = 5;
		//numy1 = numy1 + 1;
		//numy1 += 1;
		
		//numy1 = numy1 * 2;
		//numy1 *= 2;
		
		//numy1 = numy1 - 2;
		//numy1 -= 2;
		
		System.out.println(numy1);
		
		System.out.println("");
		// 관계 연산자 : 크다> / 작다< / 같다= / 같거나작다<= / 같거나 크다>=
		// 결과값은 논리적인 판단이다 (true / false)
		
		int a = 10;
		int b = 20;

		//a는 b보다 크다		
		System.out.println(a > b);
		//a는 b보다 작거나 같다
		System.out.println(a <= b);
		//a는 b와 같다
		System.out.println(a == b);
		//a는 b와 같지 않다
		System.out.println(a != b);
		
		
		System.out.println("");
		// 4) 이항연산자_논리연산자(비트연산자)
		//1. (&&&) and = 논리곱 = A(1) && B(1) : true
		//2. (|,||) OR = 논리합 = A(1) && B(0) : true
		//3. (^) XOR = (배타적 논리합) = A(1) ^ B(0) : true
		//4. (!) NOT = NOT(반전)=~A(0) = 1 : true
		
		//boolean : 1byte : 8bit 결과표시: true(1) / false(0)
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("##논리곱(AND) : 둘다 true =1 ##");
		//false (0==0/ 1==0 / 0==1) b1와 b2를 이용해서 false
		System.out.println(b1 && b2);
		//true (1==1)
		System.out.println(b1 && b3);
		//false (0==0/ 1==0 / 0==1) b2와 b4를 이용해서 false
		System.out.println(b2 && b4);
		
		System.out.println("##논리곱(OR) : 둘중 하나라도 true =1 ##");
		//true
		System.out.println(b1 || b2); // true(1) || false(0) = true (1)
		//true
		System.out.println(b1 || b3); // true(1) || true(1) = true (1)
		//false
		System.out.println(b2 || b4); // false(0) || false(0) = false(0) 
		
		System.out.println("##배타적 논리합(XOR): 다르면 true(1) / 같으면 fasle(0)##");
		//true
		System.out.println(b1 ^ b2);
		//false
		System.out.println(b2 ^ b4);
		
		
		System.out.println("");
		//4)이항연산자_논리부정연산자(NOT)
		System.out.println("##논리부정 연산자##");
		boolean not_ = false;
		System.out.print(!not_);
		
		System.out.println("");
		// 3. 삼항 연산자 : 피연산자가 3개인 조건 연산식이다.
		System.out.println("##삼항 연산자##");
		// 조건식(피연산자1)?참(피연산자2):거짓(피연산자3)
		int num_1 = (7>1)?1:0;
		System.out.println(num_1);
		
	}

}
