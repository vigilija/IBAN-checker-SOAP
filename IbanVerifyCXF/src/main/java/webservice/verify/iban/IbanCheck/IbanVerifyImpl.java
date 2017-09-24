
package webservice.verify.iban.IbanCheck;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.verify.iban.IbanCheck.IbanVerify")
public class IbanVerifyImpl implements IbanVerify {

    public String Verify(String text) {
    	CheckIBAN checkIBANs = new CheckIBAN ();
    	if (checkIBANs.ibanTest(text))
    	{	return text+" TRUE";}
    	else  {return text+" FALSE";}
    }
}

