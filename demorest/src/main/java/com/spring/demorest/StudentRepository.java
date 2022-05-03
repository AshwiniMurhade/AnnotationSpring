package com.spring.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepository {
	Connection con = null;
	public StudentRepository() {
		String url = "jdbc:mysql://localhost:3306/vivek";
		String un = "root";
		String up = "0000";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, un, up);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List<Student> getStuds() throws SQLException{
		List<Student> studs = new ArrayList<Student>();
		String q = "select * from student";
		PreparedStatement pst = con.prepareStatement(q);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setMarks(rs.getInt(3));
			studs.add(s);
		}
		return studs;
	}
	public Student getStud(int id) throws SQLException {
		Student s = new Student();
		String q = "select * from student where id=?";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setMarks(rs.getInt(3));
		}
		return s;
	}
	
	public void create(Student s) throws SQLException {
		String q = "insert into student values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setInt(1, s.getId());
		pst.setString(2, s.getName());
		pst.setInt(3, s.getMarks());
		pst.executeUpdate();
	}
	
	public void update(Student s) throws SQLException {
		String q = "update student set name=?, marks=? where id=?";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setString(1, s.getName());
		pst.setInt(2, s.getMarks());
		pst.setInt(3, s.getId());
		pst.executeUpdate();
	}
	public void delete(int id) throws SQLException {
		String q = "delete from student where id=?";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setInt(1, id);
		pst.executeUpdate();
	}
}
