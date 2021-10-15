package org.la.ecom.portal.teacher.rest.template.interceptor;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.stereotype.Component;

@Component
public class RestTemplateInterceptor implements ClientHttpRequestInterceptor{

	private String jwt;
	
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		
		HttpRequest wrapper = new HttpRequestWrapper(request);
		if(jwt!=null)
			wrapper.getHeaders().set("Authorization", "Bearer "+jwt);
		else if(jwt==null)
			wrapper.getHeaders().set("Authorization", null);
		
		return execution.execute(wrapper, body);
		
	}

}





