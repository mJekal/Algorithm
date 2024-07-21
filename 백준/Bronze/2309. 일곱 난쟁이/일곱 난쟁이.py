arr = []
arr2 = []
flag = False
for _ in range(0,9):
    a = int(input())
    arr.append(a)

for i in range(0,9):
    for j in range(i+1,9):
        if sum(arr) - arr[i] - arr[j] == 100:
            flag = True
            for k in range(0,9):
                if k == i or k == j:
                    continue
                arr2.append(arr[k])
        if flag == True:
            break
    if flag == True:
        break
for i in sorted(arr2):
    print(i)

