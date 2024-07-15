class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> p=new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return p;
        }
        int left=0,top=0,right=m-1,bottom=n-1;
        while(left<=right&&top<=bottom){
            int i;
            for(i=left;i<=right;i++){
                p.add(matrix[top][i]);
            }
            top++;
            for(i=top;i<=bottom;i++){
                p.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(i=right;i>=left;i--){
                p.add(matrix[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(i=bottom;i>=top;i--){
                p.add(matrix[i][left]);
            }
            left++;}
        }
        return p;
    }
}