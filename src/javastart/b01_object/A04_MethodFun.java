package javastart.b01_object;

import java.util.Scanner;

class Calcu{
	int num01;
	int num02;
	String cal;
	int sum;
	//�ΰ��� ���� �Է¹޾� ����ó��.
	int plus(int n01,int n02){
		cal= "+";
		sum=n01+n02;
		return sum;
	}
	int minus(int n01,int n02){
		cal= "-";
		sum=n01-n02;
		return sum;
	}
	int multi(int n01,int n02){
		cal= "*";
		sum=n01*n02;
		return sum;
	}
	int div(int n01,int n02){
		cal= "/";
		sum=n01/n02;
		return sum;
	}
	//���ڸ� �Է��ϰ� �����ڸ� ������ ���ϴ� ��� �������� ������ 
	//�ϴ� �޼��� ����..
	void print(int num01,int num02, String cal){
		//�Էµ� cal�� ���������� �ִ� cal�� �Ҵ�.
		this.cal=cal;
		if(cal.equals("+")){
			sum =plus(num01,num02);
		}
		if(cal.equals("-")){
			sum =minus(num01,num02);
		}
		if(cal.equals("*")){
			sum =multi(num01,num02);
		}
		if(cal.equals("/")){
			sum =div(num01,num02);
		}
		System.out.println(num01+" "+cal+" "+num02+"="+sum);
		
	}
}

class buyBook{
	String books;
	int price;
	int cnt;
	int total;
	int tot;
	int sum;
	String multishow="";
	int multi01(int p1,int c1){
		total = p1*c1;
		return total;
	}
	
	void print(String books,int price,int cnt){
		this.cnt =cnt;
		if(cnt>0){
			total =multi01(price,cnt);
		}
		System.out.println(books+"\t �ܰ�"+price+"\t"+cnt+"�� ��:"+total);
		
		
	}
	void buyBook01(String books,int price,int cnt){
		this.cnt =cnt;
		this.books = books;
		this.price =price;
		tot = price*cnt;
		sum+=tot;
		multishow+=books+"\t �ܰ�"+price+"\t"+cnt+"�� ��:"+tot+"\n";
		
//		if(cnt>0){
//			total =multi01(price,cnt);
//		}
//		System.out.println(books+"\t �ܰ�"+price+"\t"+cnt+"�� ��:"+total);
	}
	
	void end(){
		System.out.println("\t�������ų���");
		System.out.println(multishow);
		System.out.println("��\t"+sum);
		sum=0;
		multishow="";
	}
		
		
		
	
	
	
	
	
	
	
}

public class A04_MethodFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c01 = new Calcu();
		int num01=4;
		int num02=5;
		System.out.println(num01+"+"+num02+"="+c01.plus(num01, num02));
		c01.print(25, 13, "-");
		
		buyBook bs = new buyBook();
		String books= "java";
		int price=25000;
		int cnt=2;
		System.out.println(books+"\t �ܰ�"+price+"\t"+cnt+"�� ��:"+bs.multi01(price, cnt));
		
//		bs.print("jsp",33000,1);
//		//1�ܰ� �Ϸ�!
		
//		bs.buyBook01("java", 25000, 2);
//		bs.buyBook01("jsp",33000,1);
//		bs.end();
		
		
	}//main
/*
 * Ȯ�ο���..
 * 1�ܰ�
 * BookStore ����..
 * ���� : ������(books), ����(price), ����(cnt), ��(total)
 * �޼��� : 
 *  buyBook 
 *  �Է°� : ������� ����, ����
 *  return : ���� ��
 *  showCalcu
 *  ��� exp : java�Թ� �ܰ� 25000 2�� ��: 50000
 *  
 *  2�ܰ�
 *  �� buyBook�� ���ؼ� ������ ������ ������ �� ������
 *  ex) bs.buyBook("java", 25000, 2);
 *      bs.buyBook("jsp", 33000, 1);
 *      bs.end();// �� ���� ���� ó�� ����..
 *  showCalcu �޼��带 ���ؼ� ������ �������� ������ �Ʒ� �������� ���
 *  ���� ���� ����
 *  java 25000  2 50000
 *  jsp  33000  1 33000
 *      ��             83000
 *  
 *  
 *  
 *  
 */
//	2�ܰ�
//	Scanner ��ü�� �̿��Ͽ�..
//	���� �Ļ縦 �ֹ��ϰ�, �ֹ��� ������ ����ó���ϴ� ���� 
//
//	## ��³���..
//	@@@ �Ĵ翡 ���Ű��� ȯ���մϴ�.
//	�޴�
//	1. ¥��� - 4500
//	2. «��   - 6000
//	3. ������ - 12000
//	0. ����
//
//	�ֹ� ��ȣ �Է�:
//	�ֹ� ���� �Է�:
//
//	0.�� ������ ��..
//	���� �ֹ� ������ list�ϰ�..
//	�� ��� ���ó��..*/
//	System.out.println("�ູ���� ���Ű��� ȯ���մϴ�.");
//	Scanner s = new Scanner(System.in);
//	int chnum=0; // ������ �ֹ���ȣ
//	int price=0; // ����
//	int count=0; // ����
//	int no=1;    // numbering
//	int totall=0; // ��ü�Ѱ�
//	Prod p=null; // ��ü �ʱ� ����..
//	String chMenu="";
//	String show="NO\tMENU\t�ܰ�\t����\t��\n";  // ȭ�鿡 ��ü������ ����ϱ� ����.
//	while(true){
//		p=new Prod();  // ��ü�� �Ҵ�.. �Ѹ޸𸮿� ��ü�� �Ҵ��ϱ� ����..
//		System.out.println("�޴�");
//		System.out.println("1. ¥��� - 4500");
//		System.out.println("2. «��   - 6000");
//		System.out.println("3. ������ - 12000");
//		System.out.println("0. ����");
//		System.out.print("�ֹ� ��ȣ �Է�:");
//		chnum=s.nextInt();
//
//		if(chnum==1) {price=4500; chMenu="¥���";}
//		if(chnum==2) {price=6000; chMenu="«��";}
//		if(chnum==3) {price=12000; chMenu="������";}
//		if(chnum==0) break;
//		p.name=chMenu;
//		p.price=price;
//		
//		System.out.print("�ֹ�����:");
//		count=s.nextInt();
//		p.cnt=count;
//		p.tot=p.price*p.cnt;  //  ���� ��
//		totall+=p.tot;    // �Ѱ� ����ó��..
//		// �ֹ������� show���ڿ��� ����ó��..
//		show+=(no++)+"\t"+p.name+"\t"+p.price+"\t"+p.cnt+"\t"+p.tot+"\n";
//	}
//	System.out.println("=== ��꼭 ===");
//	System.out.println(show);
//	System.out.println("�� ��:"+totall);

}
