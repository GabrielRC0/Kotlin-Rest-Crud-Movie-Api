package br.com.wswork.gabuflix2.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "emprise")
class Emprise {
    @Id
    @Column(name = "id")
    val id: Long = -1
    @Column(name = "emprise")
    val emprise: String = ""
}