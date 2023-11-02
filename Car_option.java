package day8;

public class Car_option {
	
	int whell_gold = 4; //자동차 휠
	
	// 기본생성자 : 호출하지 않아도 내부적으로 자동 호출되는 생성자
	Car_option(){
		this.whell_gold = 0;
		System.out.println("기본생성자 호출 됩니다");
	}
	void ride () { //반환값이 없는 메서드 -> retrun X
		System.out.println("달린다");
		
	}
}
