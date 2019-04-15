package homwork2;

import java.util.Scanner;

public class Instance {
    //if you mean like a timer so i can think like this
    int secound;
    int minite;
    int houre;
    //getter &setter

    public int getSecound() {
        return secound;
    }

    public void setSecound(int secound) {
        this.secound = secound;
    }

    public int getMinite() {
        return minite;
    }

    public int getHoure() {
        return houre;
    }

    public void setHoure(int houre) {
        this.houre = houre;
    }

    public void setMinite(int minite) {
        this.minite = minite;
    }

    //method
    public  void increcmentmiminte() {
        if (this.secound == 60) {
            this.minite += 1;
            secound=00;
        } else {
            System.out.println("did not reach 60 secound ");
        }
        if (secound>60){
            secound-=60;
            minite+=secound;
        }
    }
    public void  incrementhouer(){
      if(minite==60){
          houre+=1;
          minite=00;
      }
        else{
          System.out.println("do not minite reach 60");
      }
        if (minite>60){
            minite-=60;
            houre+=minite;
        }
    }
     public void add (int amount ){
        secound+=amount;
        increcmentmiminte();
        incrementhouer();
     }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Instance d=new Instance();
        System.out.println("enter the secound & minite & houer make sure that the range of sec mint 0-60 & range houer 0-24 ");
        int sec=in.nextInt();
        int min=in.nextInt();
        int houer=in.nextInt();
        d.setSecound(sec);
        d.setMinite(min);
        d.setHoure(houer);
        if(sec<10 & min<10 & houer<10){
            System.out.println("0"+d.getHoure()+":"+"0"+d.getMinite()+":"+"0"+d.getSecound());
        }
        else {
            System.out.println(d.getHoure() + ":" + d.getMinite() + ":" + d.getSecound() + "AM");
        }
        int amount=in.nextInt();
        System.out.println("enter the number increase the clock");
        d.add(amount);
        if(sec<10 & min<10 & houer<10){
            System.out.println("0"+d.getHoure()+":"+"0"+d.getMinite()+":"+"0"+d.getSecound());
        }
        else {
            System.out.println(d.getHoure() + ":" + d.getMinite() + ":" + d.getSecound() + "AM");
        }



        }

}
