/**
 * 
 */
package org.ness.com.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * @author localadmin
 *
 */
public class CustomizeRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration configuration) {
		configuration.setBasePath("/api");
	}
}
