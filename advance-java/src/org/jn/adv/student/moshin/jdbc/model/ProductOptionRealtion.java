package org.jn.adv.student.moshin.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class ProductOptionRealtion {
	private String prodeuctId;
	private String optionId;
	public String getProdeuctId() {
		return prodeuctId;
	}
	public void setProdeuctId(String prodeuctId) {
		this.prodeuctId = prodeuctId;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	@Override
	public String toString() {
		return "ProductOptionRealtion [prodeuctId=" + prodeuctId + ", optionId=" + optionId + "]";
	}
	

}
