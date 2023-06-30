m,D = tuple(map(int,input().split()))

def isnumber(m,D):
    if m > 12 or D > 31:
        return False
    if m == 11 or m == 4 or m == 6 or m == 9:
        if D > 30:
            return False
    elif m == 2 and D > 28:
        return False
    return True

if isnumber(m,D):
    print("Yes")
else:
    print("No")