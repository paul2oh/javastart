package javastart.a01_hello;

public class A04_inputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num01=args[0];
		String num02=args[1];
		
		System.out.println(num01+ "+"+ num02);
		System.out.println("합:"+num01+num02);
	//Interger.parseInt : 숫자형태문자열을 숫자(정수)로 변환
	//Double.parseDouble --문자열을 숫자(실수)로 변환
		int num01Int=Integer.parseInt(num01);
		int num02Int=Integer.parseInt(num02);
		int sum=num01Int+num02Int;
		System.out.println("합:" +sum);

	}

}
