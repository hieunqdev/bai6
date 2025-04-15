package com.fpt.bai6.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.bai6.repository.HocVienRepository;


//Dòng này: Định nghĩa phương thức getAllHocVien, trả về một danh sách các 
//đối tượng Map<String, Object>. Mỗi Map sẽ chứa các cặp khóa-giá trị 
//tương ứng với kết quả của truy vấn trong HocVienRepository.

@Service
public class HocVienService {
	@Autowired
    private HocVienRepository hocVienRepository;

	public List<Map<String, Object>> getAllHocVien() {
        return hocVienRepository.findHocVien();
    }
}
