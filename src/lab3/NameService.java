package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = null;
        // put your code here
        if (fullName == null || fullName.isEmpty()){
            throw new MandatoryNameException("Full Name must have first last name");    
        } else if (fullName.split(" ").length != 2){
            throw new MandatoryNamePartsException("Full Name must have two parts only"); 
        }
        
        
        return fullName.split(" ")[1];
    }
    
}
