/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Login;
import connexion.Connexion;
import dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Imane
 */
public class LoginService  implements IDao<Login> {

    @Override
    public boolean create(Login o) {
       String sql = "insert into user values (null, ?,?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getusername());
            ps.setString(2, o.getpassword());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    @Override
    public boolean delete(Login o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Login o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Login findAlls(String username, String password) {
        Login l=new Login();
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                l.setusername(rs.getString("username"));
                l.setPassword(rs.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        System.out.println(l);
        return l;
    }
    @Override
    public List<Login> findAll() {
         List<Login> logins = new ArrayList<Login>();
        String sql = "select * from user ";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                logins.add(new Login(rs.getString("username"), rs.getString("password")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return logins;
    
}
}
