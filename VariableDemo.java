public class VariableDemo {
    public static void main(String[] args) {

        //primitive datatypes

        int age = 20;
        System.out.println(age);

        double price = 90.99;
        System.out.println(price);

        boolean isActive = true;
        System.out.println(isActive);

        char grade='A';
        System.out.println(grade);



        //string class basics

        String name = "Rishith";
        System.out.println(name);

        //Variable declaration

        int number;
        double salary;
        //Initialization
        number=502;
        salary=60000.00;
        System.out.println(number);
        System.out.println(salary);

        //Implicit Type Casting
        int a=10;
        double d=a;//Implicit typecasting is done automatically by java
        System.out.println(d);

        //Explicit Type Casting
        double x=12.75;
        int y=(int)x;
        System.out.println(y);


    }
}
