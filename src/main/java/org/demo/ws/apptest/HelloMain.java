package org.demo.ws.apptest;

import java.util.concurrent.Executor;

import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;

import org.demo.ws.services.HelloImpl;

public class HelloMain {

	public static void main(String[] args) {

		// Start web server ...
		start1();
		//start2();
		
		// Test with : http://localhost:9999/ws/hello?wsdl
	}
	
	public static void start1() {
		Endpoint endpoint = Endpoint.create(new HelloImpl());

		System.out.println("Endpoint published ? : " + endpoint.isPublished());

		Object implementor = endpoint.getImplementor();
		System.out.println("Endpoint implementor : " + implementor.getClass().getSimpleName() );

		Binding binding = endpoint.getBinding();
		System.out.println("Endpoint binding : " + binding );
		
		Executor executor = endpoint.getExecutor();

		System.out.println("Publishing endpoint... " );
		endpoint.publish("http://localhost:9999/ws/hello");

		// Do something

		System.out.println("Endpoint published ? : " + endpoint.isPublished());
	}
	
	public static void start2() {

		System.out.println("Publishing endpoint... " );
		//--- Short form 
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloImpl());
		System.out.println("Endpoint published. " );
	}
}
