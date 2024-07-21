N = int(input())
for i in range(1, N+1):
    print(" "*(N-i), end="")
    print("*"*(2*i-1))
for i in range(1, N):
    print(" "*(i), end="")
    print("*"*(2*(N-i)-1))
