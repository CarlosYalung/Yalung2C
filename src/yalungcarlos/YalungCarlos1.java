
package yalungcarlos;

import java.util.Scanner;

public class YalungCarlos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Marks in Science:");
        int science = sc.nextInt();
        
        System.out.print("Enter Marks in History:");
        int history = sc.nextInt();
        
        System.out.print("Enter Marks in Math:");
        int math = sc.nextInt();
        
        System.out.print("Enter Marks in Soc:");
        int soc = sc.nextInt();
        
        System.out.print("Enter Marks in Arts:");
        int arts = sc.nextInt();
        
        int total = science + history + math + soc + arts;
        double percentage = total / 5.0;
        
        String remark;
        if (percentage < 70) {
            remark = "Fail";
       }else if (percentage <= 75){
           remark = "poor";
       }else if(percentage <= 80){
           remark = "Fair";
       }else if (percentage <= 85){    
           remark = "Good";
       }else if (percentage <=90){    
           remark = "Very Good";
       }else{    
           remark = "Excellent";
   }
    
        System.out.println("\nTotal Marks: " + total);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println(remark + "Remark: ");
        
        if (percentage <70) {
            System.out.println("Try Again" + name + ".");
        }else{
            System.out.println("Congrats" + name + ", you Passed.");
        }
    }
}
