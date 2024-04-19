package pm;
import java.util.*;

public class Sub02 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> nums=new ArrayList<>();
		while(true) {
			System.out.print("수입력>");
			String num=scan.nextLine();
			if(num=="") {
				System.out.println("입력을 종료합니다.");
				break;
			}else {
				nums.add(Integer.parseInt(num));
			}
		}
		//데이터갯수, 합계, 평균출력
		System.out.printf("데이터갯수:%d\n", nums.size());
		int sum=0;
		for(int i=0; i<nums.size(); i++) {
			sum=sum + nums.get(i);
		}
		System.out.printf("합계:%d\n", sum);
		System.out.printf("평균:%.2f\n", sum/(float)nums.size());
	}
}
