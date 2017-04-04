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

    public MandatoryNameException() {
    }

    public MandatoryNameException(String s) {
        super(s);
    }

    public MandatoryNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public MandatoryNameException(Throwable cause) {
        super(cause);
    }
    
}
