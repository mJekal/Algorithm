a, b = map(int, input().split())
c = []
for i in range(1,a+1):
    c.append(int(i))

for i in range(b):
    k = list(map(int,input().split()))
    c[k[0]-1], c[k[1]-1] = c[k[1]-1],c[k[0]-1]
print(*c)