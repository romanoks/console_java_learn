package ext;

/**
 * public all user see method or variable
 * private only class can use method or variable
 * protected class and extend's class can use
 * default can use in package
 */
public class detail {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color = "White";

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
