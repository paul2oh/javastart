package javastart.b02_array;

import java.util.Arrays;

class Team{
	//팀명
	String name;
	//총전적
	int totGame;
	//승수
	int vicCnt;
	//패..
	int defCnt;
	//승률
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
		System.out.println(memo+"\t"+date+"/"+time+"시\t"+requiredTime);
	}
	
}//schedule

public class A05_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Team t = new Team("빙그레", 20, 17);
			t.showCur();
			/*
			 * 객체 배열
			 * 1. 객체
			 * 	객체 [] 객체배열명 =new 객체[배열크기];
			 *  ex) Person[]p =new Person[5]; //5개 Person 객체가 들어갈 수 있는 배열..
			 * 2. 객체배열 선언, 할당
			 * 	ex) Person[]p ={new Person("하이맨1"),new Person("하이맨2"),new Person("하이맨3")} ;
			 * 3. 객체 배열을 이용한 메서드 활용.
			 *  for(int idx =0; idx<p.length; idx++){
			 *  p[idx].printAll(); // 특정 배열객체 내부에 있는 객체한개의 메서드 활용.. ==>  p.printAll();
			 *  }
			 *  for(Person ps: p){
			 *  ps.printAll();
			 *  }
			 *   
			 */
				System.out.println("팀명\t\t총게임\t승\t패\t승률");
				Team[] tArray01 = new Team[3];
				tArray01[0] = new Team("두산베어즈",21,18);
				tArray01[1] = new Team("넥센히어로즈",19,18);
				tArray01[2] = new Team("삼성라이온즈",17,14);
				for(Team tm: tArray01){
					tm.showCur();
				}
				Team[] tArray02 = {new Team("롯데자이언트",22,21),
									new Team("sk와이번스 ",22,21),
									new Team("LA다저스    ",23,19)};
				for(int idx=0;idx<tArray02.length;idx++){
					tArray02[idx].showCur();				
				}
				/*
				 * 확인예쩨
				 * 1)단계
				 * 월간계획표 작성					
				 * Schedule
				 * 		속성 : 일정내용, 날짜 , 시간(언제), 소요시간
				 *     메서드 : showSchedule() 계획내용 , 날짜/시간, 소요시간 출력..
				 *      계획 5개를 배열로 만들어 해당 메서드를 호출하는 순간 출력되게 처리.
				 */
					System.out.println("\n1단계");
					Schedule[] array1 = new Schedule[5];
					array1[0]=new Schedule("생일1","2017-01-04",12,"1시간");
					array1[1]=new Schedule("생일2","2017-01-05",1,"2시간");
					array1[2]=new Schedule("생일3","2017-01-06",2,"3시간");
					array1[3]=new Schedule("생일4","2017-01-07",3,"4시간");
					array1[4]=new Schedule("생일5","2017-01-08",4,"5시간");
					 
					
					
					for(Schedule a1 : array1){
						a1.showSchedule();
					}
					
					
					/*
					 * 2단계.
					 * 위 내용에 속성값 우선순위를 입력하여,
					 * 초기에는 우선순위를 임의로 넣지만 출력할때는, 우선순위가 높은것부터 출력
					 */
					
					System.out.println("\n2단계");
					
			
					
					Schedule[] array = new Schedule[5];
					array[0]=new Schedule("생일1","2017-01-04",12,"1시간");
					array[1]=new Schedule("생일2","2017-01-05",2,"2시간");
					array[2]=new Schedule("생일3","2017-01-06",1,"3시간");
					array[3]=new Schedule("생일4","2017-01-07",3,"4시간");
					array[4]=new Schedule("생일5","2017-01-08",4,"5시간");
					Arrays.sort(array);
					for(Schedule a1 : array){
						a1.showSchedule();
					}
					 
					
					
	}//main

}
