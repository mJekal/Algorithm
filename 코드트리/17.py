n1, n2 = tuple(map(int,input().split()))
a = list(map(int,input().split()))
b = list(map(int,input().split()))

def isnumber(n):
    for i in range(n2):
        if a[i+n] != b[i]:
            return False
    return True

def isnum():
    for i in range(n1-n2+1):
        if isnumber(i):
            return True
    return False

if isnum():
    print("Yes")
else:
    print("No")