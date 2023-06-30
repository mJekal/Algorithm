a,b = tuple(map(int,input().split()))

def num(n):
    for i in range(2,n):
        if n % i == 0:
            return False
    return True

sum = 0
for i in range(a,b+1):
    if num(i):
        sum += i

print(sum)