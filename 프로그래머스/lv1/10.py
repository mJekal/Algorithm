# 정수 제곱근 판별

import math

def solution(n):
    if int(math.sqrt(n)) == math.sqrt(n):
        return (math.sqrt(n)+1)**2
    else:
        return -1

# % 1 == 0으로 판별 가능