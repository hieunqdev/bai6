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
}
