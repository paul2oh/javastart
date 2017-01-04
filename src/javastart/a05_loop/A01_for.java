package javastart.a05_loop;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * for(초기값;한계값;증감){
 * 		반복처리할 구문..
 */
		
		for(int cnt=5;cnt<=20;cnt+=5){
			System.out.println(cnt+"번째\t");
		}
		
		/*구구단 치리..
		 *  2*1=2 @@*@@=##
		 *  2*2=4
		 */
		int grade =2;
		System.out.println(""+grade+"단");
		for(int num=1; num<=9;num++){
			System.out.println(grade+"*"+num+"="+(grade*num));
		}
		/*
		 * 1단계
		 * 	1) 5~20까지 1단위로 증가시켜 출력하세요. ex)5 6 7 8...
		 *  2) 30~100까지 5단위로 증가시켜 출력하세요 ex)30 35 40 45
		 *  3) 1000부터 900 까지 감소시켜 2단위로 출력하세요 ex)1000 998 996
		 *  
		 * 2단계 : if 문 활용, \n, \t 활용..
		 * 	1) 	구구단 전체를 다음과 같은 형식으로 출력하세요.
		 * 
		 *     2단     3단     4단       5단       ....     9단
		 *    2*1=2    3*1=3   4*1=4     5*1=5              9*1=9
		 *  
		 */
		
		//1단계
		for (int test1=5;test1<=20;test1++){
			System.out.println(test1);
		}
		for (int test2=30;test2<=100;test2+=5){
			System.out.print("\n"+test2);
		}
		for (int test3=1000;test3>=900;test3-=2){
			System.out.print("\n"+test3);
		}
		
		//2단계
		/*
		*int grade= 2;
		*if (grade=2){
		*				System.out.println(grade+"단");
		*					for(int num=1; num<=9;num++){
		*					System.out.println(grade+"*"+num+"="+(grade*num));
		*}
		*};
		**/
		//11
		System.out.println("=============");
		for (grade=2;grade<=9;grade++)
			{System.out.print(grade+"단\t");}
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
				for(grade=2;grade<=9;grade++){
					System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
		}
		//줄바꿈 처리
				System.out.println();
		}
			
		
		
		
		
	}

}
