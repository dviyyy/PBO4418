/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststatic;

/**
 *
 * @author vv
 */
public class TestStatic {
    int count;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int getCount(){
        return count;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i<= n; i++)
            result *=i;
        
        return result;
    }
}
