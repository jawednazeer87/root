package org.jn.adv.student.moshin.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Finish {
	private String id;
	private String finishName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFinishName() {
		return finishName;
	}
	public void setFinishName(String finishName) {
		this.finishName = finishName;
	}
	@Override
	public String toString() {
		return "Finish [id=" + id + ", finishName=" + finishName + "]";
	}
	
	

}
