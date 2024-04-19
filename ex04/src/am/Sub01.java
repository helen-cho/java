package am;

import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run=true;
		ArrayList<Car> cars=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		
		Car car=new Car(1, "현대", "그랜저", "검정", 20000, "2020-03");
		cars.add(car);
		car=new Car(2, "쌍용", "티볼리", "파랑", 60000, "2019-06");
		cars.add(car);
		car=new Car(3, "기아", "K7", "흰색", 120000, "2021-04");
		cars.add(car);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.차량등록|2.차량조회|3.차량목록|4.차량삭제|0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1"://차량등록
				car=new Car();
				Car last=cars.get(cars.size()-1);
				int next=last.getNo() + 1;
				car.setNo(next);
				System.out.println("차량번호>" + car.getNo());
				System.out.print("차량회사>");
				String company=scan.nextLine();
				car.setCompany(company);
				System.out.print("차량모델>");
				String model=scan.nextLine();
				car.setModel(model);
				System.out.print("차량색상>");
				String color=scan.nextLine();
				car.setColor(color);
				System.out.print("주행거리>");
				String distance=scan.nextLine();
				car.setDistance(Integer.parseInt(distance));
				System.out.print("차량연식>");
				String data=scan.nextLine();
				car.setDate(data);
				cars.add(car);
				System.out.println("등록차량수:" + cars.size());
				break;
			case "2"://차량조회
				while(true) {
					System.out.print("차량번호>");
					String no=scan.nextLine();
					if(no=="") break;
					boolean find=false;
					for(Car c:cars) {
						if(Integer.parseInt(no)==c.getNo()) {
							System.out.println(c.toString());
							find=true;
						}
					}
					if(!find) System.out.println(no + "번 차량이 존재하지 않습니다.");
					System.out.println("");
				}
				break;
			case "3"://차량목록
				for(Car c:cars) {
					System.out.printf("%d\t%s\t%s\t%s\t%,dKm\t%s\n",
							c.getNo(),c.getCompany(),c.getModel(),c.getColor(),
							c.getDistance(), c.getDate());
				}
				System.out.println(cars.size() + "대 차량이 존재합니다.");
				break;
			case "4"://차량삭제
				System.out.print("차량번호>");
				String no=scan.nextLine();
				if(no=="") break;
				boolean find=false;
				for(Car c:cars) {
					if(Integer.parseInt(no)==c.getNo()) {
						System.out.println(c.toString());
						find=true;
						System.out.print("위 차량을 삭제하실래요(y)?");
						String answer=scan.nextLine();
						if(answer.equals("Y") || answer.equals("y")) {
							cars.remove(c);
							System.out.println("삭제완료!");
							break;
						}else {
							System.out.println("삭제취소!");
						}
					}
				}
				if(!find) System.out.println(no + "번 차량이 존재하지 않습니다.");
				System.out.println("");
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("0~4메뉴를 선택하세요!");
			}
		}//while
	}//run
}
