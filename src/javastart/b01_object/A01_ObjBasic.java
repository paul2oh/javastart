package javastart.b01_object;
//person �̶�� Ʋ�� �����
class Person{

	public String name;
	int age; //����
}

//ex)product ���Ǹ� �����͸� ������ �Ŀ� main���� ȣ���ϼ���.
class Product{
	int pcnt; //������ ����
	int pprice; //������ �ܰ�
	int sum; // ������ ��(����*�ܰ�)
	
	public String pname;
	
}
class List{

	public String lname;
	public int lprice;
	public int lcnt;
	int lsum;
}

class Scanner{
	
}
	
class Menu{
	
}

public class A01_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������� Ʋ���� Person ���� �޸𸮿� �ø��� ó��..
/*		Person p1 =new Person();
*		p1.name = "ȫ�浿";
*		p1.age= 20;
*		Person p2 =new Person();
*		p2.name = "��浿";
*		p2.age= 20;
*		System.out.println("�̸�1"+p1.name+":"+p1.age+"��");
*		System.out.println("�̸�2"+p2.name+":"+p2.age+"��");
*	
*		Product pr1 = new Product();
*		pr1.pname = "����Ʈ��";
*		Product pr2 = new Product();
*		pr2.pname = "��ǻ��";
*		System.out.println("��ǰ�̸�1"+pr1.pname);
*		System.out.println("��ǰ�̸�2"+pr2.pname);
*/		
		
		
		/* 1�ܰ�
		 * ���� 3���� �����͸� �Ҵ��ϰ�,
		 * �Ʒ� �������� ����ϼ���.
		 * 			����� ����Ʈ
		 * no	���Ǹ�	�ܰ�	����	��
		 * 1	@@@		3000	2		6000
		 * 2	@@@		4000	3		12000
		 * 3	@@@		5000	1		5000
		 */
		
		
		List l1=new List();
		l1.lname = "����";
		l1.lprice = 3000;	
		l1.lcnt = 2;
		l1.lsum= l1.lprice*l1.lcnt;
		
		List l2=new List();
		l2.lname= "����";
		l2.lprice= 4000;
		l2.lcnt=3;
		l2.lsum= l2.lprice*l2.lcnt;
		
		List l3=new List();
		l3.lname= "�ް�";
		l3.lprice= 5000;
		l3.lcnt=1;
		l3.lsum= l3.lprice*l3.lcnt;
		
		System.out.println("\t\t"+"����� ����Ʈ");
		System.out.println("no\t���Ǹ�\t�ܰ�\t����\t��");
		System.out.println(1+"\t"+l1.lname+"\t"+l1.lprice+"\t"+l1.lcnt+"\t"+l1.lsum);
		System.out.println(2+"\t"+l2.lname+"\t"+l2.lprice+"\t"+l2.lcnt+"\t"+l2.lsum);
		System.out.println(3+"\t"+l3.lname+"\t"+l3.lprice+"\t"+l3.lcnt+"\t"+l3.lsum);
		
		/*
		 * 2�ܰ�
		 * Scanner ��ü�� �̿��Ͽ�..
		 * ���� �Ļ縦 �ֹ��ϰ�, �ֹ��� ������ ����ó���ϴ� ����
		 * 
		 * ## ��³���..
		 * @@@ �Ĵ翡 ���Ű��� ȯ���մϴ�.
		 * �޴�
		 * 1. ¥��� - 4500
		 * 2. «��   - 6000
		 * 3. ������ - 12000
		 * 0. ����
		 * 
		 * �ֹ� ��ȣ �Է�:
		 * �ֹ� ���� �Է�:
		 * 
		 * 0.�� ������ ��..
		 * ���� �ֹ� ������ list�ϰ�..
		 * �� ��� ���ó��..
		 * 
		 */
		System.out.println("=====================================================");
		System.out.println("��ȭ�翡 ���Ű��� ȯ���մϴ�.");
		System.out.println("�޴�\n1.¥���-4500\n2.«��-6000\n3.������-12000\n0.����");	
		
		
		int [] nums ={1,2,3,0}; 
		Menu m = new Menu();
		
		Scanner scan = new Scanner();
		
	}//main

}
