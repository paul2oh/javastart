package javastart.a01_hello;

public class A04_inputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num01=args[0];
		String num02=args[1];
		
		System.out.println(num01+ "+"+ num02);
		System.out.println("��:"+num01+num02);
	//Interger.parseInt : �������¹��ڿ��� ����(����)�� ��ȯ
	//Double.parseDouble --���ڿ��� ����(�Ǽ�)�� ��ȯ
		int num01Int=Integer.parseInt(num01);
		int num02Int=Integer.parseInt(num02);
		int sum=num01Int+num02Int;
		System.out.println("��:" +sum);

	}

}
