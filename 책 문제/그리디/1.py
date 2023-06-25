N = int(input())
money = [500, 100, 50, 10]

cnt = 0
for mon in money:
    cnt += N // mon
    N %= mon
print(cnt)
