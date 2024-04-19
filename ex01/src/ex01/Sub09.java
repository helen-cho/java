package ex01;

import java.util.*;

public class Sub09 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		String[] names=new String[100];
		String[] jusos=new String[100];
		String[] phones=new String[100];
		names[0]="홍길동";
		jusos[0]="인천 서구 경서동";
		phones[0]="010-1010-2020";
		names[1]="심청이";
		jusos[1]="인천 부평구 계산동";
		phones[1]="010-1010-3030";
		int count=2;
		
		while(run) {
			System.out.println("\n\n-----------------------------");
			System.out.println("1.주소등록|2.주소출력|0.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			String  menu=scan.nextLine();
			switch(menu) {
			case "1":
				System.out.print("이름>");
				String name=scan.nextLine();
				System.out.print("주소>");
				String juso=scan.nextLine();
				System.out.print("전화>");
				String phone=scan.nextLine();
				names[count]=name;
				jusos[count]=juso;
				phones[count]=phone;
				count=count+1;
				break;
			case "2":
				for(int i=0; i<count; i=i+1) {
					System.out.printf("%s\t%s\t%s\n",names[i],phones[i],jusos[i]);
				}
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("0~2메뉴를 선택하세요!");
			}//switch
		}//while
	}//method
}//class
