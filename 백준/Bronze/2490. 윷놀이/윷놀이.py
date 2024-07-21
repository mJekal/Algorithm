for _ in range(3):
    N = sum(list(map(int, input().split())))
    if N == 4:
        print("E")
    elif N == 3:
        print("A")
    elif N == 2:
        print("B")
    elif N == 1:
        print("C")
    elif N == 0:
        print("D")