/**
 * 
 */
package com.ness.com.springav;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author localadmin
 *
 */
@ConfigurationProperties("hello")
public class HelloProperties {

	private String prefix = "Hi";
	private String suffix =  "!";
	
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}
	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
