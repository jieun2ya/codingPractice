class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int hp = health;
        int time = 1;
        int success = 0;
        
        for(int i=0; i<attacks.length; i++){
            int checkTime = attacks[i][0] - time;
            // 붕대감기로 체력 회복
            hp += checkTime * bandage[1];
            // 추가회복량 있는지 체크
            hp += checkTime/bandage[0] * bandage[2];
            // 최대 회복 넘게 회복된지 체크
            if(hp > health){
                hp = health;
            }
            // 공격 피해량만큼 피깎기
            hp -= attacks[i][1];
            if(hp <= 0){
                break;
            }
            // 현재 시간 설정
            time = attacks[i][0]+1;
        }
        int answer = hp;
        if(hp <= 0){
            answer = -1;
        }
        
        
        return answer;
    }
}