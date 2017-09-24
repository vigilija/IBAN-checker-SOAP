
package webservice.verify.iban.IbanCheck;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IbanVerifyImplTest {

    @Test
    public void testVerify() {
    	IbanVerifyImpl IbanVerify = new IbanVerifyImpl();
        String response = IbanVerify.Verify("ABC");
        assertEquals("OOOOu, something vrong :o", "ABC FALSE", response);
    }
}
