/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.result.management.system;
import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class studentTable {
    private final String url = "jdbc:mysql://localhost:3306/srm";
    private final String pass = "hkravn";
    private final String tableCr = "(rollno VARCHAR(8), last INT, name VARCHAR(25), fname VARCHAR(25), dob VARCHAR(10), gender VARCHAR(15), address VARCHAR(100), PRIMARY KEY(rollno))";
    private final String classname = "com.mysql.cj.jdbc.Driver";
    private HashMap<Integer, String> hm = new HashMap<>();

    public studentTable() {
        hm.put(1,"CE");
        hm.put(2,"CS");
        hm.put(3,"EE");
        hm.put(4,"EC");
        hm.put(5,"ME");
        
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url,"root",pass);
            
            Statement st = con.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS students " + tableCr;
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

    public String getHm(int index) {
        return hm.get(index);
    }
}
