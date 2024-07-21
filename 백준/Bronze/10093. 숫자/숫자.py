A, B = map(int, input().split())
N1 = min(A, B)
N2 = max(A, B)
if N1 == N2:
    print(0)
else:
    print(N2-N1-1)
    for i in range(N1+1, N2):
        print(i, end=" ")
