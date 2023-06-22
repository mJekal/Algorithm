# <6> 주요 라이브러리

# 내장 함수

result = sum([1,2,3,4,5])
print(result)

result = min([7,3,5,2])
print(result)

result = eval("(3+5)*7")
print(result)

result = sorted([9,1,8,5,4])
print(result)
result = sorted([9,1,8,5,4], reverse = True)
print(result)

result = sorted([('홍길동',35),('이순신',75),('아무개',50)], key = lambda x: x[1], reverse = True)
print(result)

data = [9,1,8,5,4]
data.sort()
print(data)

# itertools

from itertools import permutations
data = ['A','B','C']

result = list(permutations(data,3))
print(result)

from itertools import combinations
data = ["A","B","C"]
result = list(combinations(data,2))

print(result)

from itertools import product

data = ['A',"B",'C']
result = list(product(data,repeat=2))

print(result)

# heapq

import heapq

def heapsort(iterable):
    h = []
    result = []
    for value in iterable:
        heapq.heappush(h, value)
    for i in range(len(h)):
        result.append(heapq.heappop(h))
    return result

result = heapsort((1,3,5,7,9,2,4,6,8,0))
print(result)

import heapq

def heapsort(iterable):
    h = []
    result = []
    for value in iterable:
        heapq.heappush(h,-value)
    for i in range(len(h)):
        result.append(-heapq.heappop(h))
    return result

# bisect

from bisect import bisect_left, bisect_right

a = [1,2,4,4,8]
x = 4

print(bisect_left(a,x))
print(bisect_right(a,x))

from bisect import bisect_left, bisect_right

# 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
def count_by_range(a,left_value,right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a,left_value)
    return right_index - left_index

# 리스트 선언
a = [1,2,3,3,3,3,4,4,8,9]

# 값이 4인 데이터 개수 출력
print(count_by_range(a,4,4))

# 값이 [-1,3] 범위에 있는 데이터 개수 출력
print(count_by_range(a,-1,3))

# collections

from collections import deque

data = deque([2,3,4])

data.appendleft(1)
data.append(5)

print(data)
print(list(data))

from collections import Counter

counter = Counter(['red','blue', 'red', 'green', 'blue','blue'])

print(counter['blue'])
print(counter['green'])
print(dict(counter))

# math

import math

print(math.factorial(5))

print(math.sqrt(7))

print(math.gcd(21,14))

print(math.pi)
print(math.e)

# 2차원 리스트(행렬)를 90도 회전하는 메서드
def roate_a_matrix_by_90_degree(a):
    row_length = len(a)
    column_length = len(a[0])

    res = [[0] * row_length for _ in range(column_length)]
    for r in range(row_length):
        for c in range(column_length):
            res[c][row_length-1-r] = a[r][c]

    return res

a = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12]
]

print(roate_a_matrix_by_90_degree(a))