def res(a,b):
    if a > b:
        b += 10
        a *= 2
        return a,b
    if b > a:
        a += 10
        b *= 2
        return a,b

a,b = tuple(map(int,input().split()))

for i in res(a,b):
    print(i,end=" ")