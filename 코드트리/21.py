def number(N):
    for i in N:
        if i % 2 == 0:
            i = i / 2
            i = int(i)
        print(i, end=" ")
    
n = int(input())
a = list(map(int,input().split()))

number(a[:])