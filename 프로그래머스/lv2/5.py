# 피보나치 수

def solution(n):
    answer = [0]*(n+1)
    answer[1] = 1
    if n >= 3:
        for i in range(2,n+1):
            answer[i] = answer[i-2] + answer[i-1]
    if n == 2:
            return 1
    return answer[n] % 1234567