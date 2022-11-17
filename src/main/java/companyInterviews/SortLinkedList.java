package companyInterviews;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SortLinkedList {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    static Node sortLinkedList(List<Node> linkedLists){
        TreeMap<Integer, Node> map=new TreeMap<>();
        Node head=null, prev=null;

        for(Node n: linkedLists){
            map.put(n.val, n);
        }

        while(!map.isEmpty()){
            int key=map.firstKey();
            Node curr=map.get(key);
            if(head==null){
                head=curr;
            }else{
                prev.next=curr;
            }
            prev=curr;
            map.remove(key);
            curr=curr.next;

            if(curr!=null){
                map.put(curr.val, curr);
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node A=createLinkedList(new int[]{1,5,7});
        Node B=createLinkedList(new int[]{2,8,10});
        Node C=createLinkedList(new int[]{3,4,6});

        Node res=sortLinkedList(Arrays.asList(A,B,C));

        while(res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }
    }

    static Node createLinkedList(int[]  arr){
        Node head=null, prev=null;
        for(int n:arr){
            if(head==null){
                head=new Node(n);
                prev=head;
            }else{
                prev.next=new Node(n);
                prev=prev.next;
            }
        }
        return head;
    }
}
