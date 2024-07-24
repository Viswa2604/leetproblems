class Solution {
    public int[] nextsmaller(int[]heights,int n){
        int arr[]=new int[n];
        Stack<Integer> ans=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=heights[i];
            while(!ans.isEmpty()&&heights[ans.peek()]>=curr){
                ans.pop();
            }
            arr[i]=ans.isEmpty()?n:ans.peek();
            ans.push(i);
        }
        return arr;
    }
    public int[] prevsmaller(int[]heights,int n){
        int arr1[]=new int[n];
        Stack<Integer> ans1=new Stack<>();
        for(int i=0;i<n;i++){
            int curr=heights[i];
            while(!ans1.isEmpty()&&heights[ans1.peek()]>=curr){
                ans1.pop();
            }
            arr1[i]=ans1.isEmpty()?-1:ans1.peek();
            ans1.push(i);
        }
        return arr1;
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int prev[]=prevsmaller(heights,n);
        int next[]=nextsmaller(heights,n);
        int maxi=0;
        int area=0;
        for(int i=0;i<n;i++){
            int l=heights[i];
            int b=next[i]-prev[i]-1;
            area=l*b;
            maxi=Math.max(area,maxi);
        }
        return maxi;
    }
}