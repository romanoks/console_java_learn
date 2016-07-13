package collect;

import java.sql.*;

/**
 * Created by raks on 13.07.16.
 */
public class ImplementsUserDAO implements UserDAO{

    Connection dbConn = null;
    PreparedStatement stmt = null;

    public void insertRow(String name, String surname, String email, String phone, String login) {
        dbConn = connectionDb.getDBConnection();
        try {
            stmt = dbConn.prepareStatement(insertUser);
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, email);
            stmt.setString(4, phone);
            stmt.setString(5, login);

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConn != null) {
                try {
                    dbConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void allRows() {
        try {
            dbConn = connectionDb.getDBConnection();
            Statement stmt2 = dbConn.createStatement();

            // выбираем данные с БД
            ResultSet rs = stmt2.executeQuery(selectAll);

            // И если что то было получено то цикл while сработает
            while (rs.next()) {
                String userName = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                String email = rs.getString("EMAIL");

                System.out.println("userid : " + userName);
                System.out.println("username : " + surname);
                System.out.println("email : " + email);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            if (dbConn != null) {
                try {
                    dbConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void updateRow(String name, int id) {
        try {
            dbConn = connectionDb.getDBConnection();
            stmt = dbConn.prepareStatement(updateUser);
            stmt.setString(1,name);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConn != null) {
                try {
                    dbConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
