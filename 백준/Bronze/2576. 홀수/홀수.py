mx = 200
sum = 0
for _ in range(0,7):
    a = int(input())
    if a % 2 != 0:
        sum += a
        mx = min(mx, a)
if sum != 0:
    print(sum)
    print(mx)
else:
    print(-1)