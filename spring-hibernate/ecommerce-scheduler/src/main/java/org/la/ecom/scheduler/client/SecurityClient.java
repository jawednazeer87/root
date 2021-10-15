package org.la.ecom.scheduler.client;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class SecurityClient {

	@Autowired
	RestTemplate restTemplate;
	
	private String url;
	
	public void setUrl(final String url) {
		this.url = url;
	}
	
	public <T> T getForObject(String url, Class<T> responseType) throws RestClientException {
		
		return restTemplate.getForObject(this.url+url, responseType);
	}
	
	public <T> T postForObject(String url, @Nullable Object request, Class<T> responseType)
			throws RestClientException, URISyntaxException {

		return restTemplate.postForObject(this.url+url, request, responseType);
	}
}
