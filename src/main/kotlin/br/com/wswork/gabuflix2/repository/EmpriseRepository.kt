package br.com.wswork.gabuflix2.repository

import br.com.wswork.gabuflix2.entity.Emprise
import org.springframework.data.jpa.repository.JpaRepository

interface EmpriseRepository:JpaRepository<Emprise, Long> {

}