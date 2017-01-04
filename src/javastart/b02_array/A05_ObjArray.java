package javastart.b02_array;

import java.util.Arrays;

class Team{
	//����
	String name;
	//������
	int totGame;
	//�¼�
	int vicCnt;
	//��..
	int defCnt;
	//�·�
	double vicRatio;
	Team(String name, int vicCnt, int defCnt){
		this.name=name;
		this.totGame=vicCnt+defCnt;
		this.vicCnt=vicCnt;
		this.defCnt=defCnt;
	}
	void showCur(){
		vicRatio=vicCnt/(double)totGame;
		System.out.println(name+"\t"+totGame+"\t"+vicCnt+"\t"+defCnt+"\t"+vicRatio);
	}
}//class

class Schedule implements Comparable<Schedule>{
	String memo;
	String date;
	int time;
	String requiredTime;
	Schedule(String memo,String date,int time,String requiredTime ){
		this.memo=memo;
		this.date=date;
		this.time=time;
		this.requiredTime=requiredTime;
		
	}
	
	public int compareTo(Schedule array){
		if(this.time<array.time){
			return -1;
		} else if(this.time == array.time ){
			return 0;
		} else {
			return 1;
		}
	}
	
	void showSchedule(){
		System.out.println(memo+"\t"+date+"/"+time+"��\t"+requiredTime);
	}
	
}//schedule

public class A05_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Team t = new Team("���׷�", 20, 17);
			t.showCur();
			/*
			 * ��ü �迭
			 * 1. ��ü
			 * 	��ü [] ��ü�迭�� =new ��ü[�迭ũ��];
			 *  ex) Person[]p =new Person[5]; //5�� Person ��ü�� �� �� �ִ� �迭..
			 * 2. ��ü�迭 ����, �Ҵ�
			 * 	ex) Person[]p ={new Person("���̸�1"),new Person("���̸�2"),new Person("���̸�3")} ;
			 * 3. ��ü �迭�� �̿��� �޼��� Ȱ��.
			 *  for(int idx =0; idx<p.length; idx++){
			 *  p[idx].printAll(); // Ư�� �迭��ü ���ο� �ִ� ��ü�Ѱ��� �޼��� Ȱ��.. ==>  p.printAll();
			 *  }
			 *  for(Person ps: p){
			 *  ps.printAll();
			 *  }
			 *   
			 */
				System.out.println("����\t\t�Ѱ���\t��\t��\t�·�");
				Team[] tArray01 = new Team[3];
				tArray01[0] = new Team("�λ꺣����",21,18);
				tArray01[1] = new Team("�ؼ��������",19,18);
				tArray01[2] = new Team("�Ｚ���̿���",17,14);
				for(Team tm: tArray01){
					tm.showCur();
				}
				Team[] tArray02 = {new Team("�Ե����̾�Ʈ",22,21),
									new Team("sk���̹��� ",22,21),
									new Team("LA������    ",23,19)};
				for(int idx=0;idx<tArray02.length;idx++){
					tArray02[idx].showCur();				
				}
				/*
				 * Ȯ�ο���
				 * 1)�ܰ�
				 * ������ȹǥ �ۼ�					
				 * Schedule
				 * 		�Ӽ� : ��������, ��¥ , �ð�(����), �ҿ�ð�
				 *     �޼��� : showSchedule() ��ȹ���� , ��¥/�ð�, �ҿ�ð� ���..
				 *      ��ȹ 5���� �迭�� ����� �ش� �޼��带 ȣ���ϴ� ���� ��µǰ� ó��.
				 */
					System.out.println("\n1�ܰ�");
					Schedule[] array1 = new Schedule[5];
					array1[0]=new Schedule("����1","2017-01-04",12,"1�ð�");
					array1[1]=new Schedule("����2","2017-01-05",1,"2�ð�");
					array1[2]=new Schedule("����3","2017-01-06",2,"3�ð�");
					array1[3]=new Schedule("����4","2017-01-07",3,"4�ð�");
					array1[4]=new Schedule("����5","2017-01-08",4,"5�ð�");
					 
					
					
					for(Schedule a1 : array1){
						a1.showSchedule();
					}
					
					
					/*
					 * 2�ܰ�.
					 * �� ���뿡 �Ӽ��� �켱������ �Է��Ͽ�,
					 * �ʱ⿡�� �켱������ ���Ƿ� ������ ����Ҷ���, �켱������ �����ͺ��� ���
					 */
					
					System.out.println("\n2�ܰ�");
					
			
					
					Schedule[] array = new Schedule[5];
					array[0]=new Schedule("����1","2017-01-04",12,"1�ð�");
					array[1]=new Schedule("����2","2017-01-05",2,"2�ð�");
					array[2]=new Schedule("����3","2017-01-06",1,"3�ð�");
					array[3]=new Schedule("����4","2017-01-07",3,"4�ð�");
					array[4]=new Schedule("����5","2017-01-08",4,"5�ð�");
					Arrays.sort(array);
					for(Schedule a1 : array){
						a1.showSchedule();
					}
					 
					
					
	}//main

}
