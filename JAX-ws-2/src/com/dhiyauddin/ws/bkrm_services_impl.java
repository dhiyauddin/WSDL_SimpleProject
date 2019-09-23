package com.dhiyauddin.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.dhiyauddin.ws.bkrm_services")
public class bkrm_services_impl implements bkrm_services {

	@Override
	public String getBalanceEnq(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return "200.00 ";
	}

}
