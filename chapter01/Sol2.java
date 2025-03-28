
public class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = n*10;
        while(k/10 > 0){
            int camp = n;
            k/=10;
            n/=10;
            n*=10;
            answer += camp - n;
            n/=10;
            camp/=10;
        }
        
        
        return answer;
    }
}