package day7;

import java.util.Arrays;
import java.util.Comparator;

public class day7_20231031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] arr = new int[5];
		// 참조변수 : 주소를 출력하면 배열의 위치가 주소값으로 출력된다.
		System.out.println(arr);
		
		// 배열의 값을 추가
		// 각 배열의 인덱스를 선언하고 1~5까지 값을 넣어보자
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
		
		// 배열의 크기를 출력하자.
		System.out.println("배열의 크기 : "+arr.length);
		
		// 배열의 초기값
		int [] intArray = new int[5];
		System.out.println(intArray);
		System.out.println(arr);
		String [ ] StrArray = new String[5];
		System.out.println(StrArray);
		
		int [ ] varArray = {1,2,3,4,5};
		
		// intArray 첫번째값 두번째값을 출력해보자
		System.out.println("intArray[0] = "+ intArray[0]);
		System.out.println("intArray[1] = "+ intArray[1]);
		// strArry 첫번째와 두번째값을 출력하자
		System.out.println("StrArray[0] = "+ StrArray[0]);
		System.out.println("StrArray[1] = "+ StrArray[1]);
		// varArray 첫번째값 두번째값을 출력하자
		System.out.println("varArray[0] = "+ varArray[0]);
		System.out.println("varArray[1] = "+ varArray[1]);
		
		
		// 배열 문제 1: 배열에서 단어만 추출하여 출력하기
		// char [ ] 배열을 선언하고 = {'1','L' '0', 'v' 3, 'E'}
		char [] card = {'1','L', 'O', '2','V','3', 'E'};
		String myWord = "";
		
		//반복문을 사용하자
		for (int i = 0; i<card.length; i++) {
			//System.out.println(card[i]);
			
			int word = card [i];
			//대문자 : 65크거나 같다 ~ 90작거나 같다 && 소문자 : 97크거나 같다 ~ 122 작거나 같다
			if((word >= 65 && word <=90) || (word >= 97 && word <=122) ) {
				myWord += (char)word;
				
			}
		}
		
		System.out.println("단어 : "+ myWord);
		
		//@Array 클래스
		//- 배열을 출력
		
		int [] arrs = {1,6,2,3,10,7,4,5,8,9};
		// 배열의 있는값을 간단하게 출력한다
		System.out.println("정렬 전 오름차순 :"+Arrays.toString(arrs));
		
		//- 배열의 정렬 (오름차순/내림차순) 
		//오름차순 : 작은값부터 차례대로 정렬하는방법
		//Arrays.sort(배열이름);
		Arrays.sort(arrs);
		System.out.println("정렬 후 오름차순 :"+Arrays.toString(arrs));
		
		Integer [] arrs2 = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("정렬 후 내림차순 :"+Arrays.toString(arrs2));
		
		//내림차순 : 큰값부터 작은값 까지 차례대로 정렬하는 방법
		//Arrays.sort(arrs,comparator.reverseOrder());
		Arrays.sort(arrs2, Comparator.reverseOrder());
		System.out.println("내림차순 : "+ Arrays.toString(arrs2));
		
		//1. 앝은 복사 (shallow copy)
		//복사 된 배열이나 원본 배열이 변경될때 서로 간의 값이 변경된다.
		//int [ ] arr01 = {1,2,3};
		//int [ ] arr02 = arr01;
		
		//int형 배열 arr01 선언한 즉시 값을 넣는다 = {1,2,3}
		int [] arr01 = {1,2,3};
		//배열의 얕은복사 한다
		//새로운 배열(arr02)을 선언하고 arr01 정의한다.
		int [] arr02 = arr01;
		
		//배열을 출력한다.(arr01) = Arrays.toString(배열이름)
		System.out.println("arr01 : "+ Arrays.toString(arr01));
		//arr02[1] : 두번째 인덱스 값을 10으로 바꿔준다.
		arr02[1] = 10;
		//arr01과 arr02값을 출력한다
		System.out.println("arr01 : "+ Arrays.toString(arr01));
		System.out.println("arr02 : "+ Arrays.toString(arr02));
		
		//2. 깊은 복사 (deep copy)
		//복사 된 배열이나 원본 배열이 변경될때 서로간의 값은 바뀌지 않는다.
		//- 복사할 배열을 선언하는 방법
		//int [ ] card = {1,6,4,5,3,2};
		//int [ ] newcard = new int[card.length];
		
		int [] card01 = {1,6,4,5,3,2};
		int [] card02 = new int[card01.length];
		
		//새로운 배열에 기존 배열값을 intsert
		
		for(int i=0; i<card01.length; i++) {
			card02[i] = card01[i];
		}
		// 새로 생성된 배열의 첫번째 배열의 값을 변경한다.
		card02[0] = 100;
		//출력
		System.out.println("card 배열 : "+ Arrays.toString(card01));
		System.out.println("card02 배열 : "+ Arrays.toString(card02));
		
		// 깊은복사 2
		//int [] card03 = Arrays.copyof(원본배열, 원본배열크기)
		int [] card03 = Arrays.copyOf(card01, card01.length);
		
		card03[1] = 200;
		
		//출력
		System.out.println("card01 배열 : "+ Arrays.toString(card01));
		System.out.println("card03 배열 : "+ Arrays.toString(card03));
		
		//깊은복사 3
		//System.arrayCopy(원본, 0, 복사본, 0, 배열의크기)
		//부분적인 깊은 복사가 가능한 형태
		
		int [] card04 = new int[card01.length-2]; //크기를 공간만큼 만들어준다
		System.arraycopy(card01, 0, card04, 0, card01.length-2);
		
		//card04[2]=300
		card04[2] = 300;
		//출력
		System.out.println("card01 배열 : "+ Arrays.toString(card01));
		System.out.println("card03 배열 : "+ Arrays.toString(card04));
		
		//2차원 배열 선언
		int [ ] [ ] arrys = new int [3] []; // 좋은방법		
		//사용자가 임의대로 열을 각각의 크기로 지정할수있다
		arrys[0] = new int [2];
		arrys[1] = new int [3];
		arrys[2] = new int [1];
		
		//2차원 배열의 기본적인 고정적인 열의 크기를 만드는 방법
		
		int [] [] arrys02 = new int[2][3];
		
		//2차원 배열을 행2열3 값을 할당해보자
		//첫번째 행을 3개의 열로 값을 대입한 예시
		arrys02[0][0] = 1;
		arrys02[0][1] = 2;
		arrys02[0][2] = 3;
		//두번째 행을 3개의 열로 값을 대입한 예시
		arrys02[1][0] = 11;
		arrys02[1][1] = 12;
		arrys02[1][2] = 13;	
		
		// 2차원 배열주소값을 출력
		System.out.println("2차원배열 : "+ arrys02);
		//2차원 배열 첫번째행의 주소값을 출력
		System.out.println("2차원 배열 1행 : "+ arrys02[0]);
		//2차원 배열 두번째행의 주소값을 출력
		System.out.println("2차원 배열 2행 : "+ arrys02[1]);
		
		
		
		}
		
		
		
	}


