package com.fpt.bai6.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.bai6.repository.HocVienRepository;

@Service
public class HocVienService {
	@Autowired
    private HocVienRepository hocVienRepository;

	public List<Map<String, Object>> getAllHocVien() {
        return hocVienRepository.findHocVien();
    }
}
