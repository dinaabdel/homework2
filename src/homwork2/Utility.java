package homwork2;

import java.util.Scanner;

public class Utility {
    String word;
    //geter&setter

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    //method
    public int numthea(String word) {
        char[] SameWord = word.toCharArray();
        // String arr=new String("the");
        // String ar=new String("a" );
        // String wor=new String("word");
        int sizeofcahar = SameWord.length;
        int the = 0;
        int count = 0;
        for (int i = 0; i < sizeofcahar; i++) {
            if (SameWord[i] == 'a') {
                count++;
            }//lower case "a"
            if (SameWord[i] == 'A') {
                count++;
            }//upper case "A"
            if (SameWord[i] == 't' && SameWord[i + 1] == 'h' && SameWord[i + 2] == 'e') {
                count++;
            }//lower case of "the"
            if (SameWord[i] == 'T' && SameWord[i + 1] == 'H' && SameWord[i + 2] == 'E') {
                count++;
            }// the upper case "THE"
        }
        return count;
    }

    /**
     * Palindrome means, if you reversed the word, the word will not be changed, for Example word 'BOB'
     * I don't care about the business logic too much but I wanted you to know it, if you face this term one day.
     */
    public void plaindrom(String word) {
        char[] love = word.toCharArray();
        int count = 0;
        int count1 = 0;
        int sizeLove = love.length;
        for (int i = 0; i < sizeLove; i++) {
            if (love[i] != ' ') {
                count1++;
            } else {
                count++;
            }
        }
        System.out.println("the number of ' '" + count + "there is not ' ' space in word number char" + count1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Utility obj = new Utility();
        System.out.println("enter the word ");
        String d = in.nextLine();
        obj.setWord(d);
        obj.getWord();
        System.out.println(obj.getWord());
        System.out.println(obj.numthea(d));
        obj.plaindrom(d);
    }
}

