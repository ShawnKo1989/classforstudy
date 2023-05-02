package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex6 {
	public static void main(String[] args) throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String var1 = "St";
		String var2 = "g";
		int var3 = 7000;
		String sql = "SELECT					 *									"
					+ " FROM employees												"
					+ " WHERE (first_name LIKE ? OR last_name LIKE ?)AND salary >= ?";
//					+ " ORDER BY ? DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,var1+"%");
		pstmt.setString(2, "%"+var2);
		pstmt.setInt(3, var3);
//		pstmt.setString(4, "employee_id");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int employeeId = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			int salary = rs.getInt("salary");
			System.out.println(employeeId+" : " +firstName + " "+ lastName + " "+ salary);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
}
