package day23;

import java.sql.DriverManager;

// JDBC 테스트 (접속테스트)
public class Ex01 {
	public static void main(String[] args) throws Exception{
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		System.out.println("<< JDBC 오라클 접속 테스트>>");
		Class.forName(driver);
		DriverManager.getConnection(url, dbId, dbPw);
		System.out.println("성공.");
		

		
	}

}
