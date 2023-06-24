N = int(input())
dir = list(input().split())

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
dirs = ['L', 'R', 'U', 'D']

x, y = 1, 1

for k in dir:
    for i in range(4):
        if k == dirs[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if 0 > nx or nx > N+1 or 0 > ny or ny > N+1:
        continue
    x = nx
    y = ny

print(x, y)
