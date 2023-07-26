# 두 정수 사이의 합

def solution(a, b):
    answer = 0
    list = [a,b]
    if a == b:
        return a
    a = min(list)
    b = max(list)
    for i in range(a,b+1):
        answer += i
    return answer