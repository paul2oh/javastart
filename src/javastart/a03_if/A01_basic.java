package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. if(����){ 
		 * 		������ true ���� ���ö�, ó���� ���μ���. } 
		 * 		�Է� id�� password�� ���� ��, @@@�� ȯ���մϴ�.
		 * 
		 * 2. if(����){
		 * 		�� ������ true �� ��, ó���� ���μ���
		 * 		} else{
		 * 		�� ������ false �� ��,ó���� ���μ���
		 * 		}   
		 */
			String inputId = "himan";
			String password = "7879";
			if ( inputId.equals("himan")
				&& password.equals("7878")){
				System.out.println(inputId+"�� ȯ���մϴ�.");
			}	else{
				System.out.println(inputId+"���� ������ ������ �ƴմϴ�. \n �ٽ� �α����ϼ���.");
			}
				System.out.println("�ູ Ȩ������..");
		/*
		 * ����ǰ ���
		 * ���Ź�ǰ..
		 * 1. ��� 1����: 40,000��
		 * 2. ���� 1����: 25,000��
		 * 3. ���� 1����: 15,000��
		 * �Է��� ���� : ��ȣ, ���� ��. args
		 * 
		 * ������ ��ȣ�� @@�� @@@�� �����ϼ̽��ϴ�.
		 * @@���ڸ� �ֹ��ϼ̽��ϴ�.
		 * ����ǰ�� @@@�Դϴ�.
		 * 
		 * 5�� �̸� �� : ���5��
		 * 5~10�� �� : 10000�� ��ǰ��
		 * 10�� �̻� �� : 20000�� ��ǰ��
		 */
			int appleBox = Integer.parseInt(args[0]);
			String boxName1 = args[1];
			int appleBoxNum = Integer.parseInt(args[2]);
			int grapeBox = Integer.parseInt(args[3]);
			String boxName2 = args[4];
			int grapeBoxNum = Integer.parseInt(args[5]);
			int strawBox = Integer.parseInt(args[6]);
			String boxName3 = args[7];
			int strawBoxNum = Integer.parseInt(args[8]);
			String saun1 = "��� 5��";
			String saun2 = "10000�� ��ǰ��";
			String saun3 = "20000�� ��ǰ��";
			
			
			System.out.println("������ ��ȣ��"+appleBox+"��"+boxName1+"�� �����ϼ̽��ϴ�.");
			
			if(appleBoxNum<50000 && appleBoxNum >= 1){
				System.out.println(appleBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun1+"�Դϴ�.");
			} else if(appleBoxNum<100000){
				System.out.println(appleBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun2+"�Դϴ�.");
			} else if(appleBoxNum >= 100000){
				System.out.println(appleBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun3+"�Դϴ�.");
			}
			
			System.out.println("������ ��ȣ��"+grapeBox+"��"+boxName2+"�� �����ϼ̽��ϴ�.");
			
			if(grapeBoxNum<50000 && grapeBoxNum >= 1){
				System.out.println(grapeBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun1+"�Դϴ�.");
			} else if(grapeBoxNum<100000){
				System.out.println(grapeBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun2+"�Դϴ�.");
			} else if(grapeBoxNum >= 100000){
				System.out.println(grapeBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun3+"�Դϴ�.");
			}
			
			System.out.println("������ ��ȣ��"+strawBox+"��"+boxName2+"�� �����ϼ̽��ϴ�.");
			
			if(strawBoxNum<50000 && strawBoxNum >= 1){
				System.out.println(strawBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun1+"�Դϴ�.");
			} else if(strawBoxNum<100000){
				System.out.println(strawBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun2+"�Դϴ�.");
			} else if(strawBoxNum >= 100000){
				System.out.println(strawBoxNum+"���ڸ� �ֹ��ϼ̽��ϴ�."+"\n"+"����ǰ��"+ saun3+"�Դϴ�.");
			}
			
		 	
							
				
	}

}
