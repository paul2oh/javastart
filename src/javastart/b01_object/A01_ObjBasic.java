package javastart.b01_object;
//person 이라는 틀을 만든다
class Person{

	public String name;
	int age; //나이
}

//ex)product 물건명 데이터를 선언한 후에 main에서 호출하세요.
class Product{
	int pcnt; //물건의 갯수
	int pprice; //물건의 단가
	int sum; // 물건의 계(갯수*단가)
	
	public String pname;
	
}
class List{

	public String lname;
	public int lprice;
	public int lcnt;
	int lsum;
}

class Scanner{
	
}
	
class Menu{
	
}

public class A01_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 만들어진 틀에서 Person 실제 메모리에 올리게 처리..
/*		Person p1 =new Person();
*		p1.name = "홍길동";
*		p1.age= 20;
*		Person p2 =new Person();
*		p2.name = "김길동";
*		p2.age= 20;
*		System.out.println("이름1"+p1.name+":"+p1.age+"살");
*		System.out.println("이름2"+p2.name+":"+p2.age+"살");
*	
*		Product pr1 = new Product();
*		pr1.pname = "스마트폰";
*		Product pr2 = new Product();
*		pr2.pname = "컴퓨터";
*		System.out.println("제품이름1"+pr1.pname);
*		System.out.println("제품이름2"+pr2.pname);
*/		
		
		
		/* 1단계
		 * 물건 3개에 데이터를 할당하고,
		 * 아래 형식으로 출력하세요.
		 * 			현재고 리스트
		 * no	물건명	단가	가격	계
		 * 1	@@@		3000	2		6000
		 * 2	@@@		4000	3		12000
		 * 3	@@@		5000	1		5000
		 */
		
		
		List l1=new List();
		l1.lname = "고구마";
		l1.lprice = 3000;	
		l1.lcnt = 2;
		l1.lsum= l1.lprice*l1.lcnt;
		
		List l2=new List();
		l2.lname= "감자";
		l2.lprice= 4000;
		l2.lcnt=3;
		l2.lsum= l2.lprice*l2.lcnt;
		
		List l3=new List();
		l3.lname= "달걀";
		l3.lprice= 5000;
		l3.lcnt=1;
		l3.lsum= l3.lprice*l3.lcnt;
		
		System.out.println("\t\t"+"현재고 리스트");
		System.out.println("no\t물건명\t단가\t가격\t계");
		System.out.println(1+"\t"+l1.lname+"\t"+l1.lprice+"\t"+l1.lcnt+"\t"+l1.lsum);
		System.out.println(2+"\t"+l2.lname+"\t"+l2.lprice+"\t"+l2.lcnt+"\t"+l2.lsum);
		System.out.println(3+"\t"+l3.lname+"\t"+l3.lprice+"\t"+l3.lcnt+"\t"+l3.lsum);
		
		/*
		 * 2단계
		 * Scanner 객체를 이용하여..
		 * 점심 식사를 주문하고, 주문된 내용을 결재처리하는 내용
		 * 
		 * ## 출력내용..
		 * @@@ 식당에 오신것을 환영합니다.
		 * 메뉴
		 * 1. 짜장면 - 4500
		 * 2. 짬뽕   - 6000
		 * 3. 탕수육 - 12000
		 * 0. 종료
		 * 
		 * 주문 번호 입력:
		 * 주문 수량 입력:
		 * 
		 * 0.을 눌렀을 때..
		 * 현재 주문 내용을 list하고..
		 * 총 비용 계산처리..
		 * 
		 */
		System.out.println("=====================================================");
		System.out.println("중화루에 오신것을 환영합니다.");
		System.out.println("메뉴\n1.짜장면-4500\n2.짬뽕-6000\n3.탕수육-12000\n0.종료");	
		
		
		int [] nums ={1,2,3,0}; 
		Menu m = new Menu();
		
		Scanner scan = new Scanner();
		
	}//main

}
