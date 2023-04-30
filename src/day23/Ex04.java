package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbid = "testw8";
		String dbpw = "pass1234";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,dbid,dbpw);
		
		//2.statement 객체
		System.out.print("조회할 게시글 번호 입력 :");
		int bno = sc.nextInt();
		String sql = "SELECT*FROM board WHERE bno=" + bno;
		Statement stmt = conn.createStatement();
		
		//3. 실행 후 Resultset 객체얻기
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			System.out.println("게시글 번호 : "+bno);
			System.out.println("게시글 제목 : "+title);
			System.out.println("게시글 내용 : "+content);
			System.out.println("게시글 작성자 : "+writer);
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
