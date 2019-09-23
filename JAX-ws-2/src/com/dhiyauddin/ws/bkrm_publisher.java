package com.dhiyauddin.ws;

import javax.xml.ws.Endpoint;

import org.apache.log4j.BasicConfigurator;

public class bkrm_publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9080/ws/bkrm", new bkrm_services_impl());
		BasicConfigurator.configure();
	}

}
