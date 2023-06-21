M = int(input())
for i in range(1,M+1):
    li = list(map(int,str(i)))
    res = sum(li) + i
    if res == M:
        print(i)
        break
    if i == M:
        print(0)
