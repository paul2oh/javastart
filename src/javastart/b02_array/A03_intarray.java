package javastart.b02_array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class A03_intarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �迭 ����� �ʱ� ������ �Ҵ�
		 * 
		 * cf) �ڹٽ�ũ��Ʈ {}: ��ü, []�迭
		 * 		 �ڹ�{}: �迭
		 * 		���� = {�迭������1,�迭������2,�迭������3};
		 * 		==for ������ �迭������ ������ ����..==
		 * 		  for(������ü ��������:�迭��ü){
		 * 	}
		 */
			String[]students={"ȫ�浿","��浿","�ű浿"};
			for(int idx=0;idx<students.length;idx++){
				System.out.println(idx+1+"��"+students[idx]);
				
			}
			
			System.out.println("for(������ü ��������:�迭��ü)");
			for(String student:students){
				System.out.print(student+"\t");
			}
			
			/*
			 * 1�ܰ� Ȯ�ο���..
			 * ����� : ���� , ���� , ����
			 * ���� : 80  90 70
			 * �� ������ ����� �Ҵ��� �ٷ� �ϸ鼭 ó���ϰ�..
			 * for(������ü : �迭��ü) ���·� ����ϼ���..
			 * 
			 */
			System.out.println("\n1�ܰ�");
			String [] subjects = {"����","����","����"};
			int [] points = {80,90,70};
			for(String subject:subjects){
				System.out.print(subject+"\t");
			}
			System.out.println();
			for(int point:points){
				System.out.print(point+"\t");
				
			}
			
			/*
			 * 2�ܰ�: �������, ����ϰ�.
			 * 		  �������� - ����� ���  
			 */
			
//			System.out.println("\n2�ܰ�");
//			
//			HashMap<String,Integer> map =new HashMap<String,Integer>();
//			map.put("����",80);
//			map.put("����",90);
//			map.put("����", 70);
//			
//			Collection Values = map.values();
//			Iterator iter=values.iterator();
//			int total=0;
//			while(iter.hasNext()){
//				total+=(Interger)iter.next();
//			}
			
			
			
			
			
			
	}// main

}
