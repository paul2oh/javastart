package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 산술연산자 : +, -, *, /, % %: 나머지 연산자 : 해당 데이터의 몫을 제외한 나머지 부분 처리
		 */
		// System.out.println("20%7="+(20%7));
		/*
		 * 사과 50개를 3명에게 나누어 주기로 했습니다. 1명당 몇개를 나누어 주고, 나머지 @@개가 남는 것을 프로그램하려고 한다.
		 * 이때, (과일) 종류와 총(갯수) 나누어 줘야할 (사람수)를 args를 받아서 변동적으로 처리하는 프로그램을 만든다면..
		 * 
		 * 
		 * 과일 종류 @@@ 문자 사과 , 배, 딸기, 바나나 과일 갯수 @@ 나누어줄 인원 : @@ 1명당 나누어 줄 과일 갯수
		 * : @@@ 나머지 갯수 : @@@
		 */
		/*
		 * int appleCnt = Integer.parseInt(args[0]); int pairCnt =
		 * Integer.parseInt(args[1]); int strawCnt = Integer.parseInt(args[2]);
		 * int bananaCnt = Integer.parseInt(args[3]); int tot = appleCnt
		 * +pairCnt+ strawCnt+bananaCnt;
		 */

		/*
		 * String fruitkind=args[0]; int fruitCnt=Integer.parseInt(args[1]); int
		 * personCnt=Integer.parseInt(args [2]); int
		 * cntPerPerson=fruitCnt/personCnt; int cntMod=fruitCnt%personCnt;
		 * //sysout+ctrl+space : 단축키를 외우기전에 풀 코드 암기
		 * System.out.println("과일 종류 : "+fruitkind);
		 * System.out.println("과일 갯수 : "+fruitCnt );
		 * System.out.println("나누어줄 인원 : "+personCnt );
		 * System.out.println("1명당 나누어 줄 과일 갯수 : "+cntPerPerson );
		 * System.out.println("나머지 갯수 : "+cntMod );
		 */

		/*
		 * 12/26 과제 아래형식의 내용을 args 값으로 받아서 처리하세요.
		 * 
		 * @@@ : args변수를 받아서 처리 ### : 연산처리해서 나타나는 부분..
		 * 
		 * 
		 * 
		 * 성적관리프로그램.. 반 : @@@@0 ex) 3-4반, 영어영문학과 NO 이름 국어 수학 영어 총점 평균(실수)
		 * ## @@@1 @@2 @@3 @@4 ## ## ## @@@5 @@6 @@7 @@8 ## ##
		 * 
		 * LOOP문으로 해결 가능
		 */
		String ban = args[0];
		String Aname = args[1];
		int Akorean = Integer.parseInt(args[2]);
		int Amath = Integer.parseInt(args[3]);
		int Aenglish = Integer.parseInt(args[4]);
		int Atot = Akorean + Amath + Aenglish;
		double Aavg = Atot / 3.0; // 정수/정수=정수 정수/실수=실수
		String Bname = args[5];
		int Bkorean = Integer.parseInt(args[6]);
		int Bmath = Integer.parseInt(args[7]);
		int Benglish = Integer.parseInt(args[8]);
		int Btot = Bkorean + Bmath + Benglish;
		double Bavg = Btot / 3.0;
		int no = 0;

		// sysout+ctrl+space : 단축키를 외우기전에 풀 코드 암기
		System.out.println("반 : " + ban);
		System.out.println("===========================");
		System.out.println(" NO\t이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println(
				(no + 1) + "\t" + Aname + "\t" + Akorean + "\t" + Amath + "\t" + Aenglish + "\t" + Atot + "\t" + Aavg);
		System.out.println(
				(no + 2) + "\t" + Bname + "\t" + Bkorean + "\t" + Bmath + "\t" + Benglish + "\t" + Btot + "\t" + Bavg);
	}
}
