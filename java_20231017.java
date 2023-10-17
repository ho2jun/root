package class01;
import java.util.Scanner;

public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2일차 자바 공부
		
		//소수 : float /double = 기본적인 프린트
		// float - 7자리, double - 15자리
		//소수 : 정밀도(=표현하는 방식)
		
		//마라톤은 변수명을 정의하고 double 로 자료형을 선언하자.		
		double marathon= 42.195;
		//하프 마라톤 변수명을 정의하고 float로 자료형을 선언하자.
		float halfmarathon = 21.0945f;
		
		
		System.out.println("마라톤은 " + marathon + "Km를 달립니다");
		System.out.println("하프마라톤은 " + halfmarathon + "Km를 달립니다");
		
		
		//3.14(고정소수점) = 3.141592653589793
		
		double piedouble = 3.141592653589793;
		float piefloat = 3.141592653589793f;
		
		System.out.println("double : " + piedouble);
		System.out.println("double : " + piefloat);
		
		//문자형 소스코드
		//char '가';(캐릭터 한글자만 표현)
		//char 자료형을 선언 alphabetA = 'A'선언
		//char 자료형을 선언 alphabetB = 'B'선언
		//결과 -> A=65 B=66
		
		
		int alphabetA = 'A';
		int alphabetB = 'B';
		char alphabetC = 'C';
		char alphabetD = 'D';
		
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		System.out.println(alphabetC);
		System.out.println(alphabetD);
		
		
		//기본논리형 boolean = 1byt = true/false
		
		//학생이라는 변수이름을 만들고 boolean형을 선언하고
		//출력할때 학생이 맞다 (=true/false)라는 변수를 선언하자
		
		boolean student = true;
		boolean notstudent = false;
		
		System.out.println(notstudent);
		
		//자동 형 변환
		//char -> short -> int -> long
		//정수 -> 소수 
		//int 형 num1 선언한다 14을 값을 저장하세요
		//double num2 선언하고 num1 대입하세요
		//num2 변수를 프린트 하자.
		
		int num1 = 14;
		double num2 = num1;
		
		System.out.println(num2);
		
		// 강제형변환
		int num3 = 10;
	    byte num4 = (byte)num3;
	    
	    System.out.println(num4); // 손실이 없다. 값의 범위 27-1 127
	    
	    
	    int num5 = 1000;
	    byte num6 = (byte)num5;
	    
	    System.out.println(num6); // 손실이 있다. 자료형에 해당하는 byte
		
	    
	    //입력 받기 : new Scanner(System.in);
	    
	    //Scaneer 객체 선언
	    
	    
	    Scanner input = new Scanner(System.in);
	    
	    //입력 받기
	    //이름 주소 나이 체중을 빈칸으로 구분해서 입력받고 출력하기
	    
	    
	    System.out.println("이름 주소 나이 체중을 빈칸으로 구분해서 입력받고 출력하기");
	    
	    //이름 주소 = String
	    //나이 = int
	    //체중 = double
	    
	    String name, address;
	    int age;
	    double weight;
	    
	    name = input.next();
	    address = input.next();
	    age = input.nextInt();
	    weight = input.nextDouble();
	    
	    System.out.println("당신의 이름은 "+ name +"입니다");
	    System.out.println("당신의 주소 "+ address +"입니다");
	    System.out.println("당신의 나이 "+ age +"입니다");
	    System.out.println("당신의 체중은 "+ weight +"입니다");
	    
		

	} 

}
