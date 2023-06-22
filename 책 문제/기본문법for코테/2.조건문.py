# <2> 조건문
x = 15

if x >= 10:
    print(x)

score = 85

if score >= 90:
    print("학점: A")
elif score >= 80:
    print("학점: B")
elif score >= 70:
    print("학점: C")
else:
    print("학점: F")

# 비교 연산자

# X == Y : X와 Y가 서로 같을 떄 참(True)이다.
# X != Y : X와 Y가 서로 다를 떄 참(True)이다.
# X > Y : X가 Y보다 클 때 참(True)이다.
# X < Y : X가 Y보다 작을 떄 참(True)이다.
# X >= Y : X가 Y보다 크거나 같을 떄 참(True)이다.
# X <= Y : X가 Y보다 작거나 같을 떄 참(True)이다.

# 논리 연산자

# X and Y : X와 Y가 모두 참(True)일 때 참(True)이다.
# X or Y : X와 Y중에 하나만 참(True)일 때 참(True)이다.
# not X : X가 거짓(False)일 때 참(True)이다.

# 파이썬의 기타 연산자

# X in 리스트 : 리스트 안에 X가 들어가 있을 때 참(True)이다.
# X not in 문자열 : 문자열 안에 X가 들어가 있지 않을 때 참(True)이다.

score = 85

if score >= 80:
    pass
else:
    print('성적이 80점 미만입니다.')

print('프로그램을 종료합니다.')

score = 85

if score >= 80: result = "Success"
else: result = "Fail"

score = 85

result = "Success" if score >= 80 else "Fail"

a = [1,2,3,4,5,5,5]
remove_set = {3,5}

result = []
for i in a:
    if i not in remove_set:
        result.append()

print(result)

a = [1,2,3,4,5,5,5]
remove_set = {3,5}

result = [i for i in a if i not in remove_set]

print(result)








