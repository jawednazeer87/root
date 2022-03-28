package org.jn.adv.waleed.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class OptionTableDTO {
	private String id;
	private String optionName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	@Override
	public String toString() {
		return "OptionTable [id=" + id + ", optionName=" + optionName + "]";
	}

}
