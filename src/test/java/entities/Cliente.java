package entities;

public class Cliente {
    private String id;
    private String estado_id;
    private String usuario_creador;
    private String fecha_creacion;
    private String terminal_creador;
    private String usuario_modificador;
    private String fecha_modificacion;
    private String terminal_modificador;
    private String transaccion;
    private String codigo;
    private String razon_social;
    private String numero_identificacion;
    private String nivel_jerarquia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(String estado_id) {
        this.estado_id = estado_id;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public void setUsuario_creador(String usuario_creador) {
        this.usuario_creador = usuario_creador;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getTerminal_creador() {
        return terminal_creador;
    }

    public void setTerminal_creador(String terminal_creador) {
        this.terminal_creador = terminal_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public void setUsuario_modificador(String usuario_modificador) {
        this.usuario_modificador = usuario_modificador;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getTerminal_modificador() {
        return terminal_modificador;
    }

    public void setTerminal_modificador(String terminal_modificador) {
        this.terminal_modificador = terminal_modificador;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getNivel_jerarquia() {
        return nivel_jerarquia;
    }

    public void setNivel_jerarquia(String nivel_jerarquia) {
        this.nivel_jerarquia = nivel_jerarquia;
    }
}
