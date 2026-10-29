class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> hmCounts = new HashMap<>();
        Map<Character, Integer> hmCountt = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hmCounts.put(s.charAt(i),hmCounts.getOrDefault(s.charAt(i), 0)+1);
            hmCountt.put(t.charAt(i),hmCountt.getOrDefault(t.charAt(i), 0)+1);
        }
        return hmCounts.equals(hmCountt);
    }
}
