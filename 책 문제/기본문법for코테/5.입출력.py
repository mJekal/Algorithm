# <5> 입출력

# 입력을 위한 전형적인 소스코드

# 데이터의 개수 입력
n = int(input())

# 각 데이터를 공백으로 구분하여 입력
data = list(map(int,input().split()))

data.sort(reverse = True)
print(data)

# 공백을 기준으로 구분하여 적은 수의 데이터 입력

# n, m, k를 공백으로 구분하여 입력
n,m,k = map(int,input().split())

print(n,m,k)

import sys
sys.stdin.readline().rstrip()

# readline() 사용 소스코드 예시
import sys

# 문자열 입력받기
data = sys.stdin.readline().rstrip()
print(data)

# 변수 출력 예시
a = 1
b = 2

print(a,b)

# 출력 줄 바꿈 예시
a = 1
b = 2

print(a)
print(b)

# 변수를 문자열로 바꾸어 출력하는 소스코드 예시
answer = 7

print("정답은 " + str(answer) + "입니다.")

# 각 변수를 콤마(,)로 구분하여 출력하는 소스코드 예시
answer = 7

print("정답은", str(answer), "입니다.")

answer = 7
print(f"정답은 {answer}입니다.")



