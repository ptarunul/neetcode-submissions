class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m= matrix[0].length;
        int top=0;
        int bottom=n-1;

        while(top<=bottom){
            int mid= top+(bottom-top)/2;

            if(target>matrix[mid][m-1]){
                top++;
            }else if(target<matrix[mid][0]){
                bottom--;
            }else{
                break;
            }
        }

        if(!(top<=bottom)){
            return false;
        }

        int row= top+(bottom-top)/2;

        int l=0;
        int r= m-1;

        while(l<=r){
            int mid= l+(r-l)/2;
            if(target<matrix[row][mid]){
                r=mid-1;
            }else if(target>matrix[row][mid]){
                l= mid+1;
            }else{
                return true;
            }
        }
    return false;


    }
}
