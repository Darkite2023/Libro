/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Polako
 */
public class Libro {
    
    private String libro;
    private String autor;
    private String stock;
    private String alquilado;

    public Libro() {
    }

    public Libro(String libro, String autor, String stock, String alquilado) {
        this.libro = libro;
        this.autor = autor;
        this.stock = stock;
        this.alquilado = alquilado;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(String alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.libro);
        hash = 13 * hash + Objects.hashCode(this.autor);
        hash = 13 * hash + Objects.hashCode(this.stock);
        hash = 13 * hash + Objects.hashCode(this.alquilado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.libro, other.libro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        return Objects.equals(this.alquilado, other.alquilado);
    }

    @Override
    public String toString() {
        return "Libro{" + "libro=" + libro + ", autor=" + autor + ", stock=" + stock + ", alquilado=" + alquilado + '}';
    }
    
    
 
    
    
}
