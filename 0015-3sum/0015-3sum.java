class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> temp=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            int j=i+1,sum=0;
            int k=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp1=Arrays.asList(nums[i],nums[j],nums[k]);
                    temp.add(temp1);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }

        }
        return temp;
    }
}