a,b = tuple(map(int,input().split()))
cnt = 0 

def thn(n):
    n = str(n)
    arr = list(n)
    t = 0
    for i in range(len(n)):
        if arr[i] == '3' or arr[i] == '6' or arr[i] == '9':
            t = 1
    return t

def ths(n):
    return n % 3 == 0

for i in range(a,b+1):
    if thn(i) or ths(i):
        cnt += 1

print(cnt)