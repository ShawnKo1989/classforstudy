package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbid = "testw8";
		String dbpw = "pass1234";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,dbid,dbpw);
		
		//2.statement 객체
		System.out.print("글번호 :");
		int bno = sc.nextInt();
		System.out.print("제목 : ");
		String title = sc.next();
		System.out.print("내용 : ");
		String content = sc.next();
		System.out.print("작성자 : ");
		String writer = sc.next();
		
		String sql = "INSERT INTO board(bno,title,content,writer)"
				+" VALUES("+bno+",'"+title+"','"+content+"','"+writer+"')";
		Statement stmt = conn.createStatement();
		
		//3. 실행 후 Resultset 객체얻기
//		ResultSet rs = stmt.executeQuery(sql);
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
	}
	
}
