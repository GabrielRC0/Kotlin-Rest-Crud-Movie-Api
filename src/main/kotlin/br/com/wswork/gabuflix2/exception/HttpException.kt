package br.com.wswork.gabuflix2.exception

import org.springframework.http.HttpStatus

abstract class HttpException(val status: HttpStatus, message: String) : Exception(message)