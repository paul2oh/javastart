package javastart.b01_object;


class Man{
	
	String name;
	int age;
	void printAll() {
		System.out.print("�̸���"+name);
		System.out.println(",���̴�"+age+"��!!");
		
	}
}

class Hope{
	
	String hope01;
	String hope02;
	String hope03;
	int newYear;
	String orgRnd;
	void showMyHope(){
		System.out.println(newYear+"�⵵"+orgRnd+"�� ���ؿ� ���� �������");
		System.out.println("1."+hope01+"\n2."+hope02+"\n3."+hope03);
	}
}

/*
 * 1�ܰ�
 * Hope //���� ���.. ��ü class
 * ����
 *  ���ڿ�(String) hope01// ù��° ���
 *  ���ڿ�(String) hope02// ù��° ���
 *  ���ڿ�(String) hope03// ù��° ���
 *  ����(int) newYear 	// ���س⵵
 *  ���ڿ�(String) orgRnd	// ���ض�?
 *  
 *  �޼ҵ� showMyHope()
 *  	@@@�⵵ @@@�� ���ؿ� ���� �������
 *  	1.	@@@
 *  	2.	@@@
 *  	3.	@@@
 *  
 *  
 */

public class A03_ObjMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man m1 = new Man();
		m1.name = "�̰��";
		m1.age = 52;
		m1.printAll();
		
		Hope h1 =new Hope();
		h1.hope01 = "���!";
		h1.hope02 = "���!!";
		h1.hope03 = "���!!!";
		h1.newYear = 2017;
		h1.orgRnd = "��";
		h1.showMyHope();
		
		
		
		
	}//main

}
