/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslados.Modelo;

import seguridad.modelo.clsConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import traslados.controlador.clsBodega;

/**
 *
 * @author visitante
 */
public class daoBodega {

    private static final String SQL_SELECT = "SELECT id_bodega, nombre_bodega, direccion_bodega, tipo_bodega, estatus_bodega, id_empresa  FROM tbl_bodega";
    private static final String SQL_INSERT = "INSERT INTO tbl_bodega(nombre_bodega, direccion_bodega,tipo_bodega, estatus_bodega, id_empresa ) VALUES(?, ?, ? ,? ,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_bodega SET nombre_bodega=?, direccion_bodega=?, tipo_bodega=?, estatus_bodega=? , id_empresa=? WHERE id_bodega = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_bodega WHERE id_bodega=?";
    private static final String SQL_QUERY = "SELECT id_bodega, nombre_bodega, direccion_bodega, tipo_bodega,estatus_bodega, id_empresa  FROM tbl_bodegas WHERE id_bodega = ?";

    public List<clsBodega> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsBodega bodega = null;
        List<clsBodega> bodegas = new ArrayList<clsBodega>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_bodega = rs.getInt("id_bodega");
                String nombre_bodega = rs.getString("nombre_bodega");
                String direccion_bodega = rs.getString("direccion_bodega");
                String tipo_bodega = rs.getString("tipo_bodega");
                String estatus_bodega = rs.getString("estatus_bodega");
                 int id_empresa = rs.getInt("id_empresa");
                
                bodega = new clsBodega();
                bodega.setId_bodega(id_bodega);
                bodega.setNombre_bodega(nombre_bodega);
                bodega.setDireccion_bodega(direccion_bodega);
                bodega.setTipo_bodega(tipo_bodega);
                bodega.setEstatus_bodega(estatus_bodega);
                bodega.setId_empresa(id_empresa);
                
                bodegas.add(bodega);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return bodegas;
    }

    public int insert(clsBodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, bodega.getNombre_bodega());
            stmt.setString(2, bodega.getDireccion_bodega());
            stmt.setString(3, bodega.getTipo_bodega());
            stmt.setString(4, bodega.getEstatus_bodega());
            stmt.setInt(5, bodega.getId_empresa());


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int update(clsBodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
                      
            stmt.setString(1, bodega.getNombre_bodega());
            stmt.setString(2, bodega.getDireccion_bodega());
            stmt.setString(3, bodega.getTipo_bodega());
            stmt.setString(4, bodega.getEstatus_bodega());
            stmt.setInt(5, bodega.getId_empresa());
            
            
            
            
            

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsBodega bodega) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, bodega.getId_bodega());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public clsBodega query(clsBodega bodega) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsBodega> bodegas = new ArrayList<clsBodega>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, bodega.getId_bodega());
            rs = stmt.executeQuery();
            while (rs.next()) {
                 int id_bodega = rs.getInt("id_bodega");
                String nombre_bodega = rs.getString("nombre_bodega");
                String direccion_bodega = rs.getString("direccion_bodega");
                String tipo_bodega = rs.getString("tipo_bodega");
                String estatus_bodega = rs.getString("estatus_bodega");
                 int id_empresa = rs.getInt("id_empresa");
                
                
                bodega = new clsBodega();
                bodega.setId_bodega(id_bodega);
                bodega.setNombre_bodega(nombre_bodega);
                bodega.setDireccion_bodega(direccion_bodega);
                bodega.setTipo_bodega(tipo_bodega);
                bodega.setEstatus_bodega(estatus_bodega);
                bodega.setId_empresa(id_empresa);
                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return bodega;
    }
        
}
