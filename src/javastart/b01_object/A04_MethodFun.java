package javastart.b01_object;

import java.util.Scanner;

class Calcu{
	int num01;
	int num02;
	String cal;
	int sum;
	//두개의 값을 입력받아 덧셈처리.
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
	//숫자를 입력하고 연산자를 넣으면 원하는 출력 형식으로 나오게 
	//하는 메서드 구현..
	void print(int num01,int num02, String cal){
		//입력된 cal을 전역변수에 있는 cal로 할당.
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
		System.out.println(books+"\t 단가"+price+"\t"+cnt+"권 총:"+total);
		
		
	}
	void buyBook01(String books,int price,int cnt){
		this.cnt =cnt;
		this.books = books;
		this.price =price;
		tot = price*cnt;
		sum+=tot;
		multishow+=books+"\t 단가"+price+"\t"+cnt+"권 총:"+tot+"\n";
		
//		if(cnt>0){
//			total =multi01(price,cnt);
//		}
//		System.out.println(books+"\t 단가"+price+"\t"+cnt+"권 총:"+total);
	}
	
	void end(){
		System.out.println("\t도서구매내역");
		System.out.println(multishow);
		System.out.println("계\t"+sum);
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
		System.out.println(books+"\t 단가"+price+"\t"+cnt+"권 총:"+bs.multi01(price, cnt));
		
//		bs.print("jsp",33000,1);
//		//1단계 완료!
		
//		bs.buyBook01("java", 25000, 2);
//		bs.buyBook01("jsp",33000,1);
//		bs.end();
		
		
	}//main
/*
 * 확인예제..
 * 1단계
 * BookStore 서점..
 * 변수 : 도서명(books), 가격(price), 갯수(cnt), 계(total)
 * 메서드 : 
 *  buyBook 
 *  입력값 : 도서명과 가격, 갯수
 *  return : 계산된 값
 *  showCalcu
 *  출력 exp : java입문 단가 25000 2권 총: 50000
 *  
 *  2단계
 *  위 buyBook을 통해서 다중의 도서를 구매할 수 있으며
 *  ex) bs.buyBook("java", 25000, 2);
 *      bs.buyBook("jsp", 33000, 1);
 *      bs.end();// 한 단위 구매 처리 종료..
 *  showCalcu 메서드를 통해서 누적된 도서구매 내용을 아래 형식으로 출력
 *  도서 구매 내역
 *  java 25000  2 50000
 *  jsp  33000  1 33000
 *      계             83000
 *  
 *  
 *  
 *  
 */
//	2단계
//	Scanner 객체를 이용하여..
//	점심 식사를 주문하고, 주문된 내용을 결재처리하는 내용 
//
//	## 출력내용..
//	@@@ 식당에 오신것을 환영합니다.
//	메뉴
//	1. 짜장면 - 4500
//	2. 짬뽕   - 6000
//	3. 탕수육 - 12000
//	0. 종료
//
//	주문 번호 입력:
//	주문 수량 입력:
//
//	0.을 눌렀을 때..
//	현재 주문 내용을 list하고..
//	총 비용 계산처리..*/
//	System.out.println("행복관에 오신것을 환영합니다.");
//	Scanner s = new Scanner(System.in);
//	int chnum=0; // 선택한 주문번호
//	int price=0; // 가격
//	int count=0; // 갯수
//	int no=1;    // numbering
//	int totall=0; // 전체총계
//	Prod p=null; // 객체 초기 선언..
//	String chMenu="";
//	String show="NO\tMENU\t단가\t갯수\t계\n";  // 화면에 전체내용을 출력하기 위해.
//	while(true){
//		p=new Prod();  // 객체를 할당.. 한메모리에 객체를 할당하기 위해..
//		System.out.println("메뉴");
//		System.out.println("1. 짜장면 - 4500");
//		System.out.println("2. 짬뽕   - 6000");
//		System.out.println("3. 탕수육 - 12000");
//		System.out.println("0. 종료");
//		System.out.print("주문 번호 입력:");
//		chnum=s.nextInt();
//
//		if(chnum==1) {price=4500; chMenu="짜장면";}
//		if(chnum==2) {price=6000; chMenu="짬뽕";}
//		if(chnum==3) {price=12000; chMenu="탕수육";}
//		if(chnum==0) break;
//		p.name=chMenu;
//		p.price=price;
//		
//		System.out.print("주문갯수:");
//		count=s.nextInt();
//		p.cnt=count;
//		p.tot=p.price*p.cnt;  //  단위 계
//		totall+=p.tot;    // 총계 누적처리..
//		// 주문내용을 show문자열에 누적처리..
//		show+=(no++)+"\t"+p.name+"\t"+p.price+"\t"+p.cnt+"\t"+p.tot+"\n";
//	}
//	System.out.println("=== 계산서 ===");
//	System.out.println(show);
//	System.out.println("총 계:"+totall);

}
