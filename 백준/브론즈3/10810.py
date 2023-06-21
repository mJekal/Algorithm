a, b = map(int,input().split())
c = []    
for i in range(a):
    c.append(0)
for i in range(b):
    e,f,g = map(int,input().split())
    for j in range(e-1,f):
            c[j] = g
for k in range(a):
    print(c[k], end=" ")