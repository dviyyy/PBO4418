/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_stack_queue;

/**
 *
 * @author DEVI INDRIYANA PUTRI - A11.2019.12044
 * A11.4418
 */
public class Array_Stack_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("[Array List]");
        ArrayList new_array = new ArrayList();
        new_array.append(1);
        new_array.append(2);
        new_array.append(3);
        new_array.append(4);
        new_array.ShowData();
        System.out.println("-");
        new_array.append(5);
        new_array.ShowData();
        System.out.println("-");
        new_array.pop();
        new_array.ShowData();
        System.out.println("-");
        new_array.UbahData(0,7);
        new_array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Stack]");
        Stack new_stack = new Stack();
        new_stack.append(1);
        new_stack.append(2);
        new_stack.append(3);
        new_stack.append(4);
        new_stack.append(5);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.append(6);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.pop();
        new_stack.ShowData();
        System.out.println("-");
        new_stack.UbahData(0,0);
        new_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Queue]");
        Queue new_queue = new  Queue();
        new_queue.append(1);
        new_queue.append(2);
        new_queue.append(3);
        new_queue.append(4);
        new_queue.append(5);
        new_queue.ShowData();
        System.out.println("-");
        new_queue.pop();
        new_queue.ShowData();
        System.out.println("-");
        new_queue.UbahData(2,0);
        new_queue.ShowData();
        System.out.println("SELESAI");
    }
    
}



   