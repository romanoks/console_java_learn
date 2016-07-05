package ext;

/**
 * Created by User on 05.07.2016.
 */
public class detail {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected String color = "White";

    public boolean isMashine() {
        return mashine;
    }

    public void setMashine(boolean mashine) {
        this.mashine = mashine;
    }

    protected boolean mashine = false;

    public void sign(){
        System.out.println("Fa-fa-fa");
    }

    public boolean drive(){
        if (!mashine) {
            return false;
        }
        else return true;
    }
}
