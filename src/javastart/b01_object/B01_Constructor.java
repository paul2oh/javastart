package javastart.b01_object;

class Student{
	/*
	 * �޼��� �����ε�(overloading)
	 * �����ڳ� �޼������ ������ �Է°��� type, ����, ������
	 * �ٸ��� �ٸ� �޼���� �ν��Ͽ� ������ �����ϴ�.
	 * �����ڸ� ������ ����..
	 * ���ǵ� ���� ������ �޼��带 Ȱ���� �� �־,
	 * �ٸ� ��ü�� �����ϴ� �ͺ��� ����鿡�� ȿ�����̴�.
	 * �Ϲ� �����ڴ� return���� ����, ���������� �ʱ� �����͸� ������ ��, ���ȴ�.
	 * 
	 */
	String name;
	int kor;
	Student(String s,int kor){
		name=s;
		this.kor=kor; //���� ���� kor �� �������� ���� ����.
		System.out.println("�Է°��� �ΰ� �ִ� ������ ȣ��!");
		System.out.println("name:"+name);
		System.out.println("��������:"+kor);
	}
	Student(){
		//�ʱ�� null�� �����ϰ� ���� ���� ��.. 
		name= "�̸��� �Էµ��� �ʾҽ��ϴ�.";
		kor=59;
		System.out.println("�Է°� ���� �ʱ������ ȣ��!");
		System.out.println("name:"+name);
		System.out.println("��������:"+kor);
	}
	
	void print(){
	System.out.println("�̸�:"+name);
	System.out.println("��������:"+kor);
	
	}
	
}//student

class CoffeeShop{
	String menu;
	int cnt;
	int price;
	String all;
	CoffeeShop(String m){
		menu=m;
		System.out.println("�Է°��� �Ѱ�:"+menu+" ���Խ��ϴ�.");
	}
	CoffeeShop(String m, int c){
		this.menu=m;
		this.cnt=c;
		System.out.print("�Է°��� �ΰ�:"+menu+"\t");
		System.out.println(c+"�� ���Խ��ϴ�.");
	}
	CoffeeShop(){
		System.out.println("�������");
		System.out.println("�Ƹ޸�ī�� ���� ���Խ��ϴ�.");
	}
	String calcu(String m){
		this.menu=m;
		if(m.equals("�Ƹ޸�ī��")){
			System.out.println("�Ƹ޸�ī��"+"\t3000");
			return all;
		}
		if(m.equals("īǪġ��")){
			System.out.println("īǪġ��"+"\t4000");
			return all;
		}
		if(m.equals("��")){
			System.out.println("��"+"\t4500");
			return all;
		}
		return m;
	}
	void dis10(String m, int c){
		this.menu=m;
		this.cnt=c;
		if(m.equals("īǪġ��")){
			System.out.println(m+all+"����10% ���ݾ�"+(4000*c)*0.9);
		}
	}
		
		
		
	
	
}//coffeeshop

public class B01_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * �ʱ⿡ Ŭ������ �����ڸ� �������� ������
 * ���������� default �����ڷ� �Է°��� ���� �����ڰ�
 * ȣ��Ǿ� �����ȴ�.
 * ����� ���� �����ڰ� ��������� ����,
 * ���� default �����ڴ� �������.
 * ���� ����Ϸ���, �����Ͽ��� �Ѵ�.
 */
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student("���̸�",70);
		s2.print();
		
		/*
		 * 1�ܰ� ������ Ȱ���ϱ�.
		 * CoffeShop : menu(�޴�), cnt(�ֹ�����)
		 * ����:
		 * �� Ŀ�Ǽ��� ����, �ϴ�, �������.. �ֹ� ������ �����ڸ� ���ؼ� ȣ����� ������.
		 * �Ƹ޸�ī�밡 default�� ���� ȣ��Ǿ� ó���ȴ�.
		 * 1. default �����ڷ� menu : �Ƹ޸�ī�� ����..
		 * 2. �Է°��� �Ѱ� �ִ� ������ : �ش� �޴��� �Է� �޾� : @@@@ ����..
		 * 3. �Է°��� �ΰ� �ִ� ������ : �޴��� �ܼ��� �Է¹޾� : @@@@ @@ �� ���..
		 * 
		 */
		CoffeeShop m = new CoffeeShop();
		
		CoffeeShop m1 = new CoffeeShop("ī���");
		
		CoffeeShop m2 = new CoffeeShop("�ڹ�Ĩ������ġ��",4);
		
		/*
		 * 2�ܰ� 
		 * ������ �޼��带 ���ؼ� ������ ������ ���ó��.
		 * calcu() : ���޼���
		 * 			 �Ƹ޸�ī�� 3000,
		 *   		 īǪġ�� 4000,
		 *   		 �� 4500
		 * dis10() : 10%���� �� ��� ���  ex) īǪġ�� 4000 2 ���� 10% ���ݾ� : 7200��
		 * dis20() : 20%����
		 * dis30() : 30%����
		 */
		
		m1.calcu("īǪġ��");
		
	}//main

}
