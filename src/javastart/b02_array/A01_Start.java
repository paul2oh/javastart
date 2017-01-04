package javastart.b02_array;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언 = 배열 객체 할당
		// type[] 배열이름 = new type[배열의 크기]
		int[] prodCnts = new int[5];
		// 글자입력 ctrl+space
		prodCnts[0] = 5;
		prodCnts[1] = 8;
		prodCnts[2] = 9;
		prodCnts[3] = 5;
		prodCnts[4] = 3;
		// prodCnts[5]=2; 크기가 5개일 배열은 index가 4까지 있기에 에러 발생
		// 배열이름.length : 배열의 크기
		for (int idx = 0; idx < prodCnts.length; idx++) {
			System.out.println((idx + 1) + "번째 값:" + prodCnts[idx]);
		}

		/*
		 * 1단계 자판기에 메뉴가 4개가 있다. 이 메뉴의 가격을 출력하기 위해.. 메뉴의 가격을 배열로 설정하여 출력하세요.
		 * 메뉴명(String[])도 같이 출력할까요? (메뉴명과 가격을 저장하는 배열 2개를 만들고 출력하세요)
		 * 
		 * @@@ @@@ @@@ @@@ @@ 3000 2000 1000 2000 1200
		 * 
		 */

		// 자판기
		System.out.println("1단계");
		String[] japanki = new String[5];
		japanki[0] = "콜라";
		japanki[1] = "사이다";
		japanki[2] = "환타";
		japanki[3] = "마운틴듀";
		japanki[4] = "커피";
		int[] price = new int[5];
		price[0] = 500;
		price[1] = 700;
		price[2] = 800;
		price[3] = 900;
		price[4] = 1500;

		for(int idx=0;idx<japanki.length;idx++){
			System.out.print(japanki[idx]+"\t");
		}
		System.out.println();
		for(int idx=0;idx<price.length;idx++){
			System.out.print(price[idx]+"\t");
		}
		
		/*
		 * 2단계
		 * 4명의 친구가 0~5000 범위엣 사다리를 (랜덤)으로 게임을 만들었다.
		 * 이중, 각각의 금액을 출력하고, 가장 많은 금액을 낸 친구의 금액을 출력하세요(금액은 100단위로)
		 * 1: 500  2: 800  3: 2500 4: 900
		 * 최고금액 : 2500
		 */
		System.out.println("\n2단계\n");
		int [] sadari = new int[4];
		int max=0;
		for(int i=0;i<sadari.length;i++){
			sadari[i]=(int)Math.floor(((Math.random()*50)+1))*100;
			System.out.print((i+1)+":"+sadari[i]+"\t");
			if(sadari[i]>max){
				max=sadari[i];
				
			}
		}
		System.out.println("\n최고금액:"+max);
		
	
		
		

		
	}// main

}
