N,M,D = map(int,input().split())
board = [list(map(int,input().split())) for _ in range(N)]

Point = [[0 for _ in range(2)] for _ in range((D**2))]
mx = -987654321

def makePoint(x,y,D):
    idx = (D-1)**2
    idx1 = (D-1)**2
    idx2 = D + (D-1)**2
    for i in range(1,D+1):
        x = -i
        Point[idx][0] = x
        idx+=1
    for i in range(-D+1,D):
        y = i
        Point[idx1][1] = y
        idx1 += 1
    for i in range(D-1,0,-1):
        x = -i
        Point[idx2][0] = x
        idx2 += 1

for i in range(1,D+1):
    makePoint(0,0,i)
#print(Point)

arr = [0] * 3
isused = [0] * M

def shoot(arr,turn,copy):
    cnt = 0
    for i in range(3):
        x,y = N-turn,arr[i]
        for i in range(len(Point)):
            nx = x+Point[i][0]
            ny = y+Point[i][1]
            if nx < 0 or ny < 0 or nx >= N or ny >= M:
                continue
            if copy[nx][ny] != 0:
                copy[nx][ny] = 5
                break
    #print("copy",copy)
    for i in range(N):
        for j in range(M):
            if copy[i][j] == 5:
                cnt += 1
                copy[i][j] = 0
    return cnt

copy = [[0 for _ in range(M)] for _ in range(N)]
cnt = 0
ans = 0
def func(k):
    global mx
    if k == 3:
        for i in range(N):
            for j in range(M):
                copy[i][j] = board[i][j]
        ans = 0
        for i in range(N+1):
            ans += shoot(arr,i,copy)
        #print(copy)
        mx = max(ans,mx)
        return
    if k == 0:
        st = 0
    else:
        st = arr[k-1] + 1
    for i in range(st,M):
        if isused[i] == 0:
            isused[i] = 1
            arr[k] = i
            func(k+1)
            isused[i] = 0
func(0)
print(mx)