import java.util.*;

class Solution {
    public List solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        int idx = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0)
                answer.add(i);
        }
        return answer;
    }
}