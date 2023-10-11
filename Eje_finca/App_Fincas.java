import javax.swing.JOptionPane;

public class App_Fincas {
    static cls_registroFinca[] Finca = new cls_registroFinca[20];
    static int int_posiciones = 0;
    static boolean bln_sw = false;
    static int int_pos;

    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }

    private static void fnt_registrar(String nombre,String codigo ,String extension , String propietario , String direccion , String ubicacion ,String act_economica, float prom_produccion){
        Finca[int_posiciones]= new cls_registroFinca(nombre, codigo, extension, propietario, direccion, ubicacion, act_economica, prom_produccion);
        int_posiciones ++;
        JOptionPane.showMessageDialog(null , "Finca registrada con éxito");
    }

    private static void fnt_Actualizar(String codigo){
        for(int i = 0 ; i < int_posiciones ;i++){
            if(codigo.equals(Finca[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
            }   
        }
        if(bln_sw == false){
             JOptionPane.showMessageDialog(null , "Finca no encontrada \n" + " Registrela");
        }else{
            String nombre = JOptionPane.showInputDialog(null, "Nombre de la finca: ");
            String extension = JOptionPane.showInputDialog(null,  "Extension: ");
            String propietario = JOptionPane.showInputDialog(null, "Propietario : ");
            String direccion = JOptionPane.showInputDialog(null, "Dirección : ");
            String ubicacion = JOptionPane.showInputDialog(null, "ubicación : ");
            String act_economica = JOptionPane.showInputDialog(null, "Actividad económica : ");
            float prom_produccion = Float.parseFloat(JOptionPane.showInputDialog(null, "Promedio de producción : "));

            Finca[int_pos]= new cls_registroFinca(nombre, codigo, extension, propietario, direccion, ubicacion, act_economica, prom_produccion);
            int_pos ++;
            JOptionPane.showMessageDialog(null , "Datos actualizados con éxito");
        }
    }
    private static void fnt_buscar(String codigo){
        for(int i = 0 ; i < int_posiciones ;i++){
            if(codigo.equals(Finca[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
            }   
        }
        if(bln_sw == false){
             JOptionPane.showMessageDialog(null , "Finca no encontrada \n" + " Registrela");
        }else{
            JOptionPane.showMessageDialog(null, "Nombre de la finca: " + Finca[int_pos].getNombre() 
            + "\nExtensión d ela finca: " + Finca[int_pos].getExtension() 
            + "\nPropieario de la finca: " + Finca[int_pos].getPropietario()
            + "\nDireccion de la finca: " + Finca[int_pos].getDireccion()
            + "\nUbicación de la finca: " + Finca[int_pos].getUbicacion()
            + "\nActividad de la finca: " + Finca[int_pos].getAct_economica()
            + "\nProducción de la finca: " + Finca[int_pos].getProm_produccion());
        }
    }
    private static void fnt_selectorFinca(int opcionF){
        if(opcionF == 1){
            String nombre = JOptionPane.showInputDialog(null, "Nombre de la finca: ");
            String codigo = JOptionPane.showInputDialog(null, " Codigo de la finca: ");
            String extension = JOptionPane.showInputDialog(null,  "Extension: ");
            String propietario = JOptionPane.showInputDialog(null, "Propietario : ");
            String direccion = JOptionPane.showInputDialog(null, "Dirección : ");
            String ubicacion = JOptionPane.showInputDialog(null, "ubicación : ");
            String act_economica = JOptionPane.showInputDialog(null, "Actividad económica : ");
            float prom_produccion = Float.parseFloat(JOptionPane.showInputDialog(null, "Promedio de producción : "));

            fnt_registrar(nombre, codigo, extension, propietario, direccion, ubicacion, act_economica, prom_produccion);
    
        }
        if (opcionF == 2){
            String codigo = JOptionPane.showInputDialog(null, " Codigo de la finca: ");

            fnt_Actualizar(codigo);
        }

        if (opcionF == 3){
            String codigo = JOptionPane.showInputDialog(null, " Codigo de la finca: ");

            fnt_buscar(codigo);
        } 
        
        if (opcionF == 4){
            fnt_menuPrincipal(true);
        }
    }
    private static void fnt_menuFinca(boolean mb){
        while(mb == true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "\t--- MENÚ FINCA ---\n" 
            + "1. Registrar\n " 
            + "2. Actualizar\n" 
            + "3. Consultar\n" 
            + "4. Salir" ));
            fnt_selectorFinca(m);
        fnt_menuFinca(true);    
        }
    }
    private static void fnt_menuParcelacion(boolean mparc){
        while(mparc == true){
            int mpa = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU PARCELACION"));
        }
    }
    private static void fnt_selectorP(int opcionP){
        if (opcionP == 1){
            fnt_menuFinca(true); 
        }
        
        

    }
    private static void fnt_menuPrincipal(boolean mp){
        while (mp == true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null , "<<<MENU PRINCIPAL>>>\n" 
            + "1.Menú Finca\n" 
            + "2.Parcelación \n" 
            + "3.Reportes\n" 
            + "4.Salir"));
            fnt_selectorP(m);
        fnt_menuPrincipal(true);
        }
    }
}
