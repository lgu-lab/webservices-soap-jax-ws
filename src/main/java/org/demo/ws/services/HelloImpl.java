package org.demo.ws.services;

import javax.jws.WebService;

/**
 * Service Implementation Bean (SIB) 
 *
 */
@WebService(endpointInterface = "org.demo.ws.services.Hello") // links the SIB to SEI
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
