class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str: strs){
            int[] keyArray = new int[26];
            
            for(int i = 0; i< str.length(); i++){
                char c = str.charAt(i);
                keyArray[c-'a']++;
            }
            String key = Arrays.toString(keyArray);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
