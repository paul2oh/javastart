package javastart.b02_array;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ���� = �迭 ��ü �Ҵ�
		// type[] �迭�̸� = new type[�迭�� ũ��]
		int[] prodCnts = new int[5];
		// �����Է� ctrl+space
		prodCnts[0] = 5;
		prodCnts[1] = 8;
		prodCnts[2] = 9;
		prodCnts[3] = 5;
		prodCnts[4] = 3;
		// prodCnts[5]=2; ũ�Ⱑ 5���� �迭�� index�� 4���� �ֱ⿡ ���� �߻�
		// �迭�̸�.length : �迭�� ũ��
		for (int idx = 0; idx < prodCnts.length; idx++) {
			System.out.println((idx + 1) + "��° ��:" + prodCnts[idx]);
		}

		/*
		 * 1�ܰ� ���Ǳ⿡ �޴��� 4���� �ִ�. �� �޴��� ������ ����ϱ� ����.. �޴��� ������ �迭�� �����Ͽ� ����ϼ���.
		 * �޴���(String[])�� ���� ����ұ��? (�޴���� ������ �����ϴ� �迭 2���� ����� ����ϼ���)
		 * 
		 * @@@ @@@ @@@ @@@ @@ 3000 2000 1000 2000 1200
		 * 
		 */

		// ���Ǳ�
		System.out.println("1�ܰ�");
		String[] japanki = new String[5];
		japanki[0] = "�ݶ�";
		japanki[1] = "���̴�";
		japanki[2] = "ȯŸ";
		japanki[3] = "����ƾ��";
		japanki[4] = "Ŀ��";
		int[] price = new int[5];
		price[0] = 500;
		price[1] = 700;
		price[2] = 800;
		price[3] = 900;
		price[4] = 1500;

		for(int idx=0;idx<japanki.length;idx++){
			System.out.print(japanki[idx]+"\t");
		}
		System.out.println();
		for(int idx=0;idx<price.length;idx++){
			System.out.print(price[idx]+"\t");
		}
		
		/*
		 * 2�ܰ�
		 * 4���� ģ���� 0~5000 ������ ��ٸ��� (����)���� ������ �������.
		 * ����, ������ �ݾ��� ����ϰ�, ���� ���� �ݾ��� �� ģ���� �ݾ��� ����ϼ���(�ݾ��� 100������)
		 * 1: 500  2: 800  3: 2500 4: 900
		 * �ְ�ݾ� : 2500
		 */
		System.out.println("\n2�ܰ�\n");
		int [] sadari = new int[4];
		int max=0;
		for(int i=0;i<sadari.length;i++){
			sadari[i]=(int)Math.floor(((Math.random()*50)+1))*100;
			System.out.print((i+1)+":"+sadari[i]+"\t");
			if(sadari[i]>max){
				max=sadari[i];
				
			}
		}
		System.out.println("\n�ְ�ݾ�:"+max);
		
	
		
		

		
	}// main

}
