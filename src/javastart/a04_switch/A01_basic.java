package javastart.a04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch��..
		 * �������� ������ �����Ͱ� param��(�ܺο��� �Է�)���� �Էµ� ��,
		 * case�� ���� �ٸ� ó���� �� �� �ְ� �����ִ� �б⹮.
		 * 
		 * switch(param��){ //param ���� �Ϲ������� ��������, 
		 * 						���ڿ��� jdk������ ���� �Է��� �����ϴ�.
		 * 						ex)	int cho=4;
		 * 							switch(cho)
		 * 		case param���� Ư��1������ �ö� :
		 * 			ó���� ���μ���... break; //���μ����� ���� ��, break�� ǥ��
		 * 		case param���� Ư��2������ �ö� :
		 * 			ó���� ���μ���...
		 * 		default: ������ ������ ���� ���� ��,
		 * 				 ó���� ���μ���
		 * 
		 */
				int choiceBtn =4; //2�� ��ư�� Ŭ������ ��,
				System.out.println("Ŭ���� ��ư��ȣ:"+choiceBtn);
				switch (choiceBtn){
					case 1 : //���Ͽ� 1�� ��ư�� Ŭ���Ͽ��� ��,
							System.out.println("1�� ���� ����"); //ó���� ���μ���
							break; // case1�� ����� �ǹ�
					case 2 : //���Ͽ� 2�� ��ư�� Ŭ���Ͽ��� ��,
						System.out.println("2�� ���� ����"); //ó���� ���μ���
						break; // case2�� ����� �ǹ�
					case 3 : //���Ͽ� 3�� ��ư�� Ŭ���Ͽ��� ��,
						System.out.println("��� ���� �ҵ�"); //ó���� ���μ���
						break; 
					default : //���� ������ case �̿ܿ� ��ư�� Ŭ���Ǿ��� ��,
						System.out.println("������ ��ư�� �ƴմϴ�.");
				}
				 System.out.println("the end!!!^^");
				 
				 /*
				  * Ȯ�� ����
				  * 1�ܰ�
				  * 
				  * �Ƶ��ε忡 ����..
				  * �ֹ���ȣ�� �����Ͻø� �ֹ������� ���ɴϴ�.
				  * �޴�
				  * 1. ������� 4000��
				  * 2. �Ұ����� 5000��
				  * 3. ġ����� 4500��
				  * �׿ܿ��� ���⼭ �� �̻� 1�ܰ��̱� ������ ���� �ʽ��ϴ�.
				  * 
				  * 
				  */
				
				 //1�ܰ�
				 int bugChoice =1 ;
				 System.out.println("�ֹ��Ͻ� ���״� "+bugChoice+"�� �Դϴ�.");
				 switch (bugChoice){
				 		case 1 : 
						System.out.println("������� 4000�� �Դϴ�."); 
								break; 
				 		case 2 : 
				 		System.out.println("�Ұ����� 5000�� �Դϴ�."); 
				 				break; 
				 		case 3 : 
				 		System.out.println("ġ����� 4500�� �Դϴ�."); 
				 				break; 
				 		default : 
				 		System.out.println("�׿ܿ��� ���⼭ �� �̻� 1�ܰ��̱� ������ ���� �ʽ��ϴ�.");
				 }
				 
				 //2�ܰ�
				 /*
				  * 2�ܰ� hint  - %(������) Ȱ��
				  * 3���� ���� ������ �Է� �޾�,
				  * �� ��� ������ ����
				  * ���� a,b,c,d,f ����� ��Ÿ����.
				  * 
				  * ���..
				  * ���� : @@
				  * ���� : @@
				  * ���� : @@
				  * ��� : @@ 75
				  * �� ��� ���� : @@(a,b,c,d,f)
				  */
				 
				 int korean = 90;
				 int english = 100;
				 int math = 100;
				 int avg = (korean+english +math)/3;
				 System.out.println("���� :"+korean);
				 System.out.println("���� :"+english);
				 System.out.println("���� :"+math);
				 System.out.println("��� :"+avg);
				 switch(avg/10){
				 	 case 10 : 		 		 
				 	 case 9 : 
						 System.out.println(" ����� A��� �Դϴ�.");
						 break;
				 	case 8 : 
						 System.out.println(" ����� B��� �Դϴ�.");
						 break;
				 	case 7 : 
						 System.out.println(" ����� C��� �Դϴ�.");
						 break;
				 	case 6 : 
						 System.out.println(" ����� D��� �Դϴ�.");
						 break;
						 default : 
							 System.out.println(" ����� F��� �Դϴ�.");
				 }
						
				 
				 /*
				  *Switch case �������� break�� ��Ÿ���� �������� ��� ���� ���μ����� 
				  *�����Ų��.
				  */
					
					 
					 
					 
				 
	}

}
