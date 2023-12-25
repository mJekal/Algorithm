N = int(input())
M = int(input())

graph = [
    []
]

visited = [0] * (N+1)

for _ in range(N):
    graph.append([])

for i in range(M):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)


def dfs(c):
    visited[c] = 1
    for k in graph[c]:
        if visited[k] == 0:
            dfs(k)


dfs(1)
ans = 0
for k in visited:
    if k == 1:
        ans += 1

print(ans-1)
