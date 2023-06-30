n = input()

def isnum(n):
    cnt = 0
    for i in range(len(n)-1):
        if n[i] != n[i+1]:
            cnt += 1
    return cnt

def isnummm(cnt):
    if cnt >= 2:
        print("Yes")
    else:
        print("No")

cnt = isnum(n)
isnummm(cnt)