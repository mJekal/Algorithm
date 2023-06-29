n = int(input())

def lec(cnt):
    for _ in range(n):
        for _ in range(n):
            print(cnt, end=" ")
            cnt += 1
            if cnt == 10:
                cnt = 1
        print(" ")

lec(1)