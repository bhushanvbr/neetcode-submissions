class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        //int k = 0
        for(int tmp: nums){
            if(tmp != val){
                nums[j] = tmp;
                
                j++;
            }
        }
        return j;
    }
}