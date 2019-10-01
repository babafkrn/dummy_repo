/**
 * 
 */
package org.ness.com;

/**
 * @author localadmin
 *
 */
public class HelloServicceImpl implements HelloService {

	private String prefix;
	private String suffix;
	
	public HelloServicceImpl(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	@Override
	public void sayHello(String name) {
		
		System.out.println(prefix + " " + name + " " + suffix);
	}
}
