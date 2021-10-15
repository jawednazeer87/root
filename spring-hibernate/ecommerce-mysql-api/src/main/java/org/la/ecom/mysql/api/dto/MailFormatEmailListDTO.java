package org.la.ecom.mysql.api.dto;

import java.io.Serializable;
import java.util.List;

public class MailFormatEmailListDTO implements Serializable{

	private static final long serialVersionUID = -6810754688448438811L;
	
	private List<UserDTO> userList;
	private MailFormatDTO mailFormatDTO;
	
	public List<UserDTO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDTO> userList) {
		this.userList = userList;
	}

	public MailFormatDTO getMailFormatDTO() {
		return mailFormatDTO;
	}

	public void setMailFormatDTO(MailFormatDTO mailFormatDTO) {
		this.mailFormatDTO = mailFormatDTO;
	}
	
}
