package in.kp.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.mysql.cj.jdbc.JdbcConnection;

public class UtilLib {
	
	public static void updateFines() {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=JDBCUtil.getConnection();
			if(conn!=null) {
				String sqlQuery="s";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static java.sql.Date dateConversion(String date) throws ParseException
	{
	
		SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY");
		
		Date utilDate=(Date) sdf.parse(date);
		
		long milliseconds=utilDate.getTime();
		
		java.sql.Date sqlDate=new java.sql.Date(milliseconds);
		
		return sqlDate;
		
		
	}
	public static java.sql.Date getTodayDateTime() throws ParseException
	{
		return dateConversion(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-DD-YYYY")));
	}

}
