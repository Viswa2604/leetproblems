class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
                continue;
            }
            freq.put(i,1);
            
        }
        PriorityQueue<Map.Entry<Integer,Integer>> min=new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> temp:freq.entrySet()){
            min.add(temp);
            if(min.size()>k){
                min.poll();
            }
        }
        int[] arr=new int[k];
        int i=0;
        while(!min.isEmpty()){
            arr[i]=min.poll().getKey();
            i++;
        }
        return arr;
        
    }
}