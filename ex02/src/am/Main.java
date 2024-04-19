package am;

import java.util.Scanner;

public class Main {
	public static void main1(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("\n----------------------------------------");
			System.out.println("1.성적관리|2.매출현황|3.주소관리|0.프로그램종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				Sub01.run();
				break;
			case "2":
				Sub02.run();
				break;
			case "3":
				Sub03.run();
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("0~3 메뉴를 선택하세요!");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
