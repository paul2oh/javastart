package javastart.a01_hello;

public class A03_calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. �������� ��Ģ���� ó��..
    �������� �Ҵ��� �����͸� Ư���� �䱸�� ���� ��Ģ���� ó���� �� �� �ִ�.
    ex)int sum = num01 +num02;
    ��Ģ���� ó�� ���
    �Է°� 1 : @@@
    �Է°� 2 : @@@
    ���� : @@@
    ���� :@@@
    ������ :@@@
    ���� :@@@

 */
	  int num01=25;
	  int num02=35;
	  int sum=num01+num02;//�������
	  int min=num01-num02;//�������
	  double num02Db1=num02;
	  num02=(int)num02Db1;//*�߿�!(int)����type���� casting �մϴ�.
	  double div=num01/num02Db1;//������ ���
	  // ����/���� ==> ���� ���� �Ǽ��Ҵ� �ϱ� ������ ���� .0 ���� ��
	  // �� �������� ��, �ϳ��̻��� �Ǽ��̾�� �Ǽ����� ���������� ó�� �ȴ�.
	  int mul=num01*num02;//���� ���
	  
	  System.out.println("��Ģ���� ó�� ���");
	  System.out.println("�Է°�1 = "+num01+"");
	  System.out.println("�Է°�2 = "+num02+"");
	  System.out.println("���� = "+num01+"+"+num02+"="+sum);
	  System.out.println("���� = "+num01+"-"+num02+"="+min);
	  System.out.println("���� = "+num01+"*"+num02+"="+mul);
	  System.out.println("������ = "+num01+"/"+num02+"="+div);
	
	  // 2. ���ڿ� add ó��..	  
	 System.out.println("�ȳ�"+"��");
	 String addName="ȫ";
	 addName=addName+"�浿";
	 //���ڿ��� +��ȣ�� ���ؼ� ���ڿ��� ���ڿ��� �̾��ش�.
	 //+��ȣ�� ���ؼ� ���ڿ��� �̾��ִ� ������ �ϰ�,
	 //��Ģ������ ó���� ���� �ʴ´�.
	  
	  
	}

}