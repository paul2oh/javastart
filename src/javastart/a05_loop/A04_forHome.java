package javastart.a05_loop;

public class A04_forHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * homework 1. �ܰ� ������ args�� �Ʒ��� ���� �����Ͱ� �ִ�. �޿� 3,000,000 0 ��Ʈ 0 100,000
		 * �ʱ��� 0 50,000 �˹� 100,000 0 1) ����/���� �׸��� ����ϼ���... 2) �Ѽ��Ծ��� ����ϼ���..
		 * 
		 * 2.�ܰ� �� �����͸� �Ʒ��� �������� ����ϼ���. �����
		 * 
		 * no �׸� ���Ծ� ����� ���ܾ� 1 �޿� 3,000,000 0 3,000,000 2 ��Ʈ 0 100,000 2,900,000
		 * 
		 * 3.�ܰ� ����/���� ���� ���� �Ǵ��Ͽ� "����/����" ���
		 * 
		 * �޿� 3,000,000 ���� ��Ʈ 100,000 ���� �ʱ��� 50,000 ����
		 * 
		 */

		/*
		 * int price=0; int cnt=0; //���հ踦 ó���Ϸ���? int tot=0; for(int
		 * idx=0;idx<args.length;idx++){ System.out.print(args[idx]+"\t");
		 * if(idx%3==1){ //�ܰ� parseInt price = Integer.parseInt(args[idx]); }
		 * if(idx%3==2){ //0 : ���ϸ� 1:�ܰ� 2:���� // %�̿��ؼ� ������ �� �ٹٲ� ó��.. cnt =
		 * Integer.parseInt(args[idx]); //���� //cnt=
		 * System.out.println(price*cnt); // /t �踦 ��� tot+=(price*cnt);//�踦 ��������
		 * ó��.. } } System.out.println("\t�Ѱ� : "+tot); }
		 */
		// 1�ܰ�
		System.out.println("\t" + "����" + "\t" + "����");
		int revenue = 0; // ����
		int expenditure = 0; // ����
		int cnt = 0;
		int tot = 0; // �Ѱ�
		int no = 1;
		for (int idx = 0; idx < args.length; idx++) {
			System.out.print(args[idx] + "\t");
			if (idx % 3 == 2) { // 0: ǰ��� 1:���Ը� 2:�����
				cnt = Integer.parseInt(args[idx]);
				System.out.println();

			}
			if (idx % 3 == 1) {
				revenue = Integer.parseInt(args[idx]);
				tot += (revenue);
			}

		}
		System.out.println("�����Ѱ�:" + tot);

		// 2�ܰ�
		System.out.println("========================");
		System.out.println("no\t�׸�\t���Ծ�\t�����\t���ܾ�");
		int tot1 = 0;
		int income1 = 0;
		int outcome1 = 0;
		for (int idx = 0; idx < args.length / 3; idx++) {

			income1 = Integer.parseInt(args[idx * 3 + 1]);
			outcome1 = Integer.parseInt(args[idx * 3 + 2]);
			tot1 += (income1 - outcome1);
			System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t" + args[idx * 3 + 2]
					+ "\t" + tot1);
		}

		// 3�ܰ�
		System.out.println("========================");
		System.out.println("no\t�׸�\t���Ծ�\t�����\t����/���⿩��");
		int tot2 = 0;
		int income2 = 0;
		int outcome2 = 0;
		for (int idx = 0; idx < args.length / 3; idx++) {

			income2 = Integer.parseInt(args[idx * 3 + 1]);
			outcome2 = Integer.parseInt(args[idx * 3 + 2]);

			if (income2 > 0 && outcome2 == 0) {
				System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t"
						+ args[idx * 3 + 2] + "\t" + "����");
			} else if (outcome2 > 0 && income2 == 0) {
				System.out.println((idx + 1) + "\t" + args[idx * 3] + "\t" + args[idx * 3 + 1] + "\t"
						+ args[idx * 3 + 2] + "\t" + "����");
			}

		}
		
		//����
		int spend=0;
		System.out.println("\t����/�����׸�(3�ܰ�)");
		System.out.println("no\t�׸�\t���Ծ�\t�����\t���ܾ�");
		for (int i=0;i<args.length/3;i++){
			if(args[i*3+2].equals("����")){
				income2=Integer.parseInt(args[i*3+1]);
				spend=0;
			}else{
				spend=Integer.parseInt(args[i*3+1]);
				income2=0;
			}
			tot+=(income2-spend);
		}
			// {} �迭 �Ҵ� - java
		 	// [] ""		- javascript
	} // main

}
