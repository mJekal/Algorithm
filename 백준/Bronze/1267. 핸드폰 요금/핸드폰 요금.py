N = int(input())
arr = list(map(int, input().split()))

sumY = 0
for i in arr:
    sumY += 10 * (i // 30 + 1)

sumM = 0
for i in arr:
    sumM += 15 * (i // 60 + 1)
if sumY > sumM:
    print("M", end=" ")
elif sumY == sumM:
    print("Y M", end=" ")
else:
    print("Y", end=" ")
print(min(sumY, sumM))
