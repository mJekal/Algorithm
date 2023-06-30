def palindrome(n):
    for i in range(len(n)):
        if n[i] == n[len(n)-1-i]:
            return True
        else:
            return False
n = input()
def num(n):
    if palindrome(n):
        print("Yes")
    else:
        print("No")

num(n)