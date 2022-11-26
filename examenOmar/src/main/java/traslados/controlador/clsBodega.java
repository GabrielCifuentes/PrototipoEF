/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslados.controlador;

import java.util.logging.Logger;



/**
 *
 * @author carlos
 */

/*
    
*/
public class clsBodega {
    int id_bodega;
    String nombre_bodega;
    String direccion_bodega;
    String tipo_bodega;
    String estatus_bodega;
    int id_empresa;

    public clsBodega(int id_bodega, String nombre_bodega, String direccion_bodega, String tipo_bodega, String estatus_bodega, int id_empresa) {
        this.id_bodega = id_bodega;
        this.nombre_bodega = nombre_bodega;
        this.direccion_bodega = direccion_bodega;
        this.tipo_bodega = tipo_bodega;
        this.estatus_bodega = estatus_bodega;
        this.id_empresa = id_empresa;
    }
    public clsBodega(){}

        public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getNombre_bodega() {
        return nombre_bodega;
    }

    public void setNombre_bodega(String nombre_bodega) {
        this.nombre_bodega = nombre_bodega;
    }

    public String getDireccion_bodega() {
        return direccion_bodega;
    }

    public void setDireccion_bodega(String direccion_bodega) {
        this.direccion_bodega = direccion_bodega;
    }

    public String getTipo_bodega() {
        return tipo_bodega;
    }

    public void setTipo_bodega(String tipo_bodega) {
        this.tipo_bodega = tipo_bodega;
    }

    public String getEstatus_bodega() {
        return estatus_bodega;
    }

    public void setEstatus_bodega(String estatus_bodega) {
        this.estatus_bodega = estatus_bodega;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

   
    @Override
    public String toString() {
        return "tbl_bodega{" + "id_bodega=" + id_bodega + ", nombre_bodega=" + nombre_bodega + ", direccion_bodega=" + direccion_bodega + ", tipo_bodega=" + tipo_bodega + ", estatus_bodega=" + estatus_bodega  + "id_empresa=" + id_empresa +'}';
    }
    
}
