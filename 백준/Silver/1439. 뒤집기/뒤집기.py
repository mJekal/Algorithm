str1 = input()


def func(flag):
    cnt = 0
    int_flag = flag
    for i in str1:
        i = int(i)
        if i == (1-int_flag) and flag == int_flag:
            cnt += 1
            flag = 1-int_flag
        elif i == int_flag:
            flag = i
    return cnt


print(min(func(0), func(1)))
