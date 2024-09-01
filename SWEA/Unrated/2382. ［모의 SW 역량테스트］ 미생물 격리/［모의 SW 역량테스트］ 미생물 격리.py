dx = [-1,-1,1,0,0]
dy = [-1,0,0,-1,1]

T = int(input())

for tc in range(1,T+1):
    N,M,K = map(int,input().split())
    list1 = [list(map(int,input().split())) for _ in range(K)]
    for _ in range(M):
        for i in range(len(list1)):
            list1[i][0] += dx[list1[i][3]]
            list1[i][1] += dy[list1[i][3]]
            if list1[i][0] == 0 or list1[i][1] == 0 or list1[i][0] == (N-1) or list1[i][1] == (N-1):
                list1[i][2] = int(list1[i][2]//2)
                if list1[i][3] == 1 or list1[i][3] == 2:
                    list1[i][3] = 3-list1[i][3]
                if list1[i][3] == 3 or list1[i][3] == 4:
                    list1[i][3] = 7-list1[i][3]
        list1.sort(key=lambda x: (x[0],x[1],-x[2]))
        idx = 1
        while idx < len(list1):
            if list1[idx-1][0:2] == list1[idx][0:2]:
                list1[idx-1][2] += list1[idx][2]
                list1.pop(idx)
            else:
                idx+=1
    ans = 0
    for i in range(len(list1)):
        ans += list1[i][2]
    print(f"#{tc} {ans}")


