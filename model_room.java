/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package room;

/**
 *
 * @author Admin
 */
public class model_room {
    private String MaPhong;
    private double dientich;
    private String loaiPhong;
    private int GiaPhong;
    private String mota;
    private boolean TrangThai;

    public model_room() {
    }

    public model_room(String MaPhong, double dientich, String loaiPhong, int GiaPhong, String mota, boolean TrangThai) {
        this.MaPhong = MaPhong;
        this.dientich = dientich;
        this.loaiPhong = loaiPhong;
        this.GiaPhong = GiaPhong;
        this.mota = mota;
        this.TrangThai = TrangThai;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    
    public Object[] toDataRow(){
        return new Object[]{this.getMaPhong(), this.getDientich(), 
            this.getLoaiPhong(),this.getGiaPhong(), this.getMota(), this.isTrangThai()?"trống":"còn phòng"};
    }
    
}
