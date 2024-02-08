
//Create a package named Calculator, that constitutes class Operations with member functions to Perform addition,
//multiplication subtraction and division of 2 numbers. Create another java file MyCalculator.java;
//that accepts input from user and performs the operations in a Menu Driven
import java.util.*;
import Calculator.*;

class MyCalculator {
    public static void main(String[] args) {
        int x,y,ch;
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the 1st no");
            x=sc.nextInt();
            System.out.println("enter the 2nd no");
            y=sc.nextInt();
            System.out.println("enter your choice\n1-add\t2-sub\t3-multiply\t4-div\t5-exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:op.add(x,y);
                break;
                case 2:op.sub(x,y);
                break;
                case 3:op.multi(x,y);
                break;
                case 4:op.div(x,y);
                break;
                case 5:
                break;
            }

        }while(ch!=5);
    }
}