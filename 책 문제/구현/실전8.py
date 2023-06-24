N = input()
cnt = 0
result = []

for k in N:
    if k.isalpha():
        result.append(k)
    else:
        cnt += int(k)

result.sort()

if cnt != 0:
    result.append(str(cnt))

print("".join(result))
