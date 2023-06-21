N, M = map(int, input().split())
m = list(map(int,input().split()))
m.sort()
max = 0
for i in range(N-1,-1,-1):
    for j in range(i-1,-1,-1):
        for k in range(j-1,-1,-1): 
            res = m[i]+m[j]+m[k]
            if res > M:
                continue
            else:
                if max <= res:
                    max = res
print(max)


                

