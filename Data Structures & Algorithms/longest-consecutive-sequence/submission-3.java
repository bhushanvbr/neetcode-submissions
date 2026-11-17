class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxLen = set.stream()
            .filter(n -> !set.contains(n - 1))
            .mapToInt(start ->{
                int len = 1;
                while(set.contains(start + len)) len ++;
                return len;
            })
            .max()
            .orElse(0);
        return maxLen;
    }
}
