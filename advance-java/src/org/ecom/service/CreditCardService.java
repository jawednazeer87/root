package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.CreditCard;
import org.ecom.repository.CreditCardRepository;
import org.ecom.util.GetSqlConnection;

public class CreditCardService {

	private Connection con = null;

	public CreditCardService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<CreditCard> getAllCreditCard() {

		List<CreditCard> creditcardList = new ArrayList<>();

		if (con != null) {
			creditcardList = CreditCardRepository.getAllCreditCard(con);
		}

		return creditcardList;
	}

	public CreditCard findCreditCardByCc_Id(long creditcardcc_Id) {

		CreditCard creditcard = null;

		if (con != null) {
			creditcard = CreditCardRepository.findCreditCardByCc_Id(con, creditcardcc_Id);
		}

		return creditcard;
	}
	
	public int deleteCreditCardByCc_Id(long creditcardcc_Id) {
		return CreditCardRepository.deleteCreditCardByCc_Id(con, creditcardcc_Id);
	}

	public void createCreditCard(CreditCard creditcard) {
		CreditCardRepository.createCreditCard(con, creditcard);
	}

	public void updateCreditCard(CreditCard creditcard) {
		CreditCardRepository.updateCreditCard(con, creditcard);
	}
	
	public List<CreditCard> getCreditCardByHolder_name(String hname) {
		return CreditCardRepository.getCreditCardByHolder_name(con, hname);
	}
}