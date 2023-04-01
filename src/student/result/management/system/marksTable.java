/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.result.management.system;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class marksTable {
    private final String url = "jdbc:mysql://localhost:3306/srm";
    private final String pass = "hkravn";
    private final String markTable = "(rollno VARCHAR(8), sem INT, subj1 int, subj2 int, subj3 int, subj4 int, subj5 int, subj6 int, PRIMARY KEY(rollno))";
    private final String classname = "com.mysql.cj.jdbc.Driver";

    public marksTable() {
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS marks " + markTable;
            st.execute(sql);
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public String getUrl() {
        return url;
    }

    public String getPass() {
        return pass;
    }

    public String getClassname() {
        return classname;
    }
}
