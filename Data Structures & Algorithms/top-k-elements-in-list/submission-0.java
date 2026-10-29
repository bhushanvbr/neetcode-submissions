class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];
        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }
        for(int i: nums){
            //count.put(i, count.getOrDefault(i, 0)+1);
            count.merge(i, 1, Integer::sum);
            
        }
        count.forEach((key, v) -> frequency[v].add(key));
        int index = 0;
        int [] res = new int[k];
        for(int i = frequency.length -1; i > 0 && index < k; i-- ){
            for(int n: frequency[i]){
                res[index++] = n;
                if(index == k) return res;
            }
        }
        return res;
    }
}
