//my answer


class 20200124Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return dfs(graph, 0);                                   //返回当前节点到终点的路程二维数组
    }

    public List<List<Integer>> dfs(int[][] graph, int node) {   //输入参数为图和当前节点
        int N = graph.length;
        List<List<Integer>> ans = new ArrayList();

        if (node == N - 1) {                                    //如果到达终点
            List<Integer> path = new ArrayList();
            path.add(N-1);
            ans.add(path);
            return ans;
        }

        for (int next: graph[node]) {                           //next为当前节点能到达的下个节点的编号
            for (List<Integer> path: dfs(graph, next)) {
                path.add(0, node);
                ans.add(path);
            }
        }
        return ans;
    }
}