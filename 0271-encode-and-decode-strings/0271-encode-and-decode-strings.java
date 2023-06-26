class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
            sb.append(str.length()).append((char)257).append(str);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int idx = 0;
        List<String> list = new ArrayList<>();
        
        while(s.length() > idx){
            int deliminator = s.indexOf((char)257, idx);
            int length = Integer.valueOf(s.substring(idx, deliminator));
            idx = deliminator+1+length;
            list.add(s.substring(deliminator+1, idx));
        }
        
        return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));