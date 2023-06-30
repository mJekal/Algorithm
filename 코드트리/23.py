def num(a,b):
    if a > b:
        a += 25
        b *= 2
        return a,b
    if b > a:
        b += 25
        a *= 2
        return a,b

a,b = tuple(map(int,input().split()))

for i in num(a,b):
    print(i, end = " ")