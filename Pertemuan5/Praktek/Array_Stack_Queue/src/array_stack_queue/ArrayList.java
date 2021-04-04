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
 *  array [5] = 0 1 2 3 4 
 */
public class ArrayList extends param_data{
    
    public void append(int data){
        for (int x = 0; x < param_data.length; x++){
            if (param_data[x] == 0){
                param_data[x] = data;
                break;
            }
        }
    }
    
    public void append(int index, int data){
        param_data[index] = data;
    }
    
    public void pop(){
        for (int x = param_data.length-1; x > 0; x--){
            if (param_data[x] != 0){
                param_data[x] = 0;
                break;
            }
        }
    }
    
    public void pop(int index){
        param_data[index] = 0;
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

