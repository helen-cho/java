package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		names.add("홍길동"); //데이터입력
		names.add("심청이");
		names.add("강감찬");
		names.add("성춘향");
		names.add("이몽룡");
		
		names.remove(1); //데이터삭제
		
		for(int i=0;i<names.size();i++) { //데이터 전체출력
			String name=names.get(i);
			System.out.println(name);
		}
		
		//이름검색
		while(true) {
			System.out.print("검색할이름>");
			String sname=scan.nextLine();
			if(sname=="") {
				System.out.println("검색을 종료합니다.");
				break;
			}

			int index=-1;
			for(int i=0;i<names.size();i++) {
				String name=names.get(i);
				if(sname.equals(name)) {
					index=i+1;
				}
			}
			if(index==-1) {
				System.out.println("존재하지않습니다.");
			}else {
				System.out.println(index + "번째 존재합니다.");
			}
		}
	}
}





