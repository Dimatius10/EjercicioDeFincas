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
    
    //Getter
    public String getNombre(){return this.str_nombre;}
    public String getCodigo(){return this.str_codigo;}
    public String getExtension(){return this.str_extension;}
    public String getPropietario(){return this.str_propietario;}
    public String getDireccion(){return this.str_direccion;}
    public String getUbicacion(){return this.str_ubicacion;}
    public String getAct_economica(){return this.str_act_economica;}
    public float getProm_produccion(){return this.flt_prom_produccion;}

    //Setter
    public void setNombre (String nombre){this.str_nombre = nombre;}
    public void setExtension (String extension){this.str_extension = extension;}
    public void setPropietario (String propietario){this.str_propietario = propietario;}
    public void setDireccion (String direccion){this.str_direccion = direccion;}
    public void setUbicacion (String ubicacion){this.str_ubicacion = ubicacion;}
    public void setAct_economica (String act_economica){this.str_act_economica = act_economica;}
    public void setProm_produccion (float prom_produccion){this.flt_prom_produccion = prom_produccion;}
}