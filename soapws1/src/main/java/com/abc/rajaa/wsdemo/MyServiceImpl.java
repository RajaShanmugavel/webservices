package com.abc.rajaa.wsdemo;

import javax.jws.WebService;

@WebService(endpointInterface="com.abc.rajaa.wsdemo.MyService")
public class MyServiceImpl implements MyService {

	public String callMe() {
		return "JAX WS WebService";
	}


}
