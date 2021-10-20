package com.karem.fichiers.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karem.fichiers.entities.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
