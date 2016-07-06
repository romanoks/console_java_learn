package ext;

/**
 * Created by User on 05.07.2016.
 */
public class Audi extends detail {

    private boolean driver = true;

    public void printColor(){
        System.out.println(getColor());
    }

    public boolean drive(){
        setMashine(true);
       if(mashine && driver){
           return true;
       } else return false;
    }

    public boolean drive2(){
        return super.drive();
    }

}
