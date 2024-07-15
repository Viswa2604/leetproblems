class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
            if(a.contains(nums2[i]))
            c.add(nums2[i]);
        }
        int j=0;
        int n=c.size();
        int[] arr=new int[n];
        for(int i:c){
            arr[j++]=i;
        }
        return arr;



    }
}