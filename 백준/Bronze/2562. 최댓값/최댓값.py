arr = []
for _ in range(9):
    arr.append(int(input()))
mx = max(arr)
print(mx)
for idx in range(len(arr)):
    if arr[idx] == mx:
        print(idx+1)
        break