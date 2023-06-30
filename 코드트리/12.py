y = int(input())


def yun(y):
    if y % 400 == 0:
        return True
    elif y % 4 == 0 and y % 100 != 0:
        return True
    return False

if yun(y):
    print("true")
else:
    print("false")