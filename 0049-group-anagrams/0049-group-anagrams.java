class Solution {
    public List<List<String>> groupAnagrams(String[] strs)      {
           HashMap<String,List<String>>mp=new HashMap<>();
           for(int i=0;i<strs.length;i++){
            String temp=strs[i];
            char[] sorrted=temp.toCharArray();
            Arrays.sort(sorrted);
            String sort=new String(sorrted);
            if(!mp.containsKey(sort)){
                mp.put(sort,new ArrayList<>());
            }
            mp.get(sort).add(strs[i]);
           }
           return new ArrayList<>(mp.values());
    }
}