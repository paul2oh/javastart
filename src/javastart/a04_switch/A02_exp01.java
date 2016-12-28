package javastart.a04_switch;

public class A02_exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * switch case 문의 break 관련 확인 예제..
 * 월을 입력하고 ,
 * 해당월의 마지막 날짜를 switch case 문을 활용하여 출력하세요.
 * 
 * =========== 출력형식
 * 입력된 월 :@@@
 * 해당 달의 마지막 날짜:###
 * 
 */
		
		int month =12;
		
				
		switch (month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month+"월의 마지막 날짜는 31일 입니다.");
			break;
		case 2 :
			System.out.println(month+"월의 마지막 날짜는 28일 입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month+"월의 마지막 날짜는 30일 입니다.");
			break;
        default :
        	System.out.println("입력한 월이 맞는지 확인하십시오!!");
			
			
			
		}
		
		/*
		 * 2단계
		 * 생년을 입력 : @@@
		 * 현재 나이와 띠를 출력
		 * 현재 나이는  ## 이면 , 띠는 ### 입니다. 자축인묘진사오미신유술해.
		 */
		int year = 2014;
		int age = 2016-year+1;
		System.out.println("나이:"+age);
		String ganzi= "";
		switch(age%12){
		case 1:
			ganzi= "신-원숭이";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 2:
			ganzi= "유-닭";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 3:
			ganzi= "술-개";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 4:
			ganzi= "해-돼지";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 5:
			ganzi= "자-쥐";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 6:
			ganzi= "축-소";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 7:
			ganzi= "인-호랑이";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 8:
			ganzi= "묘-토끼";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 9:
			ganzi= "진-용";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 10:
			ganzi= "사-뱀";
			System.out.println(ganzi+"띠 입니다.");
			break;
		case 11:
			ganzi= "오-말";
			System.out.println(ganzi+"띠 입니다.");
			break;
		default:
			ganzi= "미-양";
			System.out.println(ganzi+"띠 입니다.");
			break;
			
			
			
			
			
		}
		
		
		
		
		
	}

}
