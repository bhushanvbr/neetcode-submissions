class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        strs.forEach(s ->{
            sb.append(s.length()).append("#").append(s);
        });
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List <String> decoded = new ArrayList<>();
        while(i < str.length()){
            int end = str.indexOf("#",i);
            int len = Integer.parseInt(str.substring(i,end));
            String s = str.substring(end+1, end+1+len);
            i = end + 1 + len;
            decoded.add(s);
        }
        return decoded;
    }
}
