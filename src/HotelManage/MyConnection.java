/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mizanur Rahman
 */
public class MyConnection {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    void Myconnect(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
