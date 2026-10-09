
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int start = 0;
        int countT = 0;
        int countF = 0;
        int max = 0;

        for (int end = 0; end < answerKey.length(); end++) {
            if (answerKey.charAt(end) == 'T') {
                countT++;
            } else {
                countF++;
            }

            while (Math.min(countT, countF) > k) {
                if (answerKey.charAt(start) == 'T') {
                    countT--;
                } else {
                    countF--;
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}