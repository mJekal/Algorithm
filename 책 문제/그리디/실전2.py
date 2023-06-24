N = list(input())
M = []
for k in N:
    M.append(int(k))
print(M)

result = M[0]
for i in range(1, len(N)):
    if M[i-1] == 0 or M[i-1] == 1:
        result += M[i]
    elif M[i-1] != 0:
        result *= M[i]

print(result)
