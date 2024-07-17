class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> a=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            a.add(i);
        }
        while(a.size()>1){
            int stone1=a.poll();
            int stone2=a.poll();
            if(stone1!=stone2){
                a.add(stone1-stone2);
            }
        }
        int r=a.isEmpty()?0:a.peek();
        return r;
    }
}