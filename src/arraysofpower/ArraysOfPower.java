/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysofpower;

public class ArraysOfPower {

    public static void main(String[] args) {
int[]numbers = {3,5,8,13};
int[]numbers2= new int[numbers.length];
numbers2= numbers;
for(int i =0; i<numbers.length;i++)
{
    System.out.println(numbers2[i]);
}
    }
    
}
