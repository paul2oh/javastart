package javastart.a02_operator;

public class A07_tripleOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3항 연산자 : 조건처리의 결과물을 한라인에서 true, false값에 따라 바로 처리하고자 할 때, 쓰이는 연산자
		 * 
		 * (조건/논리연산자)? true일때 처리 결과물 : false 일때 처리 결과물 ex)pt >= 70 ? "합격" :
		 * "불합격"; 변수에 할당도 가능하다. String isPass =pt >= 70 ? "합격" : "불합격"; 할인율 계산..
		 * 8~18일때, 20%, 그 외는 0% double disRator= (age>= 8 && age <= 18) ? 0.2 :
		 * 1.0;
		 * 
		 */
		int pt = 70;
		String isPass = pt >= 70 ? "합격" : "불합격";
		System.out.println("결과:" + isPass);
		int age = 15;
		double disRator = (age >= 8 && age <= 18) ? 0.2 : 0.0;
		System.out.println("할인율:" + (int) (disRator * 100) + "%");
		/*
		 * 확인예제 3항 연산자를 활용하여, 학점 평가를 하세요. 점수를 입력받아 아래와 같은 조건에서 결과를 출력하세요. 90점 이상
		 * A, 80~89 : B, 70~79 :C , 60~69:D , 60미만 :F
		 * 
		 * 획득점수 :@@@ 학점등급 :##
		 */

		int num = 82;
		System.out.println("획득점수 :" + num);
		String GRADE = (num >= 90) ? "A" : (num >= 80) ? "B" : (num >= 70) ? "C" : (num >= 60) ? "D" : "F";
		System.out.println("학점등급:" + "\t" + GRADE);

	}

}
