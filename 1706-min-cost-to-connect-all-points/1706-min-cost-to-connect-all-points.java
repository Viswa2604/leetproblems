class Solution {
    public class Pair{
        int weight;
        int node;
        Pair(int weight,int node){
            this.weight=weight;
            this.node=node;
        }
    }
    public int minCostConnectPoints(int[][] points) 
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.  weight);
        boolean[] visited=new boolean[points.length];
        int sum=0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
            if(visited[pair.node]){
                continue;
            }
            else{
                visited[pair.node]=true;
                sum+=pair.weight;
                for(int i=0;i<points.length;i++){
                    if(!visited[i]){
                    int newcost=Math.abs(points[pair.node][0]-points[i][0])+
                    Math.abs(points[pair.node][1]-points[i][1]);
                    pq.add(new Pair(newcost,i));
                    }
                }
            }
        }
    return sum;

    }
}