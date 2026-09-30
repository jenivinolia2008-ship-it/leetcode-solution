class Solution {
    public int findTheLongestSubstring(String s) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int state = 0;
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                state ^= 1;
            } 
            else if (ch == 'e') {
                state ^= 2;
            } 
            else if (ch == 'i') {
                state ^= 4;
            } 
            else if (ch == 'o') {
                state ^= 8;
            } 
            else if (ch == 'u') {
                state ^= 16;
            }

            if (map.containsKey(state)) {

                int start = map.get(state);

                maxlen = Math.max(maxlen, i - start);

            } 
            else {
                map.put(state, i);
            }
        }

        return maxlen;
    }
}