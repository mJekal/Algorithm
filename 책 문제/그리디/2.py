n,m,k = map(int,input().split())
array = list(map(int,input().split()))
array.sort()

res = (m//k) * (array[-1]*k)
res += (m % k) * array[-2]

print(res)