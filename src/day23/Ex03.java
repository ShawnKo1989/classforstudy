package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		//전체 게시글 보기
		// SELECT*FROM boarf ORDER BY bno DESC;
		// 게시글 상세보기
		// SELECT*FROM board WHERE bno=;
		// 글쓰기
		// SELECT*FROM board(bno,title,content,writer) values(,'','','');
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbid = "testw8";
		String dbpw = "pass1234";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,dbid,dbpw);
		
		//2.statement 객체
		String sql = "SELECT*FROM board ORDER BY bno DESC";
		Statement stmt = conn.createStatement();
		
		//3. 실행 후 Resultset 객체얻기
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
//			String content = rs.getString("content");
			String writer = rs.getString("writer");
			System.out.println(bno + " / "+ title + " / "/*+content + " / "*/ + writer );
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
