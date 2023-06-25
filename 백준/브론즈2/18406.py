N = list(map(int, input()))

sum1 = sum(N[:len(N)//2])
sum2 = sum(N[len(N)//2:])

if sum1 == sum2:
    print("LUCKY")
else:
    print("READY")
