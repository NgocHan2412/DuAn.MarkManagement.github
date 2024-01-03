/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alige_quanlydiem;

/**
 *
 * @author ADMIN
 */
public class gv_class {
    String MaSV;
    String Hoten;
    String Email;
    String SDT;
    boolean Gioitinh;
    Double Toan;
    Double Van;
    Double Anhvan;

    public gv_class(String MaSV, String Hoten, String Email, String SDT, boolean Gioitinh, Double Toan, Double Van, Double Anhvan) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SDT = SDT;
        this.Gioitinh = Gioitinh;
        this.Toan = Toan;
        this.Van = Van;
        this.Anhvan = Anhvan;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public Double getToan() {
        return Toan;
    }

    public void setToan(Double Toan) {
        this.Toan = Toan;
    }

    public Double getVan() {
        return Van;
    }

    public void setVan(Double Van) {
        this.Van = Van;
    }

    public Double getAnhvan() {
        return Anhvan;
    }

    public void setAnhvan(Double Anhvan) {
        this.Anhvan = Anhvan;
    }

}
