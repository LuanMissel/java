package br.com.luanmissel.sistemabancario.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;

@RestController
@RequestMapping("v1/depositar")
@RequiredArgsConstructor
public class SistemaBancarioController {
    private final SistemaBancarioController sistemaBancarioController;

    @PostMapping("/")
    public SistemaBancarioController depositar(@RequestBody SistemaBancarioController sistemaBancarioController) {
        return sistemaBancarioController.depositar(sistemaBancarioController);

    }
}