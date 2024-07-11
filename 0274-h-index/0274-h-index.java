class Solution {
    public int hIndex(int[] citations) {
        int i;
        int n=citations.length;
        int k=1;
        Arrays.sort(citations);
        for(i=n-1;i>=0;i--){
                if(citations[i]>=k){
                    k++;
                }
                else{
                    break;
                }
            }
            return k-1;
        }
        
    }
