# 자릿수 더하기

def solution(n):
    answer = 0
    n = str(n)
    for i in range(len(n)):
        answer += int(n[i])
    return answer

print("결과 : {}".format(solution(123)))
