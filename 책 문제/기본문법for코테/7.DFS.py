def dfs(graph, i, visited):
    visited[i] = True
    print(i, end=" ")
    for k in graph[i]:
        if not visited[k]:
            dfs(graph, k, visited)


graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9


dfs(graph, 1, visited)
