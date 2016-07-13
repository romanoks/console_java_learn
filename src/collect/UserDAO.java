package collect;

/**
 * Created by raks on 13.07.16.
 */
public interface UserDAO {
    public static String insertUser = "INSERT INTO user (name, surname,email,phone,login) VALUES(?,?,?,?,?)";
    public static String updateUser = "UPDATE user SET name = ? WHERE id =?";
    String deleteRow = "DELETE FROM user WHERE id = ?";
    String selectAll = "SELECT * FROM user";
    void insertRow(String name, String surname, String email, String phone, String login);
    void allRows();
    void updateRow(String name, int id);
    void deleteUser(int id);
}
