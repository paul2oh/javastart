package javastart.b02_array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class A03_intarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열 선언과 초기 데이터 할당
		 * 
		 * cf) 자바스크립트 {}: 객체, []배열
		 * 		 자바{}: 배열
		 * 		선언 = {배열데이터1,배열데이터2,배열데이터3};
		 * 		==for 문에서 배열형태의 데이터 매핑..==
		 * 		  for(단위객체 참조변수:배열객체){
		 * 	}
		 */
			String[]students={"홍길동","김길동","신길동"};
			for(int idx=0;idx<students.length;idx++){
				System.out.println(idx+1+"번"+students[idx]);
				
			}
			
			System.out.println("for(단위객체 참조변수:배열객체)");
			for(String student:students){
				System.out.print(student+"\t");
			}
			
			/*
			 * 1단계 확인예제..
			 * 과목명 : 국어 , 영어 , 수학
			 * 점수 : 80  90 70
			 * 을 데이터 선언과 할당을 바로 하면서 처리하고..
			 * for(단위객체 : 배열객체) 형태로 출력하세요..
			 * 
			 */
			System.out.println("\n1단계");
			String [] subjects = {"국어","영어","수학"};
			int [] points = {80,90,70};
			for(String subject:subjects){
				System.out.print(subject+"\t");
			}
			System.out.println();
			for(int point:points){
				System.out.print(point+"\t");
				
			}
			
			/*
			 * 2단계: 평균점수, 출력하고.
			 * 		  최저점수 - 과목명 출력  
			 */
			
//			System.out.println("\n2단계");
//			
//			HashMap<String,Integer> map =new HashMap<String,Integer>();
//			map.put("국어",80);
//			map.put("영어",90);
//			map.put("수학", 70);
//			
//			Collection Values = map.values();
//			Iterator iter=values.iterator();
//			int total=0;
//			while(iter.hasNext()){
//				total+=(Interger)iter.next();
//			}
			
			
			
			
			
			
	}// main

}
