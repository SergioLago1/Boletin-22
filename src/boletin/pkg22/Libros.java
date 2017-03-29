/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg22;

import java.util.Objects;

/**
 *
 * @author slagogonzalez
 */
public class Libros {

    private String nomeLibro;
    private String autor;
    private Float precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, Float precio, int unidades) {
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }
 public String getNomeLibro() {
        return nomeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (!Objects.equals(this.nomeLibro, other.nomeLibro)) {
            return false;
        }
        return true;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro: "+ nomeLibro + ", Autor: " + autor + ", Precio: " + precio + ", Unidades:" + unidades ;
    }
}
