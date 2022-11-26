package traslados.controlador;

package logistica.controlador;

import java.util.logging.Logger;

/*
*/
public class clsProductos {
    private int prod_codigo;
    private String prod_nombre;
    private int lin_codigo;
    private int mar_codigo;
    private String prod_descripcion;
    private int id_proveedor;

    public clsProductos(int prod_codigo, String prod_nombre, int lin_codigo, int mar_codigo, String prod_descripcion, int id_proveedor) {
        this.prod_codigo = prod_codigo;
        this.prod_nombre = prod_nombre;
        this.lin_codigo = lin_codigo;
        this.mar_codigo = mar_codigo;
        this.prod_descripcion = prod_descripcion;
        this.id_proveedor = id_proveedor;
    }
    
    private static final Logger LOG = Logger.getLogger(clsProductos.class.getName());

    public int getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(int prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public int getLin_codigo() {
        return lin_codigo;
    }

    public void setLin_codigo(int lin_codigo) {
        this.lin_codigo = lin_codigo;
    }

    public int getMar_codigo() {
        return mar_codigo;
    }

    public void setMar_codigo(int mar_codigo) {
        this.mar_codigo = mar_codigo;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
}