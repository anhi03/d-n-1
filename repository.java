/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package room;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class repository {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    
    public ArrayList<model_room> getAll(){
        ArrayList<model_room> list_NV = new ArrayList<>();
        sql = "select MaPhong, dientich, loaiPhong,GiaPhong, mota, TrangThai from phong";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maroom, typeroom, mota;
                boolean dientich;
//                String 
                int price;
                boolean trangthai;
                maroom = rs.getString(1);
                dientich = rs.getBoolean(2);
                typeroom = rs.getString(3);
                price = rs.getInt(4);
                mota = rs.getString(5);
                trangthai = rs.getBoolean(6);
                model_room m1 = new model_room(maroom, price, maroom, price, mota, trangthai);
                list_NV.add(m1);
            }
            return list_NV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int them(model_room m2){
        sql = "insert into Phong (MaPhong, dientich, loaiPhong,GiaPhong, mota, TrangThai) values (?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m2.getMaPhong());
            ps.setObject(2, m2.getDientich());
            ps.setObject(3, m2.getLoaiPhong());
            ps.setObject(4, m2.getGiaPhong());
            ps.setObject(5, m2.getMota());
            ps.setObject(6, m2.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int sua(model_room m3, String maphong){
        sql = "update Phong set dientich =?, loaiPhong =?,GiaPhong=?, mota=?, TrangThai=? where MaPhong = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m3.getDientich());
            ps.setObject(2, m3.getLoaiPhong());
            ps.setObject(3, m3.getGiaPhong());
            ps.setObject(4, m3.getMota());
            ps.setObject(5, m3.isTrangThai());
            ps.setObject(6, maphong);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int xoa(String maphong ){
        sql = "delete from Phong where maPhong =?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maphong);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
