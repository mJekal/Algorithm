# 정답은 맞지만 시간 초과
n = int(input())
arr = []
for _ in range(n):
    m = input().split()
    arr.extend(m)
arr = set(arr)
arr= list(arr)
def minlen():
    for i in range(len(arr)-1):
        if len(arr[i]) > len(arr[i+1]):
            arr[i],arr[i+1] = arr[i+1],arr[i]
arr.sort()
for _ in range(n):
    minlen()

for elme in arr:
    print(elme)

# 제출 코드
n = int(input())
arr = []

for i in range(n):
    arr.append(input())
arr = set(arr)	
arr = list(arr)	
arr.sort()
arr.sort(key = len)

for elme in arr:
    print(elme)