package br.com.wswork.gabuflix2.controller

import br.com.wswork.gabuflix2.entity.Emprise
import br.com.wswork.gabuflix2.service.EmpriseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/emprise")
@RestController
class EmpriseController{
    @Autowired
    lateinit var service: EmpriseService


    @GetMapping("/get")
    fun findAll():ResponseEntity<List<Emprise>>{
        val serviceGetAll = service.getAll()
        val ok = HttpStatus.OK
        return ResponseEntity(serviceGetAll, ok)
    }

    @GetMapping("/get/id")
    fun get(emprise: Long): ResponseEntity<Emprise> {
        val serviceGetEmpriseId = service.findEmpriseId(id = emprise)
        val ok = HttpStatus.OK
        return ResponseEntity(serviceGetEmpriseId, ok)
}
    }
