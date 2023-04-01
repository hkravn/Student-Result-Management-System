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
public class subjectTable {
    private final String url = "jdbc:mysql://localhost:3306/srm";
    private final String pass = "hkravn";
    private final String subTable = "(rollno VARCHAR(8), sem INT, subj1 varchar(20), subj2 varchar(20), subj3 varchar(20), subj4 varchar(20), subj5 varchar(20), subj6 varchar(20), PRIMARY KEY(rollno))";
    private final String classname = "com.mysql.cj.jdbc.Driver";

    public subjectTable() {
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS subjects " + subTable;
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
