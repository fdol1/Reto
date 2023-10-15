package com.test.model;

public class RegistroUsuarioModel {

    private String nombre1;
    private String nombre2;
    private String email;
    private String edad;
    private String salario;
    private String departamento;

    public RegistroUsuarioModel(String nombre1, String nombre2, String email, String edad, String salario, String departamento) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.email = email;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}