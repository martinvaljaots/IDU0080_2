package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriPrecisionFault")
public class HinnakiriPrecisionException extends Exception {
    
	private HinnakiriPrecisionFault faultInfo;

    public HinnakiriPrecisionException() {
    	this("Number is too precise (too many decimal points)");
    }

    public HinnakiriPrecisionException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriPrecisionFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriPrecisionException(String message, 
    		HinnakiriPrecisionFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriPrecisionFault getFaultInfo() {
        return faultInfo;
    }
}
