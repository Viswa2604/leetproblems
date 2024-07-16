class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Stack<Integer> a=new Stack<>();
        HashMap<Integer,Integer> b=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!a.isEmpty()&&a.peek()<nums2[i]){
                a.pop();
            }
            int r=a.isEmpty()?-1:a.peek();
            a.push(nums2[i]);
            b.put(nums2[i],r);
        }
        for(int i=0;i<nums1.length;i++)
        {   
            nums1[i]=b.get(nums1[i]);
        }
        return nums1;
    }
}