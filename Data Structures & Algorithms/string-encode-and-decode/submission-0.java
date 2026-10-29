class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        strs.forEach(s ->{
            String zeroPadded = "%03d".formatted(s.length());
            sb.append(zeroPadded);
            sb.append(s);
        });
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List <String> decoded = new ArrayList<>();
        while(i < str.length()){
            int len = Integer.parseInt(str.substring(i,i+3));
            String s = str.substring(i+3, i+3+len);
            i = i+3+len;
            decoded.add(s);
        }
        return decoded;
    }
}
