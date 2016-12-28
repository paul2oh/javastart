package javastart.a02_operator;

public class A05_alloOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 대입연산자 : 데이터를 할당할 때, 쓰이는 연산자를 말한다. 기본 int age=24;
		 * 
		 * 기본 데이터에 다시 데이터를 누적하여 할당 할때. age += 10; cf) -=, *=, /=, %=
		 * 
		 * 현재 사과의 갯수에서 3회 10개씩 누적시킨 총 갯수를 출력하세요.
		 */
		int appleCnt = 25;
		appleCnt += 10;
		System.out.println("1회 후, 총 사과갯수: " + appleCnt);
		appleCnt += 10;
		System.out.println("2회 후, 총 사과갯수: " + appleCnt);
		appleCnt += 10;
		System.out.println("3회 후, 총 사과갯수: " + appleCnt);

		/*
		 * 곰돌이 3마리에게 현재 오렌지 3,5,6개를 초기에 나누어 주었다. 3회 7개씩 나누어 준 후, 곰돌이 3마리가 가지고 있는
		 * 총 오렌지 갯수를 계산하는 프로그램을 만들어 보세요.. 출력
		 *
		 * 곰돌이1 곰돌이2 곰돌이3 계 1회 @@@0 @@@1 @@@2 ### 2회 @@@3 @@@4 @@@5 ###
		 * 3회 @@@6 @@@7 @@@8 ###
		 */
		int BearOrange1 = 3;
		int BearOrange2 = 5;
		int BearOrange3 = 6;
		int tot1 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("\t\t" + "곰돌이1" + "\t\t" + "곰돌이2" + "\t\t" + "곰돌이3" + "\t\t" + "계");
		System.out.println("1회" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot1);
		BearOrange1 += 7;
		BearOrange2 += 7;
		BearOrange3 += 7;
		int tot2 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("2회" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot2);
		BearOrange1 += 7;
		BearOrange2 += 7;
		BearOrange3 += 7;
		int tot3 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("3회" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot3);

		/*
		 * 증감 연산자.
		 *  데이터를 1단위로 증감시키는 연산자를 말한다.
		 *  cnt++ : 현재데이터를 1단위씩 증가시킨다. 단, 증가는 다음 라인에 증가가 된다.
		 *  ++cnt : 현재데이터를 1단위씩 증가시키는데, 현재 라인에서 증가된다.
		 *  cf) cnt-- , --cnt 
		 */
		int fruitCnt=1;
		System.out.println("과일의 갯수 다음 프로세스 증가:" +(fruitCnt++));
		System.out.println("과일의 갯수 현재 프로세스 증가:" +(++fruitCnt));
		
	}

}
