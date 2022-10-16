/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticarConflictoAlHacerMerge.entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Facundo
 */
public class Gato {

    private String nombre;
    private String apellido;
    private String duenho;
    private String raza;
    private boolean castrado;
    private Date fechaNacimiento;

    public Gato() {
    }

    public Gato(String nombre, String apellido, String duenho, String raza, boolean castrado, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.duenho = duenho;
        this.raza = raza;
        this.castrado = castrado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDuenho() {
        return duenho;
    }

    public void setDuenho(String duenho) {
        this.duenho = duenho;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellido);
        hash = 41 * hash + Objects.hashCode(this.duenho);
        hash = 41 * hash + Objects.hashCode(this.raza);
        hash = 41 * hash + (this.castrado ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.fechaNacimiento);
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
        final Gato other = (Gato) obj;
        if (this.castrado != other.castrado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.duenho, other.duenho)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", apellido=" + apellido + ", duenho=" + duenho + ", raza=" + raza + ", castrado=" + castrado + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
