package javastart.a04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch문..
		 * 선택으로 지정된 데이터가 param값(외부에서 입력)으로 입력될 때,
		 * case에 따라 다른 처리를 할 수 있게 도와주는 분기문.
		 * 
		 * switch(param값){ //param 값은 일반적으로 정수형태, 
		 * 						문자열도 jdk버전에 따라 입력이 가능하다.
		 * 						ex)	int cho=4;
		 * 							switch(cho)
		 * 		case param값이 특정1값으로 올때 :
		 * 			처리할 프로세스... break; //프로세스가 끝날 때, break를 표시
		 * 		case param값이 특정2값으로 올때 :
		 * 			처리할 프로세스...
		 * 		default: 상위에 지정된 값이 없을 때,
		 * 				 처리할 프로세스
		 * 
		 */
				int choiceBtn =4; //2번 버튼을 클릭했을 때,
				System.out.println("클릭한 버튼번호:"+choiceBtn);
				switch (choiceBtn){
					case 1 : //만일에 1번 버튼을 클릭하였을 때,
							System.out.println("1번 구역 점등"); //처리할 프로세스
							break; // case1이 종료됨 의미
					case 2 : //만일에 2번 버튼을 클릭하였을 때,
						System.out.println("2번 구역 점등"); //처리할 프로세스
						break; // case2이 종료됨 의미
					case 3 : //만일에 3번 버튼을 클릭하였을 때,
						System.out.println("모든 구역 소등"); //처리할 프로세스
						break; 
					default : //위에 지정된 case 이외에 버튼이 클릭되었을 때,
						System.out.println("지정된 버튼이 아닙니다.");
				}
				 System.out.println("the end!!!^^");
				 
				 /*
				  * 확인 예제
				  * 1단계
				  * 
				  * 맥도널드에 가서..
				  * 주문번호를 말씀하시면 주문내용이 나옵니다.
				  * 메뉴
				  * 1. 새우버그 4000원
				  * 2. 불고기버그 5000원
				  * 3. 치즈버그 4500원
				  * 그외에는 여기서 더 이상 1단계이기 때문에 팔지 않습니다.
				  * 
				  * 
				  */
				
				 //1단계
				 int bugChoice =1 ;
				 System.out.println("주문하신 버그는 "+bugChoice+"번 입니다.");
				 switch (bugChoice){
				 		case 1 : 
						System.out.println("새우버그 4000원 입니다."); 
								break; 
				 		case 2 : 
				 		System.out.println("불고기버그 5000원 입니다."); 
				 				break; 
				 		case 3 : 
				 		System.out.println("치즈버그 4500원 입니다."); 
				 				break; 
				 		default : 
				 		System.out.println("그외에는 여기서 더 이상 1단계이기 때문에 팔지 않습니다.");
				 }
				 
				 //2단계
				 /*
				  * 2단계 hint  - %(나머지) 활용
				  * 3과목에 대한 점수를 입력 받아,
				  * 그 평균 점수에 따라
				  * 학점 a,b,c,d,f 등급을 나타낸다.
				  * 
				  * 출력..
				  * 국어 : @@
				  * 영어 : @@
				  * 수학 : @@
				  * 평균 : @@ 75
				  * 총 평균 학점 : @@(a,b,c,d,f)
				  */
				 
				 int korean = 90;
				 int english = 100;
				 int math = 100;
				 int avg = (korean+english +math)/3;
				 System.out.println("국어 :"+korean);
				 System.out.println("영어 :"+english);
				 System.out.println("수학 :"+math);
				 System.out.println("평균 :"+avg);
				 switch(avg/10){
				 	 case 10 : 		 		 
				 	 case 9 : 
						 System.out.println(" 등급은 A등급 입니다.");
						 break;
				 	case 8 : 
						 System.out.println(" 등급은 B등급 입니다.");
						 break;
				 	case 7 : 
						 System.out.println(" 등급은 C등급 입니다.");
						 break;
				 	case 6 : 
						 System.out.println(" 등급은 D등급 입니다.");
						 break;
						 default : 
							 System.out.println(" 등급은 F등급 입니다.");
				 }
						
				 
				 /*
				  *Switch case 문에서는 break가 나타나기 전까지는 계속 하위 프로세스를 
				  *진행시킨다.
				  */
					
					 
					 
					 
				 
	}

}
