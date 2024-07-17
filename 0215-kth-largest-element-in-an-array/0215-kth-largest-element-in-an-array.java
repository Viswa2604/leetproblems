class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> a=new PriorityQueue<>();
       for(int i:nums){
         a.add(i);
        if(a.size()>k){
            a.remove();
        }
       
       }
       return a.peek();
    }
}