/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author josmarl
 */
public class DatosPersonales implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private String idPersonal;
    private String nombre;
    private String apepat;
    private String apemat;
    private String sexo;
    private Timestamp nacfec;
    private String fono1;
    private String fono2;

    public DatosPersonales() {
    }

    public DatosPersonales(String idPersonal, String nombre, String apepat, String apemat, String sexo, Timestamp nacfec, String fono1, String fono2) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
        this.sexo = sexo;
        this.nacfec = nacfec;
        this.fono1 = fono1;
        this.fono2 = fono2;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Timestamp getNacfec() {
        return nacfec;
    }

    public void setNacfec(Timestamp nacfec) {
        this.nacfec = nacfec;
    }

    public String getFono1() {
        return fono1;
    }

    public void setFono1(String fono1) {
        this.fono1 = fono1;
    }

    public String getFono2() {
        return fono2;
    }

    public void setFono2(String fono2) {
        this.fono2 = fono2;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" + "idPersonal=" + idPersonal + ", nombre=" + nombre + ", apepat=" + apepat + ", apemat=" + apemat + ", sexo=" + sexo + ", nacfec=" + nacfec + ", fono1=" + fono1 + ", fono2=" + fono2 + '}';
    }

}
