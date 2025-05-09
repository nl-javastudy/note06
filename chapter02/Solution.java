class Solution {
    public String solution(String my_string, int n) {
        char[] real = my_string.toCharArray();

        StringBuilder asap = new StringBuilder("");

        for(char i : real){
            String a;
            a = String.valueOf(i);
            asap.append(a.repeat(n));
        }

        String answer = asap.toString();



        return answer;
    }
}