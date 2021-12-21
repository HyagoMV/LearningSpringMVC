package com.github.hyagomv.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioEntityRepository extends JpaRepository<FuncionarioEntity, Long> {

}
