class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p_num = 0;
        int y_num = 0;

        // 문자열을 소문자로 변환하고 이를 변수에 저장
        s = s.toLowerCase();
    
        for (int i = 0 ; i < s.length(); i++){
            // 'p'와 'y' 문자와 비교
            if (s.charAt(i) == 'p') {
                p_num += 1;
            } else if (s.charAt(i) == 'y') {
                y_num += 1;
            }
        }

        // p_num과 y_num이 같은지 확인
        if (y_num == p_num) {
            answer = true;
        } else {
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
