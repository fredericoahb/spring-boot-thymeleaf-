package com.fredericoahb.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.fredericoahb.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}