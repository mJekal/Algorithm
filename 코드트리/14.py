def add(a,c):
    return a + c

def minus(a,c):
    return a - c

def product(a,c):
    return a * c

def division(a,c):
    return int(a / c)

a,o,c = tuple(input().split())
a = int(a)
c = int(c)

if o == "+":
    print(f"{a} {o} {c} = {add(a,c)}")
elif o == "-":
    print(f"{a} {o} {c} = {minus(a,c)}")
elif o == "*":
    print(f"{a} {o} {c} = {product(a,c)}")
elif o == "/":
    print(f"{a} {o} {c} = {division(a,c)}")
else:
    print("False")