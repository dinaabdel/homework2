package homwork2;

import java.util.Scanner;

public class Applicationforline {
    String sentance;
    public void setSentance(String word){
        sentance=word;
    }
    public String getSentance(){
        return sentance;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sentance do you want");

        String neww=in.nextLine();
        Applicationforline obj=new Applicationforline();
        obj.setSentance(neww);
        System.out.println(" the sentance that you enter:"+" "+obj.getSentance());
        //char[] big={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] s=neww.toCharArray();
        for(int k=0;k<s.length;k++){
            int count=0;
           for(int j=0;j<s.length;j++) {
                 if( j<k&&s[k]==s[j]){
                     break;
                 }
               if (s[j] == s[k]) {
                   count++;
               }

               if (j==s.length-1){
                  // char temp =s[k];
                  // s[k]=s[k+1];
                   //s[k+1]=temp;
                       System.out.println("the char :)" + s[k] + " " + "the number of freq to char" + count + " " + "times");

               }

           }
          //  System.out.println("the char ;"+s[k]+" "+"the number of freq to char"+count+" "+"times");
        }

    }


}
