
public class cls_parcelacion{
    String str_codigo ;
    String str_nombre;
    String str_actividad;
    String str_produccion;
    int int_stock;
    String str_cod_finca;


    public cls_parcelacion(String codigo , String nombre , String actividad , String produccion , int stock){
        
    this.str_codigo = codigo;
    this.str_nombre = nombre ;
    this.str_actividad = actividad ;
    this.str_produccion = produccion ;
    this.int_stock = stock ;
    }

// seters 

public void setNombre (String nombre ){this.str_nombre = nombre;}
public void setActividad (String actividad){this.str_actividad  = actividad ;}
public void setProduccion (String produccion){this.str_produccion = produccion;}
public void setStock (int stock){this.int_stock = stock;}

//geters 
public  String getCodigo () {return this.str_codigo ;}
public String getNombre (){return this.str_nombre;}
public String getActividad(){return this.str_actividad;}
public String getProduccion (){return this.str_produccion;}
public int getStock () { return this.int_stock ;}

}


