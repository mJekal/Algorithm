def mins(a,b,c):
    min = a
    if a >= b:
        min = b
        if b >= c :
            min = c
    elif a <= b:
        if c <= a:
            min = c
    return min
a,b,c = tuple(map(int,input().split()))
print(mins(a,b,c))