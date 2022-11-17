package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AlienDictionary {
    static List<List<Integer>> adjList;
    static boolean visited[];
    public static String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        adjList=new ArrayList<>();
        visited=new boolean[K];

        for(int i=0;i<K;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<N-1;i++){
            String word1=dict[i];
            String word2=dict[i+1];

            int minLength=Math.min(word1.length(),word2.length());

            for(int j=0;j<minLength;j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    adjList.get(word1.charAt(j)-'a')
                            .add(word2.charAt(j)-'a');
                    break;
                }
            }
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<K;i++){
            if(!visited[i]){
                topologicalSort(i, s);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char c=(char)('a'+s.pop());
            sb.append(c);
        }
        // System.out.println(sb.toString());
        return sb.toString();

    }

    public static void topologicalSort(int i, Stack<Integer> s){
        int n=adjList.get(i).size();
        for(int j=0;j<n;j++){
            int val=adjList.get(i).get(j);
            if(!visited[val]){
                topologicalSort(val, s);
            }
        }
        visited[i]=true;
        s.push(i);
    }

    public static void main(String[] args) {
        System.out.println(findOrder(new String[]{"caa","aaa","aab"}, 3, 3));
    }
}
