package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. if(조건){ 
		 * 		조건이 true 값이 나올때, 처리할 프로세스. } 
		 * 		입력 id와 password가 맞을 때, @@@님 환영합니다.
		 * 
		 * 2. if(조건){
		 * 		위 조건이 true 일 때, 처리할 프로세스
		 * 		} else{
		 * 		위 조건이 false 일 때,처리할 프로세스
		 * 		}   
		 */
			String inputId = "himan";
			String password = "7879";
			if ( inputId.equals("himan")
				&& password.equals("7878")){
				System.out.println(inputId+"님 환영합니다.");
			}	else{
				System.out.println(inputId+"님은 인증된 계정이 아닙니다. \n 다시 로그인하세요.");
			}
				System.out.println("행복 홈페이지..");
		/*
		 * 사은품 행사
		 * 구매물품..
		 * 1. 사과 1상자: 40,000원
		 * 2. 포도 1상자: 25,000원
		 * 3. 딸기 1상자: 15,000원
		 * 입력할 내용 : 번호, 상자 수. args
		 * 
		 * 선택한 번호는 @@번 @@@를 선택하셨습니다.
		 * @@상자를 주문하셨습니다.
		 * 사은품은 @@@입니다.
		 * 
		 * 5만 미만 고객 : 라면5개
		 * 5~10만 고객 : 10000원 상품권
		 * 10만 이상 고객 : 20000원 상품권
		 */
			int appleBox = Integer.parseInt(args[0]);
			String boxName1 = args[1];
			int appleBoxNum = Integer.parseInt(args[2]);
			int grapeBox = Integer.parseInt(args[3]);
			String boxName2 = args[4];
			int grapeBoxNum = Integer.parseInt(args[5]);
			int strawBox = Integer.parseInt(args[6]);
			String boxName3 = args[7];
			int strawBoxNum = Integer.parseInt(args[8]);
			String saun1 = "라면 5개";
			String saun2 = "10000원 상품권";
			String saun3 = "20000원 상품권";
			
			
			System.out.println("선택한 번호는"+appleBox+"번"+boxName1+"를 선택하셨습니다.");
			
			if(appleBoxNum<50000 && appleBoxNum >= 1){
				System.out.println(appleBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun1+"입니다.");
			} else if(appleBoxNum<100000){
				System.out.println(appleBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun2+"입니다.");
			} else if(appleBoxNum >= 100000){
				System.out.println(appleBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun3+"입니다.");
			}
			
			System.out.println("선택한 번호는"+grapeBox+"번"+boxName2+"를 선택하셨습니다.");
			
			if(grapeBoxNum<50000 && grapeBoxNum >= 1){
				System.out.println(grapeBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun1+"입니다.");
			} else if(grapeBoxNum<100000){
				System.out.println(grapeBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun2+"입니다.");
			} else if(grapeBoxNum >= 100000){
				System.out.println(grapeBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun3+"입니다.");
			}
			
			System.out.println("선택한 번호는"+strawBox+"번"+boxName2+"를 선택하셨습니다.");
			
			if(strawBoxNum<50000 && strawBoxNum >= 1){
				System.out.println(strawBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun1+"입니다.");
			} else if(strawBoxNum<100000){
				System.out.println(strawBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun2+"입니다.");
			} else if(strawBoxNum >= 100000){
				System.out.println(strawBoxNum+"상자를 주문하셨습니다."+"\n"+"사은품은"+ saun3+"입니다.");
			}
			
		 	
							
				
	}

}
