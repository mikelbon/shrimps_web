package util;

import entities.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BD {

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://" + Properties.DB_DEV_SHRIMPS_ENDPOINT + "/" + Properties.DB_DEV_SHRIMPS_BD, Properties.DB_DEV_SHRIMPS_USER, Properties.DB_DEV_SHRIMPS_PW);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        //BD app = new BD();
        List<Cliente> listCliente = new ArrayList<Cliente>();
        listCliente = BD.listarClientes();
        for (int i = 0; i < listCliente.size(); i++) {
            System.out.println(listCliente.get(i).getCodigo()+" - "+ listCliente.get(i).getRazon_social());
        }
    }

    //Listar clientes
    public static List<Cliente> listarClientes() {
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = BD.connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM cliente.cliente");

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getString("id"));
                cliente.setEstado_id(rs.getString("estado_id"));
                cliente.setFecha_creacion(rs.getString("fecha_creacion"));
                cliente.setTerminal_creador(rs.getString("terminal_creador"));
                cliente.setUsuario_modificador(rs.getString("usuario_modificador"));
                cliente.setFecha_modificacion(rs.getString("fecha_modificacion"));
                cliente.setTerminal_modificador(rs.getString("terminal_modificador"));
                cliente.setTransaccion(rs.getString("transaccion"));
                cliente.setCodigo(rs.getString("codigo"));
                cliente.setRazon_social(rs.getString("razon_social"));
                cliente.setNumero_identificacion(rs.getString("numero_identificacion"));
                cliente.setNivel_jerarquia(rs.getString("nivel_jerarquia"));
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaCliente;
    }


}
