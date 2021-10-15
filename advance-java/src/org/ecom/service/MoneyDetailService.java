package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.MoneyDetail;
import org.ecom.repository.MoneyDetailRepository;
import org.ecom.util.GetSqlConnection;

public class MoneyDetailService {

	private Connection con = null;

	public MoneyDetailService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<MoneyDetail> getAllMoneyDetail() {

		List<MoneyDetail> MoneyDetailList = new ArrayList<>();

		if (con != null) {
			MoneyDetailList = MoneyDetailRepository.getAllMoneyDetail(con);
		}

		return MoneyDetailList;
	}

	public List<MoneyDetail> findMoneyDetailByUserId(long userId) {

		List<MoneyDetail> MoneyDetailList = new ArrayList<>();

		if (con != null) {
			MoneyDetailList = MoneyDetailRepository.findMoneyDetailByUserId(con, userId);
		}

		return MoneyDetailList;
	}
	
	public MoneyDetail findMoneyDetailById(long id){
		
		MoneyDetail moneydet = null;
		
		if(con!=null) {
			moneydet = MoneyDetailRepository.findMoneyDetailById(con, id);
		}
		
		return moneydet;
	}

	public int deleteMoneyDetail(long id) {
		return MoneyDetailRepository.deleteMoneyDetail(con, id);
	}

	public void createMoneyDetail(MoneyDetail moneydet) {
		MoneyDetailRepository.createMoneyDetail(con, moneydet);
	}

	public void updateMoneyDetail(MoneyDetail moneydet) {
		MoneyDetailRepository.updateMoneyDetail(con, moneydet);
	}
}
