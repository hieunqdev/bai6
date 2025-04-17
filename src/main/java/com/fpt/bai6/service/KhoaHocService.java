package com.fpt.bai6.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fpt.bai6.model.KhoaHoc;
import com.fpt.bai6.repository.HocVienRepository;
import com.fpt.bai6.repository.KhoaHocRepository;

import jakarta.transaction.Transactional;


//Dòng này: Định nghĩa phương thức getAllHocVien, trả về một danh sách các 
//đối tượng Map<String, Object>. Mỗi Map sẽ chứa các cặp khóa-giá trị 
//tương ứng với kết quả của truy vấn trong HocVienRepository.

@Service
public class KhoaHocService {

    @Autowired
    private KhoaHocRepository khoaHocRepository;

    public List<KhoaHoc> findPageKhoaHoc(int offset, int limit) {
        return khoaHocRepository.findPageKhoaHoc(offset, limit);
    }
    
    public KhoaHoc createKhoaHoc(KhoaHoc khoaHoc) {
    	khoaHocRepository.save(khoaHoc);
    	System.out.println("✅ Đã tạo khóa học với ID: " + khoaHoc.getMaKhoaHoc());
		return khoaHoc;
	}
    
    public void deleteKhoaHoc(int maKhoaHoc) {
        khoaHocRepository.deleteById(maKhoaHoc);
        
        if (khoaHocRepository.existsById(maKhoaHoc)) {
            System.out.println("❌ Không xóa được!");
        } else {
            System.out.println("✅ Đã xóa khỏi DB");
        }
    }
}
