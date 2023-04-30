package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {

	public static void main(String[] args)throws Exception {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		System.out.println("<< JDBC 오라클 접속 테스트>>");
		Class.forName(driver);
		//1) Connetion 객체
		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
//		System.out.println("성공.");
		//2) Statement 객체
		String sql = "SELECT * FROM jobs"; // 주의 세미콜론(;)이 없어야 된다.
		Statement stmt = conn.createStatement();
		//3) Resultset 객체
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) { // rs.next() : 다음 row가 있으면 손가락으로 이동. true리턴
			
			String jobId = rs.getString("job_id");
			String jobTitle = rs.getString("job_title");
			int minSalary = rs.getInt("min_salary");
			int maxSalary = rs.getInt(4);
			System.out.println(jobId + "\t" + jobTitle + " \t" + minSalary + "\t " + maxSalary);
			
		}
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
