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
public class profTable {
    private final String url = "jdbc:mysql://localhost:3306/srm";
    private final String pass = "hkravn";
    private final String tableCr = "(empid INT, name VARCHAR(25), fname VARCHAR(25), address VARCHAR(100), PRIMARY KEY(empid))";
    private final String classname = "com.mysql.cj.jdbc.Driver";

    public profTable() {
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS prof " + tableCr;
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
