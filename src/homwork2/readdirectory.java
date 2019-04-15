package homwork2;

import java.io.File;
import java.io.IOException;
public class readdirectory {


    public static void main(String[] args) throws IOException {

        File fofo = new File("."); // current directory

        File[] files = fofo.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory:");
            } else {
                System.out.print("     file:");
            }
            System.out.println(file.getCanonicalPath());
        }
}}
