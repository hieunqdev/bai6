package com.fpt.bai6.repository;

import com.fpt.bai6.model.KhoaHoc;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Integer> {
	@Query(value = """
		    SELECT 
		        MaKhoaHoc AS ma_khoa_hoc,
		        TenKhoaHoc AS ten_khoa_hoc,
		        MoTa AS mo_ta,
		        NgayBatDau AS ngay_bat_dau,
		        NgayKetThuc AS ngay_ket_thuc
		    FROM KhoaHoc
		    ORDER BY MaKhoaHoc
		    OFFSET :offset ROWS FETCH NEXT :limit ROWS ONLY
		    """, nativeQuery = true)
	List<KhoaHoc> findPageKhoaHoc(@Param("offset") int offset, @Param("limit") int limit);
}
