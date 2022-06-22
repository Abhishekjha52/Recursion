public class DFS {
    public ArrayList<Integer> dfsPfGraph(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean vis[] = new boolean[V];
        ArryaList<Integer> ans= new ArrayList<>();
        dfs(0,adj,vis,ans);
        return ans;
    }
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer>ans)
    {
        vis[v]=true;
        ans.add(v);
        for(Integer u:adj.get(v))
        {
            if(vis[u]==false)
                dfs(u,adj,vis,ans);
        }
    }
    
}
