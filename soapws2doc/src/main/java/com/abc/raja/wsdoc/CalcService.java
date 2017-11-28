package com.abc.raja.wsdoc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface CalcService {

	@WebMethod
	String add(int a, int b);

}
