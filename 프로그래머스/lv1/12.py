# 하샤드 수

def solution(x):
    answer = False
    ans = 0
    k = x
    while k!=0:
        ans += k % 10
        k = k//10
    if  x % ans == 0:
        answer = True
    return answer