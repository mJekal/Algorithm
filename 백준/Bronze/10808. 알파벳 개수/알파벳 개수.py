str1 = input()
result = [0] * 26
for i in str1:
    result[ord(i)-ord('a')] += 1
for i in result:
    print(i, end=" ")
