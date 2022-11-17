//package companyInterviews;
//
//import lombok.Data;
//
//import java.util.*;
//
//@Data
//class StackNode<T>{
//    T val;
//    StackNode next;
//    StackNode prev;
//    StackNode(T val){
//        this.val=val;
//    }
//    void addNext(StackNode node){
//        this.next=node;
//        node.setPrev(this);
//    }
//}
//public class StackImpl<T> {
//    StackNode tail;
//    StackNode top;
//
//    public StackImpl(){
//        top=new StackNode(null);
//        tail=top;
//    }
//
//    public void push(T val){
//        StackNode newNode=new StackNode(val);
//        top.addNext(newNode);
//        top=newNode;
//    }
//
//    public StackNode<T> pop(){
//        if(top.equals(tail)){
//            return null;
//        }
//        StackNode popElement=top;
//        top=popElement.getPrev();
//        popElement.getPrev().setNext(null);
//        popElement.setPrev(null);
//        return popElement;
//    }
//
//    public StackNode<T> peek(){
//        if(top.equals(tail)){
//            return null;
//        }
//        return top;
//    }
//
//    public boolean isEmpty(){
//        return top.equals(tail);
//    }
//}
//
//class Sort1{
//
//    public static StackImpl<Integer> sortStack(StackImpl<Integer> originalStack){
//        StackImpl<Integer> res=new StackImpl<>();
//        StackImpl<Integer> helper=new StackImpl<>();
//
//        while(!originalStack.isEmpty() || !helper.isEmpty()){
//            if(originalStack.isEmpty() && !helper.isEmpty()){
//                StackImpl<Integer> temp=helper;
//                helper=originalStack;
//                originalStack=temp;
//            }else
//            if((res.isEmpty() && !originalStack.isEmpty())
//                    || (originalStack.peek().getVal() <= res.peek().getVal())){
//                res.push(originalStack.pop().getVal());
//            }else{
//                helper.push(res.pop().getVal());
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        String input="1,5,6,8,9,3 ".trim();
//        TreeSet<String> set=new TreeSet<>();
//        TreeMap<String, TreeSet<String>> treeSetTreeMap= new TreeMap<>();
//        set.last();
//        treeSetTreeMap.firstEntry().getValue().
////        String targetString="15";
////        Integer target=Integer.parseInt(targetString);
////        for(String )
////        String[] inputArr=input.split(" ");
////        String res="";
////        for(int i=inputArr.length-1; i>=0;i--){
////            res+=inputArr[i]+".";
//        }
//        System.out.println(res.substring(0,res.length()-1));
//    }
//}
