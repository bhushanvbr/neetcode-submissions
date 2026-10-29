class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            int num = nums[i];
            int diff = target-num;
            if(hm.containsKey(diff)) return new int[]{hm.get(diff),i};
            hm.putIfAbsent(num, i);
        }
        return null;
    }
}
