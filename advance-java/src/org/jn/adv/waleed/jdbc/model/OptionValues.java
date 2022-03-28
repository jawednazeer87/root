package org.jn.adv.waleed.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class OptionValues {
	private String id;
	private String optionId;
	private String valueName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	@Override
	public String toString() {
		return "OptionValues [id=" + id + ", optionId=" + optionId + ", valueName=" + valueName + "]";
	}

}
