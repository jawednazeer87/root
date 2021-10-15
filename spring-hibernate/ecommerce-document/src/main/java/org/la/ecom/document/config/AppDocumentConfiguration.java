package org.la.ecom.document.config;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.la.ecom.document.rest.template.interceptor.RestTemplateInterceptor;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppDocumentConfiguration {

	@Autowired
	private RestTemplateInterceptor restTemplateInterceptor;
	
	@Bean
    public RestTemplate restTemplate() {
		
        RestTemplate restTemplate = new RestTemplate();
 
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        if (CollectionUtils.isEmpty(interceptors)) {
            interceptors = new ArrayList<>();
        }
        interceptors.add(restTemplateInterceptor);
        
        restTemplate.setInterceptors(interceptors);
        
        return restTemplate;
    }
	
	@Bean
	public NotificationClient notificationClient() {
		return new NotificationClient();
	}
	
	@Bean
	public MysqlClient mysqlClient() {
		return new MysqlClient();
	}

	@Bean
	public DozerBeanMapper dozerBeanMapper() {
		return new DozerBeanMapper();
	}
	
}
