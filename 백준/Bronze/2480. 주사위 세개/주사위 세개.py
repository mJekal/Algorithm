arr = list(map(int, input().split()))
arr.sort()
A = arr[0]
B = arr[1]
C = arr[2]
if A == B and B == C and C == A:
    print(10000+A*1000)
elif (A == B and B != C) or (A == C and C != B):
    print(1000+A*100)
elif B == C and C != A:
    print(1000+B*100)
elif A != B and B != C and C != A:
    print(C*100)