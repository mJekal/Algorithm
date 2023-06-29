n = int(input())

def magicnumber(n):
    return n % 2 == 0 and (n//10 + n - (n//10) * 10) % 5 == 0

if magicnumber(n):
    print("Yes")
else:
    print("No")