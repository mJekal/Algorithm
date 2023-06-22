# <1> 자료형

# 1. 수 자료형

# 1-1. 정수형

# 양의 정수
a = 1000
print(a)

# 음의 정수
a = -7
print(a)

# 0
a = 0
print(a)

# 1.2. 실수형

# 양의 실수
a = 157.93
print(a)

# 음의 실수
a = -1837.2
print(a)

# 소수부가 0일 때 0을 생략
a = 5.
print(a)

# 정수부가 0일 때 0을 생략
a = -.7
print(a)

# 10억의 지수 표현 방식
a = 1e9
print(a)

# 752.5
a = 75.25e1
print(a)

# 3.954
a = 3954e-3
print(a)

a = 0.3 + 0.6
print(a)

if a == 0.9:
    print(True)
else:
    print(False)

a = 0.3 + 0.6
print(round(a,4))

if round(a,4) == 0.9:
    print(True)
else:
    print(False)

# 1.3. 수 자료형의 연산

a = 7
b = 3

# 나누기
print(a / b)

# 나머지
print(a % b)

# 몫
print(a // b)

# 거듭제곱
print(a ** b)

# 2. 리스트 자료형

# 2-1. 리스트 만들기

a = [1,2,3,4,5,6,7,8,9]
print(a)

# 인덱스 4, 즉 다섯 번째 원소에 접근
print(a[4])

# 빈 리스트 선언 방법 1)
a = list()
print(a)

# 빈 리스트 선언 방법 1)
a = []
print(a)

# 크기가 N이고, 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a)

# 2-2. 리스트의 인덱싱과 슬라이싱

a = [1,2,3,4,5,6,7,8,9]
# 뒤에서 첫 번쨰 원소 출력
print(a[-1])

# 뒤에서 첫 번쨰 원소 출력
print(a[-3])

# 뒤에서 첫 번쨰 원소 출력
a[3] = 7
print(a)

a = [1,2,3,4,5,6,7,8,9]

# 두 번째 원소부터 네 번째 원소까지
print(a[1:4])

# 2-3. 리스트 컴프리헨션

# 0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]

print(array)

# 1부터 9까지의 수의 제곱 값을 포함하는 리스트
array = [i * i for i in range(1,9)]

print(array)

# N X M 크기의 2차원 리스트 초기화
n = 3
m = 3
array = [[0] * m for _ in range(n)]
print(array)

# N X M 크기의 2차원 리스트 초기화(잘못된 방법)
n = 3
m = 4
array = [[0] * m ] * n
print(array)

array[1][1] = 5
print(array)

# 2-4. 리스트 관련 기타 메서드

# append() : 변수명.append() : 리스트에 원소를 하나 삽입할 때 사용한다. : O(1)
# sort() : 변수명.sort() : 기본 정렬 기능으로 오름차순으로 정렬한다 : O(NlogN)
# sort() : 변수명.sort(revesre = True) : 내림차순으로 정렬한다 : O(NlogN)
# reverse() : 변수명.reverse() : 리스트에 원소의 순서를 모두 뒤집어 놓는다. : O(N)
# insert() : insert(삽입할 위치 인덱스, 삽입할 값) : 특정한 인덱스 위치에 원소를 삽입할 때 사용한다. : O(N)
# count() : 변수명.count(특정 값) : 리스트에 특정한 값을 가지는 데이터의 개수를 셀 때 사용한다. : O(N)
# remove() : 변수명.remove(특정 값) : 특정한 값을 갖는 원소를 제거하는데, 값을 가진 원소가 여러 개면 하나만 제거한다. : O(N)

a = [1,4,3]
print("기본 리스트:" , a)

# 리스트에 원소 삽입
a.append(2)
print("삽입: ", a)

# 오름차순 정렬
a.sort()
print("오름차순 정렬: ", a)

# 내림차순 정렬
a.sort(reverse = True)
print("내림차순 정렬: ", a)

# 리스트 원소 뒤집기
a.reverse()
print("원소 뒤집기: ", a)

# 특정 인덱스에 데이터 추가
a.insert(2,3)
print("인덱스 2에 3 추가: ", a)

# 특정 값인 데이터 개수 세기
print("값이 3인 데이터 개수: ", a.count(3))

# 특정 값 데이터 삭제
a.remove(1)
print("값이 1인 데이터 삭제: ", a)

# 특정값 가진 모든 원소 제거
a = [1,2,3,4,5,5,5]
remove_set = {3,5}

# remove_set에 포함되지 않은 값만을 저장
result = [i for i in a if i not in remove_set]
print(result)

# 3. 문자열 자료형

# 3.1 문자열 초기화
data = "Hello World"
print(data)

data = "Don't you know \"Python\"?"
print(data)

# 3.2 문자열 연산

a = "Hello"
b = "World"

print(a + " " + b)

a = "String"
print(a * 3)

a = "ABCDEF"
print(a[2 : 4])

# 4. 튜플 자료형

a = (1,2,3,4)
print(a)

# 5. 사전 자료형

# 5.1 사전 자료형 소개

data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'

print(data)

if '사과' in data:
    print("'사과'를 키로 가지는 데이터가 존재합니다.")

# 5.2 사전 자료형 관련 함수

data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'

# 키 데이터만 담은 리스트
key_list = data.keys()

# 값 데이터만 담은 리스트
value_list = data.values()
print(key_list)
print(value_list)

# 각 키에 따른 값을 하나씩 출력
for key in key_list:
    print(data[key])

# 6. 집합 자료형

# 6.1 집합 자료형 소개

# 집합 자료형 초기화 방법 1
data = set([1,2,3,4,4,5])
print(data)

# 집합 자료형 초기화 방법 2
data = {1,1,2,3,4,4,5}
print(data)

# 6.2 사전 자료형 연산
a = set([1,2,3,4,4,5])
b = set([3,4,5,6,7])

# 합집합
print(a|b)

# 교집합
print(a&b)

# 차집합
print(a-b)

# 6.3 집합 자료형 관련 함수

# add() : 변수명.add() : 하나의 집합 데이터에 값을 추가 : O(1)
# update() : 변수명.add() : 여러 개의 값을 한꺼번에 추가 : O(1)
# remove() : 변수명.add() : 특정한 값을 제거 : O(1)

data = set([1,2,3])
print(data)

# 새로운 원소 추가
data.add(4)
print(data)

# 새로운 원소 여러 개 추가
data.update([5,6])
print(data)

# 특정한 값을 갖는 원소 삭제
data.remove(3)
print(data)