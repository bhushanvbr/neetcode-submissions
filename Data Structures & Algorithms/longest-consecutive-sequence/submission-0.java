class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
       Set<Integer> numSet = new HashSet<>();
       Set<Integer> seen = new HashSet<>();
       Arrays.stream(nums).forEach(n -> numSet.add(n));
       
       int longest = 1;
       for(int i = 0; i < nums.length; i++){
        if(seen.contains(nums[i])) continue;
        seen.add(nums[i]);
        int currentLongest = 1;
        boolean nextExists = true;
        int n = nums[i];
        while(nextExists){
            if(numSet.contains(n + 1)){
                currentLongest++;
                seen.add(n+1);
                n++;
            }else nextExists = false;
        }
        longest = Math.max(currentLongest, longest);
       }
       return longest;
    }
}
