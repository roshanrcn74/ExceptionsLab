/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author roshann
 */
public class MandatoryNameException extends IllegalArgumentException {
    
    private final static String msg = "Method argument is mandatory";

    public MandatoryNameException() {
        super(msg);
    }

    public MandatoryNameException(String s) {
        super(msg);
    }

    public MandatoryNameException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryNameException(Throwable cause) {
        super(cause);
    }
    
}
