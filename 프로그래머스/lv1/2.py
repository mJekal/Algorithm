# 나머지가 1이 되는 수 찾기

def solution(n):
    for x in range(1,n):
        if n % x == 1:
            answer = x
            break
    return answer

print("결과 : {}".format(solution(10)))
