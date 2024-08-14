class Solution {
    public int trap(int[] height) {
         int l=0;
         int r=height.length-1;
         int maxl=height[l];
         int maxr=height[r];
         int ans=0;
         while(l<r){
            if(maxl<maxr){
                ans+=maxl-height[l];
                l++;
                maxl=Math.max(maxl,height[l]);
            }
            else{
                ans+=maxr-height[r];
                r--;
                maxr=Math.max(maxr,height[r]);
            }
         }
         return ans; 
    }
}