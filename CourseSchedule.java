import java.util.*;
 class Solution {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List <List <Integer>> graph = new ArrayList<>();
        for(int i=0;i<prerequisites[0].length;i++){
            graph.add(new ArrayList<>());
        }
        for(int c[]: prerequisites){
            graph.get(c[1]).add(c[0]);
        }
        int visited[]=new int[numCourses];
        int pv[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(dfs(i,graph,visited,pv)){
                return false;
            }
        }
        return true;
    }
    public static  boolean dfs(int v,List<List<Integer>> graph,int [] visited,int[] pv){
        visited[v]=1;;
        pv[v]=1;
        for(int ne: graph.get(v)){
            if(visited[ne] == 0){
                if(dfs(ne,graph,visited,pv)){
                    return true;
                }
            }else if(pv[ne]==1){
                return true;
            }
        }
        pv[v]=0;
        return false;
}
}

public class CourseSchedule {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Solution sc = new Solution();
        System.out.println(sc.canFinish(2, new int[][] { { 1, 0 }, { 0, 1 } }));
    }
}
