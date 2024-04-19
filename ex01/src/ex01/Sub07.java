package ex01;

import java.util.Scanner;

public class Sub07 {
	public static void run() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("==================================================");
			System.out.println("1.100까지합계|2.100까지홀수합계|3.100까지짝수합계|0.종료");
			System.out.println("==================================================");
			System.out.print("선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "1":
				int sum=0;
				for(int i=1; i<=100; i=i+1) {
					sum=sum+i;
				}
				System.out.println("1~100 합계:" + sum);
				break;
			case "2":
				sum=0;
				for(int i=1; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println("1~100 홀수합계:" + sum);
				break;
			case "3":
				sum=0;
				for(int i=0; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println("1~100 짝수합계:" + sum);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("0~3번 메뉴를 선택하세요!");
			}//switch
		}//while
	}//method
}//class
