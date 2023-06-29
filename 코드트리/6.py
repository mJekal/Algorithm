n, m = tuple(map(int,input().split()))

for i in range(1,101):
    if n % i == 0 and m % i == 0:
        res = i
        j = n//res
        k = m//res
print(j * k * res)