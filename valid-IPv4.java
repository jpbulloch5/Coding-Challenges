/** This method analyzes a given string to determine if it forms a
  * valid IPv4 address.
  * @param inputString - the string to be analyzed
  * @return - TRUE if the string forms a valid IPv4 address, FALSE otherwise
  */
boolean validIPv4(String inputString) {
    
    // create a list of the values between the '.' characters
    String[] splitString = inputString.split("[.]");
    
    // if there are not 4 values, then it is not valid
    if (splitString.length != 4) return false;
    
    // check each string in our list
    for(String eachString : splitString){
        
        // if it has fewer than 1 digit or more than 3 digits, it is not valid
        if (eachString.length() < 1 || eachString.length() > 3) return false;
        
        // if it contains any non-digit characters it is not valid
        if (!eachString.matches("\\d+")) return false;
        
        // if the length is at least 2 digits and the leading digit is a '0', it is not valid
        if (eachString.length() > 1 && eachString.charAt(0) == '0') return false;
        
        // convert the string to a number for the next test
        int number = Integer.parseInt(eachString);
        
        // if the number is outside the 0-255 range, it is not valid
        if (number < 0 || number > 255) return false;
    }
    
    // if we have not found a reason to invalidate it by now, it is valid
    return true;
}


