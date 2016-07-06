package ext;

import java.util.Random;

/**
 * Created by raks on 06.07.16.
 */
public class arrayConstructor {
    private int [] mark;
    Random rand = new Random();

    //Use for circle
    public arrayConstructor() {

        mark = new int[1000];
        for (int i = 0; i < 1000; i++) {
            mark[i] = 1 + rand.nextInt(1 + 100);
        }
    }

    public arrayConstructor(int number){

        mark = new int[number];

        for (int i = 0; i < number; i++) {
            mark[i] = 1 + rand.nextInt(1 + 100);
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
            System.out.println("While circle \n\n");
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
            System.out.println("DoWhile circle \n\n");
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
}
