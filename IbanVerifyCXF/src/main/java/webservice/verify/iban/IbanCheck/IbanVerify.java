package webservice.verify.iban.IbanCheck;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.jws.WebParam;

@WebService
public interface IbanVerify {
	
	String Verify(@XmlElement (required =true) @WebParam(name = "IBAN") String text);
}

