package javastart.a04_switch;

public class A02_exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * switch case ���� break ���� Ȯ�� ����..
 * ���� �Է��ϰ� ,
 * �ش���� ������ ��¥�� switch case ���� Ȱ���Ͽ� ����ϼ���.
 * 
 * =========== �������
 * �Էµ� �� :@@@
 * �ش� ���� ������ ��¥:###
 * 
 */
		
		int month =12;
		
				
		switch (month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month+"���� ������ ��¥�� 31�� �Դϴ�.");
			break;
		case 2 :
			System.out.println(month+"���� ������ ��¥�� 28�� �Դϴ�.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month+"���� ������ ��¥�� 30�� �Դϴ�.");
			break;
        default :
        	System.out.println("�Է��� ���� �´��� Ȯ���Ͻʽÿ�!!");
			
			
			
		}
		
		/*
		 * 2�ܰ�
		 * ������ �Է� : @@@
		 * ���� ���̿� �츦 ���
		 * ���� ���̴�  ## �̸� , ��� ### �Դϴ�. �����ι�������̽�������.
		 */
		int year = 2014;
		int age = 2016-year+1;
		System.out.println("����:"+age);
		String ganzi= "";
		switch(age%12){
		case 1:
			ganzi= "��-������";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 2:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 3:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 4:
			ganzi= "��-����";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 5:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 6:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 7:
			ganzi= "��-ȣ����";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 8:
			ganzi= "��-�䳢";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 9:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 10:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		case 11:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
		default:
			ganzi= "��-��";
			System.out.println(ganzi+"�� �Դϴ�.");
			break;
			
			
			
			
			
		}
		
		
		
		
		
	}

}
