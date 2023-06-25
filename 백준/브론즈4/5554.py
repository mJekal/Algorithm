res = 0

for i in range(4):
    N = int(input())
    res += N

if res >= 60:
    x = res // 60
    y = res % 60
else:
    x = 0
    y = res

print(x)
print(y)
