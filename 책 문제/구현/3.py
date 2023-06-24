start = input()
move = [(2, 1), (2, -1), (-2, 1), (-2, -1),
        (1, 2), (1, -2), (-1, -2), (-1, 2), ]
cnt = 0
x = ord(start[0]) - ord('a') + 1
y = int(start[1])

for i in range(8):
    nx = x + move[i][0]
    ny = y + move[i][1]
    if 0 < nx < 9 and 0 < ny < 9:
        cnt += 1

print(cnt)
