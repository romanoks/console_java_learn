package Main;

import collect.ImplementsUserDAO;
import collect.connectionDb;

/**
 * Created by User on 04.07.2016.
 */
public class main {

    public static void main (String [] args){
        System.out.println("Let's go!!!");
        //connectionDb connect = new connectionDb();
        //connect.getDBConnection();
        ImplementsUserDAO dev = new ImplementsUserDAO();
        //dev.insertRow("Jake","Human","hum@gmail.com","+3789 85 56545","tractor");
        dev.deleteUser(1);
        dev.allRows();
        dev.updateRow("Jeramy",2);
        dev.allRows();
    }
}
