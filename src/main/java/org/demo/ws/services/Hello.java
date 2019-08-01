package org.demo.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
/**
 * Service Endpoint Interface (SEI)
 *
 */
@WebService // indicates this is the SEI (Service end point)
@SOAPBinding(style = Style.RPC) // define the service stype (impacts the creation of WSDL)
public interface Hello {
 
	@WebMethod  // indicates this method is a service operation
	String sayHello(String name);

}