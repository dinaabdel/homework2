package homwork2;

import java.io.*;

public class SerializationDeserialized {
    private String StudentName;
    private int age ;
    private double salarywork;
    //setter&getter
    public SerializationDeserialized(String StudentName,int age ,double salarywork){
        this.StudentName="dina";
        this.age=21;
        this.salarywork=200;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalarywork() {
        return salarywork;
    }

    public void setSalarywork(double salarywork) {
        this.salarywork = salarywork;
    }

    public static void main(String[] args) {
        SerializationDeserialized obj= new SerializationDeserialized("areej",26,800);
        String namefile="file important";
        //serial
        try{
            //saving an object in a file
            FileOutputStream file = new FileOutputStream(namefile);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("object has been serialized");
        } //catch (FileNotFoundException e) {
           // e.printStackTrace();
        //}
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException e");
        }
        //Deserialization
        try{
            //reading object from file
            FileInputStream file= new FileInputStream(namefile);
            ObjectInputStream in= new ObjectInputStream(file);
            obj= (SerializationDeserialized)in.readObject();
            System.out.println(" object has been Deserialization  ");
            System.out.println("student name:"+obj.getStudentName());
            System.out.println("age:"+obj.getAge());
            System.out.println("salary:"+obj.getSalarywork());

        }
        catch (FileNotFoundException e) {
           e.printStackTrace();
            System.out.println("FileNotFoundException e is caught");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException e is caught");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
