package com.herusantoso.mahasiswa.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.herusantoso.mahasiswa.dao.MahasiswaDao;
import com.herusantoso.mahasiswa.model.Mahasiswa;

@Repository
public class MahasiswaDaoImpl implements MahasiswaDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void insert(Mahasiswa mahasiswa) {
		session.getCurrentSession().save(mahasiswa);
	}

	@Override
	public void update(Mahasiswa mahasiswa) {
		session.getCurrentSession().update(mahasiswa);
		
	}

	@Override
	public void delete(int idMahasiswa) {
		session.getCurrentSession().delete(getMahasiswa(idMahasiswa));
	}

	@Override
	public Mahasiswa getMahasiswa(int idMahasiswa) {
		return (Mahasiswa)session.getCurrentSession().get(Mahasiswa.class, idMahasiswa);
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		return session.getCurrentSession().createQuery("from Mahasiswa").list();
	}

}
