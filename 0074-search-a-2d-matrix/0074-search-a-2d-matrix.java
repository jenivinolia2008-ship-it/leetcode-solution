class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowsize=matrix.length;
        int colsize=matrix[0].length;
        int start=0;
        int end=rowsize * colsize-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/colsize;
            int col=mid%colsize;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;

        
    }
}