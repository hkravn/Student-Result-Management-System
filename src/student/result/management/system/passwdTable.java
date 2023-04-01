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
public class passwdTable {
    private final String url = "jdbc:mysql://localhost:3306/srm";
    private final String pass = "hkravn";
    private final String passTable = "(username VARCHAR(20), password VARCHAR(20), access INT, PRIMARY KEY(username))";
    private final String classname = "com.mysql.cj.jdbc.Driver";

    public passwdTable() {
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS password " + passTable;
            st.execute(sql);
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public String getPwd(String user,int access) {
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "SELECT password, access FROM password WHERE username = '" + user + "'";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                if (access==rs.getInt("access")) return rs.getString("password");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return "";
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
