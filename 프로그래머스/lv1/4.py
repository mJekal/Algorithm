# 자연수 뒤집어 배열로 만들기

def solution(n):
    answer = []
    ans = []
    for elem in str(n):
        ans.append(int(elem))
    for i in range(len(ans) - 1, -1, -1):
        answer.append(ans[i])
    return answer
