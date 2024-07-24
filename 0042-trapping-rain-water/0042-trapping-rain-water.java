class Solution {
    public int trap(int[] height)
    {
          int leftmax=height[0];
          Stack<Integer> rightmax=new Stack<>();
          int n=height.length;
          rightmax.push(height[n-1]);
          for(int i=n-1;i>=2;i--)
          {
            rightmax.push(Math.max(height[i],rightmax.peek()));
          }
          int totwat=0;
          for(int i=1;i<n-1;i++)
          {
            int minimum=Math.min(rightmax.peek(),leftmax);
            int trap=minimum-height[i];
            trap=Math.max(0,trap);
            totwat+=trap;
            rightmax.pop();
            leftmax=Math.max(leftmax,height[i]);
          }
          return totwat;
    }
}