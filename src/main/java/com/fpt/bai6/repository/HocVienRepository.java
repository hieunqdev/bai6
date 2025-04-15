package com.fpt.bai6.repository;

import com.fpt.bai6.model.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Map;

public interface HocVienRepository extends JpaRepository<HocVien, Long> {

    @Query(value = "SELECT " +
            "kh.MaKhoaHoc, kh.TenKhoaHoc, kh.MoTa, kh.NgayBatDau, kh.NgayKetThuc, " +
            "hv.MaHocVien, hv.TenHocVien " +
            "FROM KhoaHoc kh JOIN HocVien hv ON kh.MaKhoaHoc = hv.MaKhoaHoc", nativeQuery = true)
    List<Map<String, Object>> findHocVien();
}
