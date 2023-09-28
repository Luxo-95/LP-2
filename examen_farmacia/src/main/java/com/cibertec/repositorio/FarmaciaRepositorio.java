package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Farmacia;

public interface FarmaciaRepositorio extends JpaRepository<Farmacia, Integer> {

}