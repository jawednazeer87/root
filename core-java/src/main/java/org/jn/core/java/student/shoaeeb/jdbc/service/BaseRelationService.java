package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.BaseRelation;
import org.jn.core.java.student.shoaeeb.jdbc.repository.BaseRelationRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class BaseRelationService {
	
	public static Connection con = null;
	public BaseRelationService() {
		con = GetSqlConnection.getConnection();
	}
	
	public List<BaseRelation> getAllRelation() {
		List<BaseRelation> list = BaseRelationRepository.getAllRelation(con);
		return list;
	}
	public static BaseRelation findBaseRelationById(int id) {
		BaseRelation bs = BaseRelationRepository.findBaseRelationById(con, id);
		return bs;
	}
	
	public int updateTable(BaseRelation bs)
	{
		int count = BaseRelationRepository.updateTable(con, bs);
		return count;
	}
	
	public int deleteById(int id)
	{
		int count = BaseRelationRepository.deleteById(con, id);
		return count;
	}
}
