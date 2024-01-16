function solution(arr) {
    var answer = [];
    var i = 0;
    
    while(i<arr.length){   // i가 주어진 배열 arr의 길이보다 짧을시 실행
        if(answer.length == 0){ // answer 배열이 비어있는 경우
            answer.push(arr[i]);
            i++;
        }else{  // answer에 원소가 있고
            if(answer[answer.length-1] == arr[i]){  // answer 마지막 값이, arr[i]와 같을시
                answer.pop();
                i++;
            }else{  // answer 마지막 값이, arr[i]와 다를시
                answer.push(arr[i]);
                i++;
            }
        }
    }
    
    
    return answer.length !== 0 ? answer : [-1];
}