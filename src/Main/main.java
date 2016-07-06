package Main;

import ext.Audi;
import ext.arrayConstructor;
import interf.printWords;
import interf.voice;

import java.util.Random;

/**
 *  .class  we can get information about this class (Name, constructor, annotation etc)
 */
public class main implements printWords, voice {
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



    public static void main (String [] args){
        System.out.println("Let's go!!!");
        Class func2 = main.class;
        main func = new main();
        // * .class  we can get information about this class (Name, constructor, annotation etc)
        //func.addMember();
        //System.out.println("For circle \n\n");
        //func.printMark();
        //func.printWhilesCircle("While");
        //func.printWhilesCircle("do");
        Audi audi = new Audi();
        audi.setColor("Green");
        audi.printColor();
        if(audi.drive()){
            System.out.println("Let's go!!! Driver Driving good car!!!");
        }

        arrayConstructor arr = new arrayConstructor();
        arrayConstructor arr2 = new arrayConstructor(1);
        arr.printMark();
        arr2.printWhilesCircle("While");

        func.printInt(98);
        func.printCalabaration("Fogotten");
        if (func.isDone(75, "Test")){
            System.out.println("Good Boy/Girl!");
        }else System.out.println("Bad Boy/Girl!");
    }

    @Override
    public void printCalabaration(String word1) {
        System.out.println(word1);
    }

    @Override
    public void printInt(int iner) {
        System.out.println(iner);
    }

    @Override
    public boolean isDone(int perCent, String task) {
        if(perCent > 68 || task.equals("True")){
            return true;
        } else
            return false;
    }
}
