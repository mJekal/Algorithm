# x만큼 간격이 있는 n개의 숫자

def solution(x, n):
    answer = []
    k = x
    for _ in range(n):
        answer.append(x)
        x+=k
    return answer

print("결과 : {}".format(solution(2,5)))

