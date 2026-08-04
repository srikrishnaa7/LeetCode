class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>(map.keySet());
        Collections.sort(l,(a,b)->{
            if(map.get(a).equals(map.get(b))){
                return b-a;
            }
            return map.get(b) - map.get(a);
        });
        int ans[] = new int[k];
        for(int i = 0;i<k;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}