import java.util.*;

class employee {
    String name;
    int age;
    long phoneno;
    String address;
    double salary;

    void printsalary() {
        System.out.print(salary);
    }
}

class officer extends employee {
    String specialization;

    void readofficer() {
        System.out.println("Enter details of officer:");
        System.out.println("Enter name");
        System.out.println("Enter age");
        System.out.println("Enter phoneno");
        System.out.println("Enter address");
        System.out.println("Enter salary");
    }

    void printdetails()
    {
        System.out.println("Details of officer:");
        System.out.print("Name: "+name+"\nage:"+age+"\nphoneno:"+phoneno+"\naddress:"+address+"\nsalary:"+salary);
    }
}

class manager extends employee 
{
    String department;

    void readmanager() {
        System.out.println("\nEnter details of manager:");
        System.out.println("Enter name");
        System.out.println("Enter age");
        System.out.println("Enter phoneno");
        System.out.println("Enter address");
        System.out.println("Enter salary");
    }

    void printdetailsm()
    {
            System.out.println("\nDetails of manager:");
            System.out.print("Name: "+name+"\nage:"+age+"\nphoneno:"+phoneno+"\naddress:"+address+"\nsalary:"+salary);
            Scanner sc=new Scanner(System.in);
            name=sc.nextLine();
            age=sc.nextInt();
            phoneno=sc.nextLong();
            sc.nextLine();
            address=sc.nextLine();
            salary=sc.nextDouble();
            name=sc.nextLine();
            age=sc.nextInt();
            phoneno=sc.nextLong();
            sc.nextLine();
            address=sc.nextLine();
            salary=sc.nextDouble();

    }
}

class inheritance {
    public static void main(String arg[]) {
        officer ob = new officer();
        manager ob1 = new manager();
        ob.readofficer();
        ob.printdetails();
        ob1.readmanager();
        ob1.printdetailsm();
    }
}