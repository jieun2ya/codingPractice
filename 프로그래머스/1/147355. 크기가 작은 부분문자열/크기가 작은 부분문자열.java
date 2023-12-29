class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length()-len; i++) {
            if (Long.parseLong(t.substring(i, i + len)) <= num) {
                answer++;
            }
        }
        
        return answer;
    }
}