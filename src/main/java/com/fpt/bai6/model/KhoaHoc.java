package com.fpt.bai6.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="KhoaHoc")
public class KhoaHoc {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhoaHoc")
	private int MaKhoaHoc;
	
	@Column(name = "TenKhoaHoc")
    private String TenKhoaHoc;

    @Column(name = "MoTa")
    private String MoTa;
    
    @Column(name = "NgayBatDau", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date NgayBatDau;

    @Column(name = "NgayKetThuc")
    @Temporal(TemporalType.DATE)
    private Date NgayKetThuc;

	public KhoaHoc() {
		super();
	}

	public KhoaHoc(int maKhoaHoc, String tenKhoaHoc, String moTa, Date ngayBatDau, Date ngayKetThuc) {
		super();
		MaKhoaHoc = maKhoaHoc;
		TenKhoaHoc = tenKhoaHoc;
		MoTa = moTa;
		NgayBatDau = ngayBatDau;
		NgayKetThuc = ngayKetThuc;
	}

	public int getMaKhoaHoc() {
		return MaKhoaHoc;
	}

	public void setMaKhoaHoc(int maKhoaHoc) {
		MaKhoaHoc = maKhoaHoc;
	}

	public String getTenKhoaHoc() {
		return TenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		TenKhoaHoc = tenKhoaHoc;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	public Date getNgayBatDau() {
		return NgayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return NgayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}
    
    
}
