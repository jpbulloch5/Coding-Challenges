/** This method analyzes an array of integers representing the
  * location of obstacles present when traversing a theoretical
  * line.  Given these obstacles, the method finds the shortest
  * consistant "jump" distance required to avoid all obstacles.
  * This minimum consistant jump length is then returned as the
  * result.
  * @param inputArray - the array of integers to be analyzed
  * @return - the minimum consistent jump length required to avoid all obstacles.
  */
int minConsistantJump(int[] inputArray) {
    
    // a flag to check if the jump lenght is valid, initialized to false for the while loop
    boolean validJumpLength = false;
    
    // the jump length must be >= 2 in order to jump any numbers
    // it is incremented in the first line of the while loop,
    // so it is initialized to 1 here, but it will be 2 on the check
    int jumpLenght = 1;
    
    // while we have not found a valid jump length yet...
    while(!validJumpLength){
        
        // increment the jump lenght for this iteration of the loop
        jumpLenght++;
        
        // assume that the jump lenght will work
        validJumpLength = true;
        
        // check it against all entries in the input array
        for(int i = 0; i < inputArray.length; i++){
            
            // if any element of the array is a multiple of the jump lenght
            if(inputArray[i] % jumpLenght == 0){
                
                // then the jump length is not valid
                validJumpLength = false;
                
                // and we do not need to look any further through the array
                break;
            }          
        }
    }
    
    // if we have finished the while loop, we know we have a valid jump lenght, so return it
    return jumpLenght;
}
