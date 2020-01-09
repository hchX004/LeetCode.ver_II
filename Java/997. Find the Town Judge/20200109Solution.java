//my answer


//法官点的出度为0，入度为N-1
class 20200109Solution {
    public int findJudge(int N, int[][] trust) {
        int inDegree[] = new int[N + 1];
        int outDegree[] = new int[N + 1];
        //得到各点的出度和入度
        for(int[] edge : trust){
        	int start = edge[0];
        	int end = edge[1];
        	inDegree[end]++;
        	outDegree[start]++;
        }
        for(int i=1; i<=N; i++){
        	if(outDegree[i] == 0 && inDegree[i] == N-1)
        		return i;
        }
        return -1;
    }
}

