package com.dhiyauddin.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service End Point Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface bkrm_services {
	@WebMethod
	String getBalanceEnq(String name);
}
