package Main;

import java.util.Random;

/**
 * Created by User on 04.07.2016.
 */
public class main {
    private int [] mark = new int[1000];
    Random rand = new Random();

    //Use for circle
    public void addMember(){

        for(int i = 0; i < 1000; i++){
            mark[i] = 1 + rand.nextInt(1+100);
        }
    }

    //Use foreach cicrle
    public void printMark(){
        for (int s : mark){
            if(s >= 1 && s < 31 ){
                System.out.println("Bad mark!");
            } else if (s > 30 && s < 71){
                System.out.println("Middle mark");
            }
            else {
                System.out.println("Good mark");
            }
        }
    }

    //Use while, do While
    public void printWhilesCircle( String flag){

        int i = 0;
        if (flag.equals("While")) {
            while (mark.length > i) {
                if (mark[i] >= 1 && mark[i] < 31) {
                    System.out.println("Bad mark!");
                } else if (mark[i] > 30 && mark[i] < 71) {
                    System.out.println("Middle mark");
                } else {
                    System.out.println("Good mark");
                }
                ++i;
            }
        }else {
             do{
                    if (mark[i] >= 1 && mark[i] < 31) {
                        System.out.println("Bad mark!");
                    } else if (mark[i] > 30 && mark[i] < 71) {
                        System.out.println("Middle mark");
                    } else {
                        System.out.println("Good mark");
                    }
                    ++i;
                }while(mark.length > i);
            }


        }



    public static void main (String [] args){
        System.out.println("Let's go!!!");
        main func = new main();
        func.addMember();
        func.printMark();
    }
}
