/** This function analyzes a given string to determine     * if it can be rearranged to form a palindrome.
  * @param inputString - the string to be analyzed
  * @return - TRUE if the string can be rearranged to
  *           form a palindrome, FALSE otherwise
  */
boolean canFormAPalindrome(String inputString) {
    
    // create a local copy of the input string to manipulate
    String copy = inputString;
    
    // this variable will count the number of odd occurances in the given string
    // this matters because a palindrome can have at most 1 character that appears
    // and odd number of times
    int oddCount = 0;
    
    // examine and eliminate each character in the copied string
    // this loop will iterate exactly once for every unique character
    // in the given string
    while (copy.length() > 0) {
        
        // before manipulating the string, store the length
        int startingLength = copy.length();
        
        // remove every instance of the first character from the string
        copy = copy.replace(copy.substring(0, 1), "");
        
        // compare the difference of the starting lenght and the new length
        // to find the number of instances of the letter that was eliminated
        // then, the remainder when we divide that number by 2 will be 1 if
        // the character appeared an odd number of times, or 0 if it occured
        // and even number of times, so we can increment our counter for odd
        // occurrances by the result on each iteration.
        oddCount += (startingLength - copy.length()) % 2;
    }
    
    // if more than one character occurred an odd number of times, then the
    // string cannot be rearranged to form a palindrome, otherwise, it can.
    // oddCount <= 1 = TRUE when it is a palindrome
    // oddCount <= 1 = FALSE when it is not a palindrome
    return oddCount <= 1;
}
