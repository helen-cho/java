package professor;
import java.sql.*;

public class Database {
	public static Connection CON;
	static {
		try {
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="pass";
			Class.forName(driver);
			CON = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공!");
		}catch(Exception e) {
			System.out.println("접속실패:" + e.toString());
		}
	}
}
