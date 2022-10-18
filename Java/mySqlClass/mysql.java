package mySqlClass;

import java.sql.*;
public class mysql {
    public static void main(String[] args) {
        try{
            //Register
            Class.forName("com.mysql.jdbc.Driver");
            //Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root" , "7014");

            Statement st = con.createStatement();
            ResultSet re = st.executeQuery("select  * from emp");

            while (re.next()){
                System.out.println(re.getInt(1) + " " +  re.getString(2));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
