class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row=0;
    int col=matrix[0].length-1;
    while(row<matrix.length && col>=0){
        int current_val = matrix[row][col];
        if(current_val == target){
            return true;
        }
        else if(current_val >target){
            col--;
        }
        else{
            row++;
        }


    }
    return false;

} 
}
