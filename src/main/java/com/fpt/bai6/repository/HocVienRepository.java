package com.fpt.bai6.repository;

import com.fpt.bai6.model.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Map;

//Dòng này: Định nghĩa interface HocVienRepository, kế thừa JpaRepository 
//với kiểu đối tượng là HocVien và khóa chính là kiểu Long. 
//JpaRepository cung cấp các phương thức CRUD tự động cho HocVien.

//@Query để chỉ định một câu truy vấn SQL thuần túy (native SQL)

//Dòng này: Định nghĩa phương thức findHocVien trả về danh sách (List) 
//các đối tượng Map. Mỗi đối tượng Map chứa một dòng dữ liệu từ kết quả 
//của câu truy vấn SQL, 
//với khóa là tên cột và giá trị là giá trị tương ứng của cột đó.

public interface HocVienRepository extends JpaRepository<HocVien, Long> {
    @Query(value = "SELECT " +
            "kh.MaKhoaHoc, kh.TenKhoaHoc, kh.MoTa, kh.NgayBatDau, kh.NgayKetThuc, " +
            "hv.MaHocVien, hv.TenHocVien " +
            "FROM KhoaHoc kh JOIN HocVien hv ON kh.MaKhoaHoc = hv.MaKhoaHoc", nativeQuery = true)
    List<Map<String, Object>> findHocVien();
}
