package com.abc.raja.wsdoc;

import javax.jws.WebService;

@WebService(endpointInterface="com.abc.raja.wsdoc.CalcService")
public class CalcServiceImpl implements CalcService {

	public String add(int a, int b) {
		return "Addition result is :"+ (a + b);
	}

}


// Note:
// Command to generate the necessary JAX WS artifact classes. Without these classes, below ERROR will be thrown
// "om.sun.xml.ws.model.RuntimeModelerException: runtime modeler error: Wrapper class com.abc.raja.wsdoc.jaxws.Add is not found. Have you run APT to generate them?"
// wsgen command
// E:\Raja\workspace\wsdoc\target\classes>wsgen -keep -cp . com.abc.raja.wsdoc.CalcServiceImpl
