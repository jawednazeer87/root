package org.la.core.java.student.nizaam.jdbc.repository;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;

import org.la.core.java.student.nizaam.jdbc.model.Presentation;
import org.la.core.java.student.nizaam.jdbc.util.ConnectionUtil;

public class PresentationRepository {
	
	private Connection connection;

	public void createPresentation(int bookedCompanyId, int bookedRoomId, Timestamp startTime, Timestamp endTime) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		int exeUpdate =0;
		
		try {
			String query = "insert into presentation(booked_company_id,booked_room_id,start_time,end_time) values(?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, bookedCompanyId);
			ps.setInt(2, bookedRoomId);
		
			ps.setTimestamp(3, startTime);
			ps.setTimestamp(4,  endTime);
			
			exeUpdate = ps.executeUpdate();
			
			if(exeUpdate>0) {
				System.out.println("Successfully created presentation :"+ exeUpdate);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps!=null)
					ps.close();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
	}
	
	public Presentation findById(int presentationId) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Presentation p =null;
		
		try {
			String query = "select * from presentation where presentation_id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, presentationId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				p = new Presentation(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getTimestamp(4),rs.getTimestamp(5));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps!=null)
					ps.close();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				if(rs!=null)
					rs.close();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
		return p;
	}
}
