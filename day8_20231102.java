package day8;


// 실행용 클래스 : main 매서드를 포함한 클래스 파일을 생성하면 만들어진다.
//				프로그램 실행을 맡고 있는 클래스다.
public class day8_20231102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스 선언
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		// 클래스 추가 (Tree라는 클래스를 선언하고 객체변수 tree를 생성)
		Tree tr1 = new Tree();
		tr1.leaf = "red";
		Tree tr2 = new Tree();
		
		//객체 : 인스턴스화
		Tv tv1 = new Tv(); //TV 객체를 사용한다
		Tv tv2 = new Tv(); //TV 객체를 사용한다
		
		tv1.channel = 7;
		tv2.channeldown(); // 소리가 6으로 줄어든다.
		
		System.out.println("t1 현재 볼륨은"+ tv1.channel+"입니다.");
		System.out.println("t1 현재 볼륨은"+ tv2.channel+"입니다.");
		
		//tv1의 객체의 주소값을 tv2 주소값으로 바꿔준다.
		
		tv2 = tv1; //x200-->x100(tv1 같은 주소의 메모리를 참조한다)
		System.out.println("t1 현재 볼륨은"+ tv1.channel+"입니다.");
		System.out.println("t1 현재 볼륨은"+ tv2.channel+"입니다.");
		
		// 외부파일 class 설계도를 이용한 객체 생성
		Car_option car_ = new Car_option();
		car_.whell_gold = 2;
		System.out.println("자동차 휠은"+car_.whell_gold+"입니다");
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		
		//정적 멤버와 static (인스턴스/지역/정적) 변수를 구분한다.
		System.out.println("card.widht = " +Card.width);
		System.out.println("card.height = " +Card.height);
		
		Card ca1 = new Card(); //객체 생성
		ca1.kind = "Heart";
		ca1.number = 7;

		Card ca2= new Card(); //객체 생성
		ca2.kind = "spade";
		ca2.number = 4;
		
		System.out.println("ca1은 "+ca1.kind+", "+ca1.number+"이며 "+ca1.width+", "+ca1.height);
		
		//메모리가 종료될때까지 살아있다 !
		printHello();
		
		//메소드 문제 : 멤버 메소드
		// 1. 조거의 객체를 생성한다.
		jogger jo = new jogger();
		// 2. 조거의 이름(멤버변수)를 내 이름으로 선언한다.
		jo.name = "권회준";
		// 3. 조거를 달리게한다.
		jo.run();
		// 4. 조거의 이름을 말하게 한다.
		jo.sayName();
		
		// 메소드 문제 : static 메소드
		// 반환이 없는 메서드를 printgoodbye라고 만들고 잘가라고 이야기 한다.
		
		
		
		
		
		
	}
	
	static void printHello() { //정적 메서드 (클래스가 실행될때 메모리에 메소드가 올라간다)
		System.out.println("실행해");
		System.out.println("실행하고있구나");
		
	}
	static void printgoodbye() {
		System.out.println("잘가");
	}
}


// 라이브러리 클래스 : 실행용 클래스는 항상 1개 이면서 별도로 만들어진 클래스
class bus {
	void take(int m) {
		while (m < 3000) {
			System.out.println("교통카드 충전하러 갑니다");
			return;
		}
		System.out.println("버스를 탑니다");
		m -= 1250;
	}

}

class jogger{
	String name;
	void run() {
		System.out.println("달리고있어 런런런");
	}
	//객체를 생성해서 사용할 수 있는 메서드 : 멤버함수/멤버메소드--->heap 영역
	void sayName() {
		System.out.println("내 이름은 "+name+"입니다");
	}
}

class Card{
	String kind; // 모양
	int number; // 카드번호
	static int width =100; // 넓이
	static int height = 250; // 높이
}


class Tv{
	String color;
	boolean power;
	int channel;
	void power( ) { power = !power; } //전원 기능 : 꺼져있다 
	void channelup( ) { ++channel; }  
	void channeldown( ) { --channel; }
}

class Car{
	
}

class Tree{
	String leaf = "green";
}