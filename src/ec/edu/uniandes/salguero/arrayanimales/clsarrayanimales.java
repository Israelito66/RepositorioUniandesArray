/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.salguero.arrayanimales;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class clsarrayanimales {

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date Fechapereamiento() {
        return _fechapereamiento;
    }

    public void Fechapereamiento(Date _fechapereamiento) {
        this._fechapereamiento = _fechapereamiento;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public especie Especie() {
        return _especie;
    }

    public void Especie(especie _especie) {
        this._especie = _especie;
    }

    public enum especie{vertebrados, invertebrados, oviparos, mamiferos}
    
    private int _id;
    private String _nombre;
    private Date _fechapereamiento;
    private float _peso;
    private especie _especie;

    public clsarrayanimales(int _id, String _nombre, Date _fechapereamiento, float _peso, especie _especie) {
        this._id = _id;
        this._nombre = _nombre;
        this._fechapereamiento = _fechapereamiento;
        this._peso = _peso;
        this._especie = _especie;
    }

   
    
}
