package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegativeFault")
public class HinnakiriNegativeException extends Exception {
	private HinnakiriNegativeFault faultInfo;

    public HinnakiriNegativeException() {
    	this("Number is negative");
    }

    public HinnakiriNegativeException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriNegativeFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNegativeException(String message, 
    		HinnakiriNegativeFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriNegativeFault getFaultInfo() {
        return faultInfo;
    }
	
}
