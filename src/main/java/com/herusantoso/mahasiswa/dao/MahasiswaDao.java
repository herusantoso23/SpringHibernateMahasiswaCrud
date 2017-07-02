package com.herusantoso.mahasiswa.dao;

import java.util.List;

import com.herusantoso.mahasiswa.model.Mahasiswa;

public interface MahasiswaDao {
	public void insert(Mahasiswa mahasiswa);
	public void update(Mahasiswa mahasiswa);
	public void delete(int idMahasiswa);
	public Mahasiswa getMahasiswa(int idMahasiswa);
	public List<Mahasiswa> getAllMahasiswa();

}
