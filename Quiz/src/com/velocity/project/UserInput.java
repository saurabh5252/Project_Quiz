package com.velocity.project;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserInput  {
	
		PreparedStatement prs = null;
		Connection con = null;

		public  void insertParticipants(String StudentName, int Score, String Class) {
			try {
				ConnectionTest connectiontest = new ConnectionTest();
				con = connectiontest.getConnectionDetails();
				prs = con.prepareStatement("insert into data(StudentName,Score,Class)values(?,?,?)");
				prs.setString(1, Performance.getStudentName());
				prs.setInt(2, Performance.getStudentScore() );
				prs.setString(3, Performance.getStudentClass());
				int i = prs.executeUpdate();
				
				
				System.out.println("Record is Update Successfully" + i);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	
	
}
