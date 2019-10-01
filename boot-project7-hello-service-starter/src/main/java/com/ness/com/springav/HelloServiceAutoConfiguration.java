/**
 * 
 */
package com.ness.com.springav;

import org.ness.com.HelloServicceImpl;
import org.ness.com.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author localadmin
 *
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {
	
	// providers opinion
	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService1(HelloProperties helloProperties) {
		
		return new HelloServicceImpl(helloProperties.getPrefix(), helloProperties.getSuffix());
	}
}
