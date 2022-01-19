/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Place;
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
public class PlaceService implements IDao<Place> {

    @Override
    public boolean create(Place o) {
        try {
            for (int i = 1; i < 5; i++) {
                String sql = "insert into place values (null, ?, false, vehicule,?)";
                PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
                ps.setInt(1, i);
                ps.setInt(2, o.getRef());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean gene(int ids) {

        try {
            for (int i = 1; i < 5; i++) {
                String sql = "insert into place values (null, ?, false, 'vehicule',?)";
                PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
                ps.setInt(1, i);
                ps.setInt(2, ids);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @Override
    public boolean delete(Place o) {
        String sql = "delete from place where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Place o) {
        String sql = "update place set numero = ? , etat = ?, type = ?, ref = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getNumero());
            ps.setBoolean(2, o.getEtat());
            ps.setString(3, o.getType());
            ps.setInt(4, o.getRef());
            ps.setInt(5, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    public boolean updateEtat(Place o) {
        String sql = "update place set etat = true where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update etat : erreur sql : " + e.getMessage());

        }
        return false;
    }

    public boolean updateEtatFalse(Place o) {
        String sql = "update place set etat = false where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update etatF : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Place findById(int id) {
        String sql = "select * from place where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Place(rs.getInt("id"), rs.getInt("numero"), rs.getBoolean("etat"), rs.getString("type"), rs.getInt("ref"));

            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    public int findetat(int ref ) {
        String sql = "select count(etat) as cnt from place where  etat = true  and ref=?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1,ref);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                return rs.getInt("cnt");
            }

        } catch (SQLException e) {
            System.out.println("findetatT " + e.getMessage());
        }
        return -1;
    }

    public int findetatF(int ref) {
        String sql = "select count(etat ) as cnt from place where  etat = false and ref=? ";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1,ref);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               return rs.getInt("cnt");
            }

        } catch (SQLException e) {
            System.out.println("findetatF " + e.getMessage());
        }
        return -1;
    }
     public List<Place> findAllbySection(int id) {
        List<Place> places = new ArrayList<Place>();
        String sql = "select * from place where ref=?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                places.add(new Place(rs.getInt("id"), rs.getInt("numero"), rs.getBoolean("etat"), rs.getString("type"), rs.getInt("ref")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return places;
    }

    @Override
    public List<Place> findAll() {
        List<Place> places = new ArrayList<Place>();
        String sql = "select * from place";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                places.add(new Place(rs.getInt("id"), rs.getInt("numero"), rs.getBoolean("etat"), rs.getString("type"), rs.getInt("ref")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return places;
    }
}
