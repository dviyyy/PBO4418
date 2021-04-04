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
public class Queue extends param_data {
    
    public void append(int data){
        try{
            for (int x = 0; x < param_data.length+1; x++){
                if (param_data[x] == 0){
                    param_data[x] = data;
                    break;
                }
                
                if (x == param_data.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = param_data.length;
            int[] temp_node = new int[len+1];
            for (int x = 0; x < len; x++){
                temp_node[x] = param_data[x];
            }
            temp_node[len] = data;
            param_data = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = param_data.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = param_data[i+1];
        }
        param_data = temp_node.clone();
    }
    
    public void UbahData(int index, int data){
        param_data[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < param_data.length; x++){
            System.out.println(param_data[x]);
        }
    }
}
    

