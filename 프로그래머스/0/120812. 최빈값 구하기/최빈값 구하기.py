def solution(array):
    answer = 0
    num = [0] * 1001
    for elem in array:
        num[elem]+=1
    mx = max(num)
    answer = num.index(mx)
    if num.count(mx) >= 2:
        answer = -1
    return answer