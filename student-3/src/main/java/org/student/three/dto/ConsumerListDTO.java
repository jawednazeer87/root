package org.student.three.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsumerListDTO {

	private int page;
	@JsonProperty("per_page")
	private int perPage;
	private int total;
	@JsonProperty("total_pages")
	private int totalPages;
	private List<DataDTO> data;
	private DetailDTO support;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<DataDTO> getData() {
		return data;
	}
	public void setData(List<DataDTO> data) {
		this.data = data;
	}
	public DetailDTO getSupport() {
		return support;
	}
	public void setSupport(DetailDTO support) {
		this.support = support;
	}
}
