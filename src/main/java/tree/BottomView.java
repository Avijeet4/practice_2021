package tree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BottomView {
    class Node{
        int data;
        int hd;
        Node left, right;

        Node(int data){
            this.data=data;
        }
    }
    public ArrayList<Integer> bottomView(Node root)
    {
        // Code here
        Map<Integer, Integer> map=new TreeMap<>();
        inorder(root, 0, map);
        return (ArrayList)map.values().stream().collect(Collectors.toList());
    }
    public void inorder(Node root, int level, Map<Integer, Integer> map){
        if(root==null)
            return;
        inorder(root.left, level-1, map);
        map.put(level, root.data);
        inorder(root.right, level+1, map);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map=new TreeMap<>();
        map.put(-3,1);
        map.put(-2,2);
        map.put(4,5);
        map.put(0,3);
        map.put(3,4);
        map.put(-2, 20);
        System.out.println(map.values().stream().collect(Collectors.toList()));
    }
}
