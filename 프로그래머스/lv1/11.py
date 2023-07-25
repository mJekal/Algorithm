# 정수 내림차순으로 배치하기

def solution(n):
    answer = ''
    list = []
    n = str(n)
    for elem in n:
        list.append(int(elem))
    list.sort(reverse=True)
    for k in list:
        answer += str(k)
    return int(answer)