dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

N, M = map(int, input().split())
check = [[0] * M for _ in range(N)]

x, y, dir = map(int, input().split())
check[x][y] = 1

array = []
for i in range(N):
    array.append(list(map(int, input().split())))


def turn_left():
    global dir
    dir -= 1
    if dir == -1:
        dir = 3


count = 1
turn_time = 0

while True:
    turn_left()
    nx = x + dx[dir]
    ny = y + dy[dir]
    if check[nx][ny] == 0 and array[nx][ny] == 0:
        check[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1
    if turn_time == 4:
        nx = x - dx[dir]
        ny = y - dy[dir]
        if array[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0

print(count)
