package pm;

import java.io.*;
import java.util.*;
import am.Car;

public class Sub01 {
	public static void run() {
		File file=new File("c:/data/java/car.txt");
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			String[] items=new String[6];
			while((line=reader.readLine())!=null) {
				items = line.split(",");
				Car car=new Car();
				car.setNo(Integer.parseInt(items[0]));
				car.setCompany(items[1]);
				car.setModel(items[2]);
				car.setColor(items[3]);
				car.setDistance(Integer.parseInt(items[4]));
				car.setDate(items[5]);
				
				System.out.println("번호:" + car.getNo());
				System.out.println("회사:" + car.getCompany());
				System.out.println("모델:" + car.getModel());
				System.out.println("색상:" + car.getColor());
				System.out.printf("주행거리:%,dKm\n", car.getDistance());
				System.out.println("년식:" + car.getDate());
				System.out.println("-----------------------------");
			}
			
		}catch(Exception e) {
			System.out.println("오류:" + e.toString());
		}
	}
}
