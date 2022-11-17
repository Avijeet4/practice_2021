package companyInterviews;

import java.util.*;

public class Testhack {

    public static void arithmeticException(){
        int c=0/2;
    }

    public static void main(String[] args) {
        try {
            int c=2/0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//logm*n + n*logn ==>n is number of columns
    public static int binarySearch(int arr[], int x){
        int l=0, h= arr.length-1;
        int last1=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(1==arr[m]){
                last1=m;
                l=m+1;
            } else{
                h=m-1;
            }
        }
        return last1;
    }

//    public static List<Integer> weakestCountries(int arr[][], int k){
//        TreeMap<Integer, TreeSet<Integer>> map=new TreeMap<>();
//        List<Integer> result=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            int cnt=0;
//            for(int a:arr[i]){
//                cnt+=a;
//            }
//            map.putIfAbsent(cnt, new TreeSet<>());
//            map.get(cnt).add(i);
//        }
//        for (TreeSet<Integer> val: map.values()){
//            if(k-val>0){
//
//            }
//        }
//    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class BinaryTree {
    static Set<TreeNode> set = new HashSet<>();
    static Stack<TreeNode> stack = new Stack<>();

    // Function to build tree using given traversal
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = null;
        for (int pre = 0, in = 0; pre < preorder.length; ) {

            TreeNode node = null;
            do {
                node = new TreeNode(preorder[pre]);
                if (root == null) {
                    root = node;
                }
                if (!stack.isEmpty()) {
                    if (set.contains(stack.peek())) {
                        set.remove(stack.peek());
                        stack.pop().right = node;
                    } else {
                        stack.peek().left = node;
                    }
                }
                stack.push(node);
            } while (preorder[pre++] != inorder[in] && pre < preorder.length);

            node = null;
            while (!stack.isEmpty() && in < inorder.length &&
                    stack.peek().val == inorder[in]) {
                node = stack.pop();
                in++;
            }

            if (node != null) {
                set.add(node);
                stack.push(node);
            }
        }

        return root;
    }
}
/*
// Account
// Friends Request
// Chat
// Post
// Story
// Notification

----------------------------------
// User Service --> Account, Friend Connections||  SQL
// Post Service --> Story, Post || S3, CDN
// Wall Service --> Shows Posts on our Walls
// Notification Service -->Notifies Users

// Session Creation|| Norm
// Distribute Loads among the pods
20 20 20 20 20

Tables/Classes:
User
-- id : long
-- password : String
-- mobile: String
-- emailId:String
remove friendIds from here
Friend
requesterId: to check friend received
requesteeId: to check friend sent
Status


User service handles all the user base interaction
Friend request Service will alsobe the part of user ser
 */


