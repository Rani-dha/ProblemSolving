class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    
    int diagonalPrimary = 0, diagonalSecondary=0;
    int n = arr.size();
    for(int i=0; i<n; i++){
        for(int j=0; j<n ; j++){
            if (i==j)
               diagonalPrimary += arr.get(i).get(j);
            if((i+j) == (n-1))
               diagonalSecondary  += arr.get(i).get(j);                  
        }
    }
    return Math.abs(diagonalPrimary - diagonalSecondary);
   }

}
