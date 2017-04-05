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
public class MandatoryNamePartsException extends IllegalArgumentException{
    private final static String msg = "Name must have two part";

    public MandatoryNamePartsException(Throwable cause) {
        super(cause);
    }

    public MandatoryNamePartsException() {
        super(msg);
    }

    public MandatoryNamePartsException(String s) {
        super(msg);
    }

    public MandatoryNamePartsException(String message, Throwable cause) {
        super(msg, cause);
    }
    
}
