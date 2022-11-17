package arrays;

import java.util.*;

public class MaximumIndex {
    static int maxIndexDiff(int arr[], int n) {

        // Your code here
        for(int j=n-1,i=0;i<n;i++,j--){
            if(arr[i]<arr[j]){
                return j-i;
            }
        }
        return -1;
    }
    static class AdjList{
        int u;
        List<Integer> vS;

        AdjList(int u){
            this.u=u;
        }
    }

    public static void main(String[] args) {
        String[] arrString="65 6 74 94 56 89 9 63 75 25 34 68 93 48 16".split(" ");
        int arr[]=new int[15];
        for(int i=0;i<arrString.length;i++)
            arr[i]=Integer.parseInt(arrString[i]);
        List<Integer> l=null;
        System.out.println(maxIndexDiff(arr, 15));
        System.out.println(l.isEmpty());

        Map<Integer, AdjList> vAdj=new TreeMap<>();
        Map<Integer, AdjList> hAdj=new TreeMap<>();
        Set<String> edges=new HashSet<>();

//        0 2
//        1 0
//        1 1
//        1 2

        addEdge(0,2,vAdj,hAdj,edges);
        addEdge(1,0,vAdj,hAdj,edges);
        addEdge(1,1,vAdj,hAdj,edges);
        addEdge(1,2,vAdj,hAdj,edges);

        List<AdjList> adj=(List<AdjList>) hAdj.values();
//        adj.addAll(vAdj.values())
        Comparator<AdjList> comparator=new Comparator<AdjList>() {
            @Override
            public int compare(AdjList o1, AdjList o2) {
                return o2.vS.size()-o1.vS.size();
            }
        };

//        Collections.sort(horAdj,comparator);
//        Collections.sort(verAdj,comparator);
//        while(!edges.isEmpty()){
//            if()
//        }
    }

    public static void addEdge(int u, int v, Map<Integer, AdjList> vAdj, Map<Integer, AdjList> hAdj, Set<String> edges){
        hAdj.putIfAbsent(u, new AdjList(u));
        hAdj.get(u).vS.add(v);
        vAdj.put(v,new AdjList(v));
        vAdj.get(v).vS.add(u);
        edges.add(u+"-"+v);
    }
}
