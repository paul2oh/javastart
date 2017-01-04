package javastart.a05_loop;

public class A04_forHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * homework 1. 단계 데이터 args로 아래와 같은 데이터가 있다. 급여 3,000,000 0 마트 0 100,000
		 * 옷구매 0 50,000 알바 100,000 0 1) 수입/지출 항목을 출력하세요... 2) 총수입액을 출력하세요..
		 * 
		 * 2.단계 위 데이터를 아래의 형식으로 출력하세요. 가계부
		 * 
		 * no 항목 수입액 지출액 현잔액 1 급여 3,000,000 0 3,000,000 2 마트 0 100,000 2,900,000
		 * 
		 * 3.단계 수입/인지 지출 인지 판단하여 "수입/지출" 출력
		 * 
		 * 급여 3,000,000 수입 마트 100,000 지출 옷구매 50,000 지출
		 * 
		 */

		/*
		 * int price=0; int cnt=0; //총합계를 처리하려면? int tot=0; for(int
		 * idx=0;idx<args.length;idx++){ System.out.print(args[idx]+"\t");
		 * if(idx%3==1){ //단가 parseInt price = Integer.parseInt(args[idx]); }
		 * if(idx%3==2){ //0 : 과일명 1:단가 2:수량 // %이용해서 수량일 때 줄바꿈 처리.. cnt =
		 * Integer.parseInt(args[idx]); //수량 //cnt=
		 * System.out.println(price*cnt); // /t 계를 출력 tot+=(price*cnt);//계를 누적시켜
		 * 처리.. } } System.out.println("\t총계 : "+tot); }
		 */
		// 1단계
		System.out.println("\t" + "수입" + "\t" + "지출");
		int revenue = 0; // 수입
		int expenditure = 0; // 지출
		int cnt = 0;
		int tot = 0; // 총계
		int no = 1;
		for (int idx = 0; idx < args.length; idx++) {
			System.out.print(args[idx] + "\t");
			if (idx % 3 == 2) { // 0: 품목명 1:수입명 2:지출명
				cnt = Integer.parseInt(args[idx]);
				System.out.println();

			}
			if (idx % 3 == 1) {
				revenue = Integer.parseInt(args[idx]);
				tot += (revenue);
			}

		}
		System.out.println("수입총계:" + tot);

		// 2단계
		System.out.println("========================");
		System.out.println("no\t항목\t수입액\t지출액\t현잔액");
		int tot1 = 0;
		int income1 = 0;
		int outcome1 = 0;
		for (int idx = 0; idx < args.length / 3; idx++) {

			income1 = Integer.parseInt(args[idx * 3 + 1]);
			outcome1 = Integer.parseInt(args[idx * 3 + 2]);
			tot1 += (income1 - outcome1);
			System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t" + args[idx * 3 + 2]
					+ "\t" + tot1);
		}

		// 3단계
		System.out.println("========================");
		System.out.println("no\t항목\t수입액\t지출액\t수입/지출여부");
		int tot2 = 0;
		int income2 = 0;
		int outcome2 = 0;
		for (int idx = 0; idx < args.length / 3; idx++) {

			income2 = Integer.parseInt(args[idx * 3 + 1]);
			outcome2 = Integer.parseInt(args[idx * 3 + 2]);

			if (income2 > 0 && outcome2 == 0) {
				System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t"
						+ args[idx * 3 + 2] + "\t" + "수입");
			} else if (outcome2 > 0 && income2 == 0) {
				System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t"
						+ args[idx * 3 + 2] + "\t" + "지출");
			}

		}
		
		//참고
		int spend=0;
		System.out.println("\t수입/지출항목(3단계)");
		System.out.println("no\t항목\t수입액\t지출액\t현잔액");
		for (int i=0;i<args.length/3;i++){
			if(args[i*3+2].equals("수입")){
				income2=Integer.parseInt(args[i*3+1]);
				spend=0;
			}else{
				spend=Integer.parseInt(args[i*3+1]);
				income2=0;
			}
			tot+=(income2-spend);
		}
			// {} 배열 할당 - java
		 	// [] ""		- javascript
	} // main

}
