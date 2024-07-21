arr = [i for i in range(1, 21)]
for _ in range(10):
    A, B = map(int, input().split())
    arr[A-1:B] = arr[A-1:B][::-1]
for i in arr:
    print(i, end=" ")