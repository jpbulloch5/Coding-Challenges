/** This function analyzes an array of integers to determine the maximum
  * difference between adjacent array elements.
  * @param inputArray - the array of integers to be analyzed
  * @return - the maximum adjacent difference found between array elements
  */
int maxiAdjacentDifference(int[] inputArray) {
    // we need a variable to store the maximum difference we have found so far
    int maxDifference = 0;
    
    // examine each pair of elements (i-1, i) in the input array
    for (int i = 1; i < inputArray.length; i++){
        
        // find the absolute difference betweenthe current two elements
        int thisDifference = Math.abs(inputArray[i-1] - inputArray[i]);
        
        // check if the current difference is greater than the max difference found so far
        // if so, update the max difference to this new difference
        if (thisDifference > maxDifference) maxDifference = thisDifference;
    }
    
    // by this time, we know that our variable contains the maximal adjacent difference per
    // the requirements in the activity description.
    return maxDifference;
}
