N = int(input())

def f(N):
    if N == 0:
        return 0
    if N == 1:
        return 1
    return f(N-1) + f(N-2)

print(f(N))