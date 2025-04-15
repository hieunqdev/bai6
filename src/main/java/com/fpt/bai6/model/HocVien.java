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

    @ManyToOne
    @JoinColumn(name = "MaKhoaHoc")
    private KhoaHoc khoaHoc;
}
