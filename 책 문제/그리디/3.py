max_value = 0
N, M = map(int,input().split())
for i in range(N):
    a = list(map(int,input().split()))
    a.sort()
    result = max(max_value,a[0])
print(result)


