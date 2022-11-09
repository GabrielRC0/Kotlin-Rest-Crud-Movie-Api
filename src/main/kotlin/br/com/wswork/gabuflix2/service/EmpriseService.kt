package br.com.wswork.gabuflix2.service

import br.com.wswork.gabuflix2.dto.EmpriseDTO
import br.com.wswork.gabuflix2.entity.Emprise
import br.com.wswork.gabuflix2.repository.EmpriseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion

@Service
class EmpriseService {

    @Autowired
    lateinit var repository: EmpriseRepository

    fun getAll(): List<Emprise> {
        val empriseList = repository.findAll()
        return empriseList
        //return repository.findAll()
    }

    fun verifyOne(id: Long) {
        val wasFound = repository.existsById(id)

        if (!wasFound) {
            throw NotFoundException()
        }

    }
    fun findEmpriseId(id: Long): Emprise {
        return repository.findById(id).orElseThrow{NotFoundException()}
    }

    fun findAllById(ids: List<Long>): List<Emprise> {
        val empriseList = repository.findAllById(ids)
        val idsFound = empriseList.map { it.id }

        ids.forEach {
            val wasFound = idsFound.contains(it)

            if (!wasFound) {
                throw NotFoundException()
            }
        }
        return empriseList
    }
}
