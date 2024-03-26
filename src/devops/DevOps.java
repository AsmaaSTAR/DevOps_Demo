/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;


import java.util.Scanner;

/**
 *
 * @author Asma
 */
public class DevOps {

    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Main Menu");
        System.out.println("1. Check odd or even");
        System.out.println("2. exit");
        
        int option = input.nextInt();
        switch(option){
            case 1:
                checkOddorEven();
                break;
            case 2:
                exit();
                break;
            default:
                System.out.println("Invalid option selected");
    }
    
}
    static void checkOddorEven(){
        
        int number;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        
        
        if (number % 2 ==0){
            System.out.println("number is even");
        }
       
        else{
            System.out.println("number entered is odd");
        }}

    static void exit(){
        System.out.println("closing the app");
        System.exit(1);
    }
}
