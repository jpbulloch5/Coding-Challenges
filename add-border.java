/** This method accepts a "picture" as an array of Strings and generates
  * a border of asteriscs that encompases the original elements as a
  * frame would a picture.  The original "picture" remains within the border.
  * @param picture - an array of strings that simulates a picture
  */
String[] addBorder(String[] picture) {
    
    // constants for readability and to eliminate the use of "magic numbers"
    final int BORDER_HEIGHT = picture.length + 2;       // the hight of the border
    final int BORDER_LENGTH = picture[0].length() + 2;  // the length of the border
    final int TOP_BORDER = 0;                           // index of the top border
    final int BOTTOM_BORDER = BORDER_HEIGHT - 1;        // index of the bottom border
    
    // a new array to store the output strings with the borders added
    String[] output = new String[BORDER_HEIGHT];
    
    // starting at the row after the top border
    int row = TOP_BORDER + 1;
    
    // examine each line in the supplied picture
    for (String line : picture){
        
        // concat "*" to the beginning and end, then add it to the output array
        output[row++] = "*" + line + "*";
    }
    
    // initialize the top and bottom borders to empty strings to avoid including a null
    output[TOP_BORDER] = "";
    output[BOTTOM_BORDER] = "";
    
    // concat a number of "*" characters of the appropiate length to become
    // the top and bottom borders
    for (int col = 0; col < BORDER_LENGTH; col++){
        output[TOP_BORDER] += "*";
        output[BOTTOM_BORDER] += "*";
    }
    
    // return the ouput array of strings that includes the border
    return output;
}
