package com.herusantoso.mahasiswa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	@Id
	@Column
	private int idMahasiswa;

	@Column
	private String nama;

	@Column
	private String jurusan;

	@Column
	private String asalKampus;
	
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(int idMahasiswa, String nama, String jurusan, String asalKampus) {
		super();
		this.idMahasiswa = idMahasiswa;
		this.nama = nama;
		this.jurusan = jurusan;
		this.asalKampus = asalKampus;
	}
	
	public int getIdMahasiswa() {
		return idMahasiswa;
	}
	public void setIdMahasiswa(int idMahasiswa) {
		this.idMahasiswa = idMahasiswa;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getAsalKampus() {
		return asalKampus;
	}
	public void setAsalKampus(String asalKampus) {
		this.asalKampus = asalKampus;
	}
	
	

}
