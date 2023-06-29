n = int(input())

def pl(n):
    res = 0
    for i in range(1,n+1):
        res += i
    return res//10

a = pl(n)
print(a)