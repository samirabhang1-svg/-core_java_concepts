import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
class collection{
    //collection is a class and interface present in java libary
 public static void main(String[] args) {
    //array list
  ArrayList<Integer>list=new ArrayList<Integer>(); //hear the wapper class and genrics are used

    list.add(10);
    list.add(20);
    list.add(30);
    list.remove(1);
    System.out.println(list);
    list.add(2,25);
     System.out.println(list);
     //linklist
     LinkedList<Integer>list1=new LinkedList<>();
     
     list1.add(20);
     list1.add(50);
     list1.add(50);
     list1.add(2,20);
     System.out.println(list1);
     //vector
     Vector<String> vector=new Vector<String>();
     vector.add("samir");
     vector.add("abhanhg");
    System.out.println(vector.contains("samir"));
     System.out.println(vector);
     //vector is slow than array list
     //but thred safe
//stack
//it is based on last in first out data structure
  //1>2>3>=3<2<1
  Stack<String> st=new Stack<>();
  st.push("samir");
  st.push("abhang");
System.out.println(st);
System.out.println(st.peek());
System.out.println(st.pop());
System.out.println(st);

   }
 }   
