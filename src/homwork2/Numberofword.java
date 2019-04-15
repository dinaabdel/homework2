package homwork2;

import java.util.Scanner;

public class Numberofword {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter yur sentance");
        String pop=in.nextLine();
        char [] love=pop.toCharArray();
        int count=1;
        for(int r=0;r<love.length;r++){

            if(love[r]==' '){
              count++;
            }
        }
        System.out.println("the number of word per sentance"+" "+count);
    }
    //if the sentance doesnot have " "we do what .
}
