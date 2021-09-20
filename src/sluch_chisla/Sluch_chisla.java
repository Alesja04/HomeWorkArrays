/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sluch_chisla;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Sluch_chisla {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a = 1, b = 1;
        double summa = 0;
        int[] nums = new int[20];
        Random rnd = new Random();
        for(int i = 0; i < 20; i++) {
            nums[i] = rnd.nextInt(100);
            while(nums[i] %2 !=0){
                nums[i] = rnd.nextInt(100);
            }
            System.out.println(nums[i]);
        }
        a = nums[0];
        b = nums[0];
        summa = nums[0];
        for(int i = 1; i < 20; i++){
            if(a < nums[i]){
                a = nums[i];
            }
            else if(b > nums[i]){
                b= nums[i];
            }
            summa+=nums[i];
        }
        summa=(double)(summa-a-b)/18;
        System.out.println("ARIFMETIK - " + summa);
    }
}


    
 
