package sale;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	      boolean run=true;
	      Scanner scan=new Scanner(System.in);
	      SaleDAO dao=new SaleDAO();
	      while(run) {
	         System.out.println("------------------------------------------");
	         System.out.println("1.판매등록|2.판매조회|3.판매목록|4.판매삭제|0.종료");
	         System.out.println("------------------------------------------");
	         System.out.print("선택>");
	         String menu=scan.nextLine();
	         switch(menu) {
	         case "1":
	        	 //새상품코드 생성
	        	 Sale sale=new Sale();
	        	 ArrayList<Sale> list=dao.list();
	        	 Sale lastSale=list.get(list.size()-1);
	        	 int newCode=lastSale.getCode()+1;
	        	 sale.setCode(newCode);
	        	 System.out.println("판매코드>" + newCode);
	        	
	        	 System.out.print("상품이름>");
	        	 String name=scan.nextLine();if(name=="") break;
	        	 sale.setName(name);
	        	 
	        	 while(true) {
	        		 System.out.print("판매가격>");
	        		 String price=scan.nextLine();
	        		 if(check(price)) {
	        			 sale.setPrice(Integer.parseInt(price));
	        			 break;
	        		 }
	        	 }
	        	 while(true) {
	        		 System.out.print("판매수량>");
	        		 String qnt=scan.nextLine();
	        		 if(check(qnt)) {
	        			 sale.setQnt(Integer.parseInt(qnt));
	        			 break;
	        		 }
	        	 }
	        	 dao.insert(sale);
	        	 System.out.println("매출등록완료!");
	        	 break;
	         case "2"://판매조회
	        	 while(true) {
	        		 System.out.print("조회할코드>");
	        		 String code=scan.nextLine();
	        		 if(code=="") {
	        			 System.out.println("조회를 종료합니다.");
	        			 break;
	        		 }
	        		 if(check(code)) { //code가 숫자인경우
	        			 Sale sale1=dao.read(Integer.parseInt(code));
	        			 if(sale1.getName()==null) {
	        				 System.out.println(code + "번 매출정보가 존재하지 않습니다.");
	        			 }else {
	        				 System.out.println("상품이름:" + sale1.getName());
	        				 System.out.println("판매가격:" + sale1.getPrice());
	        				 System.out.println("판매수량:" + sale1.getQnt());
	        			 }
	        			 System.out.println("");
	        		 }
	        	 }
	        	 break;
	         case "3":
	        	ArrayList<Sale> array=dao.list();
	        	for(Sale s:array) {
	        		System.out.printf("%d\t%s\t%d만원\t%3d개\t%,8d만원\n",
	        				s.getCode(),s.getName(),s.getPrice(),s.getQnt(),
	        				s.getPrice()*s.getQnt());
	        	}
	        	System.out.println(array.size() + "개 상품이 존재합니다.");
	            break;
	         case "4":   
	        	 while(true) {
	        		 System.out.print("삭제할코드>");
	        		 String code=scan.nextLine();
	        		 if(code=="") {
	        			 System.out.println("삭제를 종료합니다.");
	        			 break;
	        		 }
	        		 if(check(code)) { //code가 숫자인경우
	        			 Sale sale1=dao.read(Integer.parseInt(code));
	        			 if(sale1.getName()==null) {
	        				 System.out.println(code + "번 매출정보가 존재하지 않습니다.");
	        			 }else {
	        				 System.out.println("상품이름:" + sale1.getName());
	        				 System.out.println("판매가격:" + sale1.getPrice());
	        				 System.out.println("판매수량:" + sale1.getQnt());
	        				 System.out.print("삭제하실래요(y)?");
	        				 String sel=scan.nextLine();
	        				 if(sel.equals("Y") || sel.equals("y")) {
	        					 dao.delete(Integer.parseInt(code));//code 파일에서 삭제
	        					 System.out.println("매출삭제 완료!");
	        				 }else {
	        					 System.out.println("매출삭제 취소!");
	        				 }
	        			 }
	        			 System.out.println("");
	        		 }
	        	 }
	        	 break;
	         case "0":
	            run=false;
	            break;
	         default:
	            System.out.println("0~4 메뉴를 다시 선택하세요!");
	         }//switch
	      }//while
	      System.out.println("프로그램을 종료합니다.");
	}//method
	
	//숫자인지 체크 메서드
	public static boolean check(String str) {
		try {
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("숫자로 입력하세요!");
			System.out.println("");
			return false;
		}
	}
}//class




