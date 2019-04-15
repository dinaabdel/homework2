package homwork2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter sentance that have redundunce word or char ");
        String up=in.nextLine();
        char[] ink=up.toCharArray();
        System.out.println("enter your regex begin in .* and finished in .* if you do not but them the matches false ");
        String regex=in.nextLine();

        Pattern dodo=Pattern.compile(regex);
       boolean matches=Pattern.matches(regex,up);
        System.out.println("matches="+matches);
        String sentance = "dina :dodo";

        Pattern pattern = Pattern.compile(":dodo$");
        Matcher matcher = pattern.matcher(sentance);

        while(matcher.find()){
            System.out.println("found match at / "  + matcher.start() + " to " + matcher.end());
            //split methods
            String words="one six three  six  one ";
            String [] first= words.split("one");
            for(int i=0;i<first.length;i++)
            {
            System.out.println(first[i]);
            }
            String firstd=words.replaceAll("one","tow");
            System.out.println(firstd);
            String gigi=words.replaceFirst("six","ten");
            System.out.println(gigi);
        }

}}
