from collections import deque

N, M, V = map(int, input().split())

adj = [[] for _ in range(N+1)]

for _ in range(M):
    s, e = map(int, input().split())
    adj[s].append(e)
    adj[e].append(s)

for i in range(1, N+1):
    adj[i].sort()


def dfs(c):
    v[c] = True
    ans_dfs.append(c)

    for k in adj[c]:
        if not v[k]:
            dfs(k)


def bfs(c):
    queue = deque()
    queue.append(c)
    v[c] = True

    while queue:
        ss = queue.popleft()
        ans_bfs.append(ss)
        for k in adj[ss]:
            if not v[k]:
                queue.append(k)
                v[k] = True


v = [False] * (N+1)
ans_dfs = [0]
dfs(V)
for s in ans_dfs[1:]:
    print(s, end=" ")
print()
v = [False] * (N+1)
ans_bfs = [0]
bfs(V)
for s in ans_bfs[1:]:
    print(s, end=" ")
