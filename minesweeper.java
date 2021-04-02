/** This method analyzes a matrix of boolean values meant to represent
  * a minefield, as in the classic Minesweeper game.  The method's output
  * is a matrix of numbers such that each cell in the matrix contains the
  * number of adjacent bombs.
  * @param inputMatrix - a matrix of boolean values representing the presence/abscence of bombs
  * @return - a matrix of integer values representing adjacent bombs for each cell
 */
int[][] minesweeper(boolean[][] inputMatrix) {
    
    // this constant is to improve readability, since 'true' entries in the matrix
    // indicate the presence of a bomb
    final boolean BOMB = true;
    
    // a new matrix of integers to store the output
    int[][] outputMatrix = new int[inputMatrix.length][inputMatrix[0].length];
    
    // examine each row and column in the input matrix
    for(int row = 0; row < inputMatrix.length; row++){
        for(int col = 0; col < inputMatrix[0].length; col++){
            
            // if the current entry in the matrix contains a bomb...
            if(inputMatrix[row][col] == BOMB){
                
                // find the topmost valid adjacent row and leftmost column (not out of bounds)
                int startRow = (row > 0) ? row - 1: row;
                int startCol = (col > 0) ? col - 1: col;
                
                // find the bottommost valid adjacent row and rightmost column (not out of bounds)
                int endRow = (row < inputMatrix.length - 1) ? row + 1: row;
                int endCol = (col < inputMatrix[0].length - 1) ? col + 1: col;
                
                // find all valid adjacent entries in the matrix
                for(int adjacentRow = startRow; adjacentRow <= endRow; adjacentRow++){
                    for(int adjacentCol = startCol; adjacentCol <= endCol; adjacentCol++){
                        
                        // increment the output matrix entry so long as it is not the entry that
                        // actually contains the bomb currently being considered
                        if (!(adjacentRow == row && adjacentCol == col)){
                            outputMatrix[adjacentRow][adjacentCol]++;
                        }
                    }
                }
            }
        }
    }
    
    // return the completed output matrix
    return outputMatrix;
}
