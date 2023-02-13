package com.slokam.da.hc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.entity.Visiting;

@Repository
public interface DiseaseDAO extends JpaRepository<Disease, Integer> {
	public abstract Disease findByName(String name);
}

