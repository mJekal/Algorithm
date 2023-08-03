# 카펫

def solution(brown, yellow):
    answer = []
    S = brown * yellow
    K = brown + yellow
    for j in range(1,yellow+1):
        if yellow % j == 0:
            if (j+2)*(yellow/j+2) == K:
                answer.append(yellow/j+2)
                answer.append(j+2)
                break
    return answer