package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 논리연산자 : 비교연산자(!=,==..)의 결과값을 2개 이상 연결하여 연산처리 할때, 사용한다. &&(and) : 두가지
		 * 조건을 다 만족시킬 때 ||(or) : 두가지 조건 중, 하나만 만족시킬 때 !(not) : 조건을 반대 처리. false
		 * --> true, true --> false
		 * 
		 * 연령에 따라 할인율을 적용하고자 한다. 8~18 : 할인율을 20%을 하면 4미만, 65이상은 : 할인율 100%(무료)로
		 * 하는 처리는 논리 연산자를 통하여 처리하여라.
		 */
		int age = 9; // args 값으로도 입력가능..
		boolean dis20 = (age >= 8 && age <= 18);
		// 8세 이상이고, 18세 이하일 때 20%할인율 적용 유무
		System.out.println("할인율 20%대상자(8~18)?" + dis20);
		boolean disNopay = (age < 4 || age >= 65);
		// 4세 미만이거나 ,65세 이상일 때, 100% 할인율 적용 유무
		System.out.println("무료대상자" + disNopay);

		/*
		 * 확인예제.. 해당과목의 평균점수가 70점 이상이고, 각과목의 40점 미만 점수가 없을 때, 합격처리를 한다고 한다. 이상에
		 * 해당하는 프로그램을 아래의 형식으로 출력하세요. 출력.. 최종 점수 국어 : @@0 영어 : @@1 수학 : @@2 평균
		 * : @@ 합격여부 : @@
		 */

		int korean = 99;
		int english = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		double avg = (korean + english + math) / 3.0;
		boolean select_tf = (avg >= 70 && korean >= 40 && english >= 40 && math >= 40);
		// boolean ckMin = korean<40 || english<40 || math<40;
		// System.out.println(""합격여부:" + (!(ckMin)&& avg));
		System.out.println("최종점수" + "\n" + "국어:" + korean + "\n" + "영어:" + english + "\n" + "수학:" + math + "\n" + "평균:"
				+ avg + "\n" + "합격여부:" + select_tf);
		/*
		 * 삼항연산자
		 * 조건(비교+논리)?"할당할 데이터(true)":"할당할 데이터(false)";
		 */

	}

}
