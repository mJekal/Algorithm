N = int(input())
n = list(map(int,input().split()))

def abss(n):
    for i in n:
        print(abs(i), end=" ")

abss(n)