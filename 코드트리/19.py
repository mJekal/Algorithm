Y,M,D = tuple(map(int,input().split()))


def yun(y):
    if y % 400 == 0:
        return True
    elif y % 4 == 0 and y % 100 != 0:
        return True
    return False

def isnumber():
    if M > 12 or D > 31:
        return False
    elif M == 11 or M == 4 or M == 6 or M == 9:
        if D > 30:
            return False
    elif yun(Y) and M == 2 and D > 29:
        return False
    elif yun(Y) == False and M == 2 and D > 28:
        return False
    return True
    

def spring():
    if 3 <= M <= 5:
        print("Spring")
    if 6 <= M <= 8:
        print("Summer")
    if 9 <= M <= 11:
        print("Fall")
    if 0 <= M <= 2 or M==12:
        print("Winter")



if isnumber():
    spring()
else:
    print(-1)