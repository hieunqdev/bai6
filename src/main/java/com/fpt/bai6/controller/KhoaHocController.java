package com.fpt.bai6.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fpt.bai6.model.KhoaHoc;
import com.fpt.bai6.repository.KhoaHocRepository;
import com.fpt.bai6.service.HocVienService;
import com.fpt.bai6.service.KhoaHocService;

@RestController
@RequestMapping("/api/khoa-hoc")
public class KhoaHocController {
	@Autowired
	private KhoaHocService khoaHocService;

	@GetMapping("all")
	public List<KhoaHoc> findPageKhoaHoc(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {

		int offset = page * size;
		return khoaHocService.findPageKhoaHoc(page, size);
	}

	@PostMapping("create")
	public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
		if (khoaHoc.getTenKhoaHoc().isEmpty() || khoaHoc.getTenKhoaHoc() == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tên khóa học không được để trống");
		}
		if (khoaHoc.getMoTa() == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Mô tả không được để trống");
		}
		if (khoaHoc.getNgayBatDau() == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ngày bắt đầu không được để trống");
		}
		if (khoaHoc.getNgayKetThuc() == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ngày bắt đầu không được để trống");
		}
		khoaHocService.createKhoaHoc(khoaHoc);
		return khoaHoc;
	}
	
	@DeleteMapping("delete/{maKhoaHoc}")
	public String deleteKhoaHoc(@PathVariable int maKhoaHoc) {
	    khoaHocService.deleteKhoaHoc(maKhoaHoc);
	    return "Đã xóa";
	}


}
