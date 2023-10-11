public class cls_registroFinca {
    private String str_nombre;
    private String str_codigo;
    private String str_extension;
    private String str_propietario;
    private String str_direccion;
    private String str_ubicacion;
    private String str_act_economica;
    private float flt_prom_produccion;

    public cls_registroFinca(String nombre, String codigo, String extension, String propietario, String direccion, String ubicacion, String act_economica, float prom_produccion){
        this.str_nombre = nombre;
        this.str_codigo = codigo;
        this.str_extension = extension;
        this.str_propietario = propietario;
        this.str_direccion = direccion;
        this.str_ubicacion = ubicacion;
        this.str_act_economica = act_economica;
        this.flt_prom_produccion = prom_produccion;
    }
    
}