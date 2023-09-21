
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english 
//

// Your code here along with comments explaining your approach
//traversing through matrix as its colums and rows are ascending ordered
//If target value is less than pointer[row][col] the col-- else row ++
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n -1;
         while(row < m && col >= 0){
             if(matrix[row][col] == target) {
                 return true;
             }
             else if(matrix[row][col] < target) {
                 row ++;
             }
             else {
                 col--;

             }



         }
         return false;
        

    }
}