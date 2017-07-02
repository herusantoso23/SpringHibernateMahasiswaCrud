package com.herusantoso.mahasiswa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.herusantoso.mahasiswa.model.Mahasiswa;
import com.herusantoso.mahasiswa.service.MahasiswaService;

@Controller
public class MahasiswaController {
	@Autowired
	private MahasiswaService mahasiswaService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Mahasiswa mahasiswa = new Mahasiswa();
		map.put("mahasiswa", mahasiswa);
		map.put("mahasiswaList", mahasiswaService.getAllMahasiswa());
		return "mahasiswa";
	}
	
	@RequestMapping(value="/mahasiswa.do", method=RequestMethod.POST)
	public String doActions(
			@ModelAttribute Mahasiswa mahasiswa, 
			BindingResult result,
			@RequestParam String action,
			Map<String, Object> map){
		
		Mahasiswa mahasiswaResult = new Mahasiswa();
		switch (action.toLowerCase()) {
		case "add":
			mahasiswaService.insert(mahasiswa);
			mahasiswaResult = mahasiswa;
			break;
		case "edit":
			mahasiswaService.update(mahasiswa);
			mahasiswaResult = mahasiswa;
			break;
		case "delete":
			mahasiswaService.delete(mahasiswa.getIdMahasiswa());
			mahasiswaResult = mahasiswa;
			break;
		case "Search":
			Mahasiswa searchedMahasiswa = mahasiswaService.getMahasiswa(mahasiswa.getIdMahasiswa());
			
			mahasiswaResult = searchedMahasiswa!= null? searchedMahasiswa : new Mahasiswa();
			break;
		}
		
		map.put("mahasiwa", mahasiswaResult);
		map.put("mahasiswaList", mahasiswaService.getAllMahasiswa());

		return "mahasiswa";
		
	}	
	
}
