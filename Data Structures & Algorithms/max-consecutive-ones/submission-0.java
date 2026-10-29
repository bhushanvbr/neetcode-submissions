class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var maxConsecutive1 = 0;
        var consecutive1 = 0;
        for(int temp: nums){
            if(temp == 1){
                consecutive1 ++;
                maxConsecutive1 = Math.max(consecutive1, maxConsecutive1);

            }else{
                consecutive1 = 0;
            }
        }
        return maxConsecutive1;
    }
}