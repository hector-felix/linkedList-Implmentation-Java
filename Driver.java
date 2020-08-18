/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC331LinkedList;

/**
 *
 * @author Hector Felix
 */
public class Driver {
    
    public static void main(String[] args) {
        SingleLinkedList s0 = new SingleLinkedList();
        s0.addLast(1);
        s0.addLast(2);
        s0.addLast(3);
        s0.addLast(4);
        s0.addLast(5); 
        
        System.out.println(s0);
        Node deleted = (Node)s0.removeAfter(1);
        //Node deleted = (Node)s0.removeFirst();
        System.out.println("Deleted Node is: "+ deleted.data);
        System.out.println(s0);
        
//        s0.addAfter(6, 0);
//        System.out.println(s0);
//        s0.removeAfter(0);
//        
//        System.out.println(s0);
//        s0.removeAfter(0);
//        
//        System.out.println(s0);
//        //s0.removeFirst();
//        Node deleted = (Node)s0.removeFirst();
//        System.out.println("Deleted Node is: "+ deleted.data);
//        System.out.println(s0);
//        //System.out.println(((Node)s0.removeFirst()).data);
//        s0.removeAfter(0);
//        System.out.println(s0);

//        s0.removeAfter(0);
//        System.out.println(s0);
//        s0.removeAfter(0);
//        System.out.println(s0);
//        s0.removeAfter(0);
//        System.out.println(s0);
//       
//        for (int i = 0; i < 10; i++) {
//            s0.addLast(i);
//            //s0.addAfter(i, i);
//        }
//        System.out.println(s0);
//        System.out.print("List: ");
//        s0.printReverse();
    }
}
