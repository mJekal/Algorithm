N,M = map(int,input().split())
board = [list(map(int,input().split())) for _ in range(N)]

chicken = []
home = []

for i in range(N):
    for j in range(N):
        if board[i][j] == 2:
            chicken.append((i,j))
        if board[i][j] == 1:
            home.append((i,j))

N1 = len(chicken)
N2 = len(home)

arr = [0] * M
isused = [0] * (N1+1) 
mn1 = 987654321

def func(k):
    global mn1
    if k == M:
        sum1=0
        for idx in range(len(home)):
            mn = 987654321
            for i2 in range(M):
                for i in range(len(chicken)):
                    if i != arr[i2]:
                        continue
                    mn = min(abs(home[idx][0]-chicken[i][0]) + abs(home[idx][1]-chicken[i][1]),mn)
            sum1 += mn
        mn1 = min(mn1,sum1)    
        return
    if k == 0:
        st = 0
    else:
        st = arr[k-1] + 1
    for i in range(st,N1):
        if isused[i] == 0:
            arr[k] = i
            isused[i] = 1
            func(k+1)
            isused[i] = 0
func(0)
print(mn1)