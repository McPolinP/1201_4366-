/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Student[] s = new Student[5];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<s.length; i++){
            
            s[i] = new Student(); //always need to do this test in a for loop
            System.out.println("Enter id: ");
            s[i].setId(scan.nextInt());
            System.out.println("enter name: ");
            s[i].setName(scan.nextLine());
        }
    }
    
}
