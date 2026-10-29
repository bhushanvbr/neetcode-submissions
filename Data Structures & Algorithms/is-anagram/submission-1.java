class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sorted = s.toCharArray();
        char[] tsorted = t.toCharArray();
        Arrays.sort(sorted);
        Arrays.sort(tsorted);
        return Arrays.equals(sorted, tsorted);
    }
}
