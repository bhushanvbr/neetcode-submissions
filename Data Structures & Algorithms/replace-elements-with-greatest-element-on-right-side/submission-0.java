class Solution {
    public int[] replaceElements(int[] arr) {
        int ge = -1;
        for(int i = arr.length - 1; i>=0; i--){
            var num = arr[i];
            arr[i] = ge;
            ge = Math.max(ge, num);
        }
        return arr;
    }
}