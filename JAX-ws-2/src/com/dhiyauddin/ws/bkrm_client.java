package com.dhiyauddin.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class bkrm_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:9080/ws/bkrm?wsdl");
		QName qname = new QName("http://ws.dhiyauddin.com/", "bkrm_services_implService");
		Service service = Service.create(url, qname);
		bkrm_services bkrm = service.getPort(bkrm_services.class);
		System.out.println(bkrm.getBalanceEnq("116401212103"));

	}

}
