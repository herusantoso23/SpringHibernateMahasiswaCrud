package com.herusantoso.mahasiswa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herusantoso.mahasiswa.dao.MahasiswaDao;
import com.herusantoso.mahasiswa.model.Mahasiswa;
import com.herusantoso.mahasiswa.service.MahasiswaService;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

	@Autowired
	private MahasiswaDao mahasiswaDAo;
		
	@Transactional
	public void insert(Mahasiswa mahasiswa) {
		mahasiswaDAo.insert(mahasiswa);

	}

	@Transactional
	public void update(Mahasiswa mahasiswa) {
		mahasiswaDAo.update(mahasiswa);

	}

	@Transactional
	public void delete(int idMahasiswa) {
		mahasiswaDAo.delete(idMahasiswa);
	}

	@Transactional
	public Mahasiswa getMahasiswa(int idMahasiswa) {
		return mahasiswaDAo.getMahasiswa(idMahasiswa);
	}

	@Transactional
	public List<Mahasiswa> getAllMahasiswa() {
		return mahasiswaDAo.getAllMahasiswa();
	}

}
