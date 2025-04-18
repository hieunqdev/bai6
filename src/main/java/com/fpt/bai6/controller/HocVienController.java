package com.fpt.bai6.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.bai6.model.KhoaHoc;
import com.fpt.bai6.service.HocVienService;

@RestController
@RequestMapping("/api/hoc-vien")
public class HocVienController {
	@Autowired
    private HocVienService hocVienService;
	
	@GetMapping("all")
    public List<Map<String, Object>> getAllHocVien() {
        return hocVienService.getAllHocVien();
    }	
}
