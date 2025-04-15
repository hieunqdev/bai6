package com.fpt.bai6.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HocVien")
public class HocVien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaHocVien")
	private Long MaHocVien;

	@Column(name = "TenHocVien")
	private String TenHocVien;

	@Temporal(TemporalType.DATE)
	@Column(name = "NgaySinh")
	private Date NgaySinh;

	@Column(name = "GioiTinh")
	private Boolean GioiTinh;

	@Column(name = "Email")
	private String Email;

	@Column(name = "SoDienThoai")
	private String SoDienThoai;

	@Column(name = "DiaChi")
	private String DiaChi;

//    Nhiều Học Viên tham gia 1 khóa học 
	@ManyToOne
	@JoinColumn(name = "MaKhoaHoc")
	private KhoaHoc khoaHoc;

	public HocVien() {
		super();
	}

	public HocVien(Long maHocVien, String tenHocVien, Date ngaySinh, Boolean gioiTinh, String email, String soDienThoai,
			String diaChi, KhoaHoc khoaHoc) {
		super();
		MaHocVien = maHocVien;
		TenHocVien = tenHocVien;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		Email = email;
		SoDienThoai = soDienThoai;
		DiaChi = diaChi;
		this.khoaHoc = khoaHoc;
	}

	public Long getMaHocVien() {
		return MaHocVien;
	}

	public void setMaHocVien(Long maHocVien) {
		MaHocVien = maHocVien;
	}

	public String getTenHocVien() {
		return TenHocVien;
	}

	public void setTenHocVien(String tenHocVien) {
		TenHocVien = tenHocVien;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public Boolean getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

}
