class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                Queue<Integer>q=new LinkedList<>();

                color[i]=0;
                q.add(i);

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int neighbor:graph[curr]){
                        if(color[neighbor]==-1){
                            color[neighbor] = 1-color[curr];
                            q.add(neighbor);
                        }

                        else if(color[neighbor]==color[curr]){
                            return false;
                        }
                    }  
                }
            }
        }
                        return true;
    }
}