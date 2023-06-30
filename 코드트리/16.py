a,b  = tuple(map(int,input().split()))

def num(n):
    n = list(str(n))
    res = 0
    for k in n:
        res += int(k)
    return res % 2 == 0


def nu(n):
    for i in range(2,n):
        if n % i == 0:
            return False
    return True


cnt = 0
for n in range(a,b+1):
    if nu(n) and num(n):
        cnt += 1
print(cnt)