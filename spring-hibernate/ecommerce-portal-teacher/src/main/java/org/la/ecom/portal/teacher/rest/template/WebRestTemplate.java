package org.la.ecom.portal.teacher.rest.template;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class WebRestTemplate extends RestTemplate {

	public WebRestTemplate(){
		super();
	}
	
	public WebRestTemplate(ClientHttpRequestFactory requestFactory) {
        super(requestFactory);
    }
}
