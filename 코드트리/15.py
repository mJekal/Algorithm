a,b = tuple(map(int,input().split()))

def magicnumber(n):
    if n % 2 == 0:
        return False
    if n % 5 == 0 and n % 10 != 0: 
        return False
    if n % 3 == 0 and n % 9 != 0:
        return False
    return True

cnt = 0
for n in range(a,b+1):
    if magicnumber(n):
        cnt += 1
print(cnt)