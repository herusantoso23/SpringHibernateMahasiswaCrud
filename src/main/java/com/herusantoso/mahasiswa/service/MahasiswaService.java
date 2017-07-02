package com.herusantoso.mahasiswa.service;

import java.util.List;

import com.herusantoso.mahasiswa.model.Mahasiswa;

public interface MahasiswaService {
	public void insert(Mahasiswa mahasiswa);
	public void update(Mahasiswa mahasiswa);
	public void delete(int idMahasiswa);
	public Mahasiswa getMahasiswa(int idMahasiswa);
	public List<Mahasiswa> getAllMahasiswa();
}
