package homwork2;

import java.util.Scanner;

public class Math {
    static double  Number;
    static  double Number2;
     String NameOfOperation;
    public Math(){
      Number=10;
      Number2=4;
      NameOfOperation="add";
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public double getNumber2() {
        return Number2;
    }

    public void setNumber2(double number2) {
        Number2 = number2;
    }

    public String getNameOfOperation() {
        return NameOfOperation;
    }

    public void setNameOfOperation(String nameOfOperation) {
        NameOfOperation = nameOfOperation;
    }
    //method that we use it in math and it is static
    public  static double add (double num,double num2){
        return num+num2;
    }
    public static double  multiplication(double num1,double num2){
       return num1*num2;
    }
    public static double division(double num1,double num2){
        return( num1/num2);
    }
    public static double suptraction(double num1,double num2){
        return (num1-num2);
    }
    public static double modulas(double num,double num2){
        return (num%num2);
    }
    //method by using static instance variable and this will be the same to all object
    public double add (){
        return getNumber()+getNumber2();
    }
    public  double  multiplication(){
        return getNumber()*getNumber2();
    }
    public double division(){
        return getNumber2()/getNumber();
    }
    public double suptraction(){
        return getNumber()-getNumber2();
    }
    public double modulas(){
        return getNumber()%getNumber2();
    }


    //main to test the math class
    public static void main(String[] args) {
        Scanner dina=new Scanner(System.in);
        System.out.println("enter the tow  number that yoy want to test ");
        double number1=dina.nextDouble();
        double number2=dina.nextDouble();
        Math obj1=new Math();
        //here we can use the name of class and the object if we want //
        System.out.println("the result of add is :"+Math.add(number1,number2));
        System.out.println("the result of multi is :"+Math.multiplication(number1,number2));
        System.out.println("the result of sub is:"+Math.suptraction(number1,number2));
        System.out.println("the reslt of div is :"+obj1.division(number1,number2));
        System.out.println("the result of modulus is :"+obj1.modulas(number1,number2));
        Math obj=new Math();
        System.out.println("tge result of matmatical operation used statuc instance variable ");
        System.out.println("the result of add is :"+obj1.add());//the same obj
        System.out.println("the result of multi is :"+obj1.multiplication());//the same obj
        System.out.println("the result of sub is:"+obj.suptraction());
        System.out.println("the reslt of div is :"+obj.division());
        System.out.println("the result of modulus is :"+obj.modulas());

    }
}
