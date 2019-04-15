package homwork2;

//import sun.awt.shell.DefaultShellFolder;

import java.io.File;
import java.util.List;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;

public class Homeworkfive
{

    public static void main(String[] args)throws IOException {
        File dir=new File ("dir");
        String [] ext= new String[]{"txt","jsp"};
        System.out.println("get all files .txt and .jsp"+ dir.getCanonicalPath()+"includes those in subdiroctories");
       List<File>files = null;
        for (File file : files) {
           System.out.println("file: " + file.getCanonicalPath());
        }

    }
    //tow another way of homework two;
}


