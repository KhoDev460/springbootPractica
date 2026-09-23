package com.khoveen.practica.model;

public class Videojuego {
    // atributos
    private long id;
    private String titulo;
    private String genero;
    private int age;
    private double precio;

    // controlador de id
    private static long contadorId;

    // contructor
    public Videojuego(String titulo, String genero, double precio, int age) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.age = age;
        this.id = contadorId++;
    }

    // id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //edad
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //obtener id
    public static long getContadorId() {
        return contadorId;
    }
}
