import javax.swing.JOptionPane;

public class App_Fincas {
    static cls_registroFinca[] Finca = new cls_registroFinca[10];
    static cls_parcelacion [] parcela = new cls_parcelacion[10];
    static int int_posiciones = 0;
    static int int_posiciones2 = 0;
    static boolean bln_sw = false;
    static boolean bln_st = false;
    static int int_pos;
    static int int_pos2;

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
            + "\nExtensión de la finca: " + Finca[int_pos].getExtension() 
            + "\nPropietario de la finca: " + Finca[int_pos].getPropietario()
            + "\nDirección de la finca: " + Finca[int_pos].getDireccion()
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
            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "\t<<< MENÚ FINCA >>>\n" 
            + "1. Registrar\n " 
            + "2. Actualizar\n" 
            + "3. Consultar\n" 
            + "4. Salir" ));
            fnt_selectorFinca(m);
        fnt_menuFinca(true);    
        }
    }

    private static void fnt_registrarParcela(String cod_finca){
        for (int i = 0; i < int_posiciones; i++){
            if (cod_finca.equals(Finca[i].getCodigo())){
                bln_st = true;
                int_pos2 = i;
            }
        }
        
        if (bln_st == false){
            JOptionPane.showMessageDialog(null, "Registre finca primero.");
            fnt_menuPrincipal(true);
        } else {
            String codigo = JOptionPane.showInputDialog(null, "Ingrese código: ");
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
            String actividad = JOptionPane.showInputDialog(null, "Ingrese actividad: ");
            String produccion = JOptionPane.showInputDialog(null, "Ingrese producción: ");
            int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese stock: "));
            
            parcela[int_posiciones2] = new cls_parcelacion(codigo, nombre, actividad, produccion, stock);
            int_posiciones2 ++;
            JOptionPane.showMessageDialog(null, "Parcela registrada exitosamente.");
        }   
    }

    private static void fnt_actualizarParcelacion(String codigo){
        for (int i = 0; i < int_posiciones; i++){
            if (codigo.equals(parcela[i].getCodigo())){
                bln_st = true;
                int_pos2 = i;
            }
        }
        
        if (bln_st == false){
            JOptionPane.showMessageDialog(null, "Registre parcela primero.");
        } else {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
            String actividad = JOptionPane.showInputDialog(null, "Ingrese actividad: ");
            String produccion = JOptionPane.showInputDialog(null, "Ingrese producción: ");
            int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese stock: "));
            
            parcela[int_posiciones2] = new cls_parcelacion(codigo, nombre, actividad, produccion, stock);
            int_posiciones2 ++;
            JOptionPane.showMessageDialog(null, "Parcela actualizada exitosamente.");
        }
    }

    private static void fnt_consultarParcelacion(String codigo){
        for (int i = 0; i < int_posiciones; i++){
            if (codigo.equals(parcela[i].getCodigo())){
                bln_st = true;
                int_pos2 = i;
            }
        }
        
        if (bln_st == false){
            JOptionPane.showMessageDialog(null, "Registre parcela primero.");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de la parcela: " + parcela[int_pos2].getNombre() 
            + "\nActividad de la parcela: " + parcela[int_pos2].getActividad() 
            + "\nProducción de la parcela: " + parcela[int_pos2].getProduccion()
            + "\nStock de la parcela: " + parcela[int_pos2].getStock());
        }
    }

    private static void fnt_selector3(int opcionParce){
        if (opcionParce == 1){
            String cod_finca = JOptionPane.showInputDialog(null, "Ingrese el código de la finca: ");

            fnt_registrarParcela(cod_finca);
        }
        if (opcionParce == 2){
            String codigo = JOptionPane.showInputDialog(null, "Ingrese código: ");

            fnt_actualizarParcelacion(codigo);
        }
        if (opcionParce == 3){
             String codigo = JOptionPane.showInputDialog(null, "Ingrese código: ");

            fnt_consultarParcelacion(codigo);
        }
        if (opcionParce == 4){
            fnt_menuPrincipal(true);
        }
    }

    private static void fnt_menuParcelacion(boolean mparc){
        while(mparc == true){
            int mpa = Integer.parseInt(JOptionPane.showInputDialog(null, "\t<<< MENU PARCELACION >>>"
            + "\n1. Registrar"
            + "\n2. Actualizar"
            + "\n3. Consultar"
            + "\n4. Salir"));
            fnt_selector3(mpa);
        fnt_menuParcelacion(true);
        }
    }

    private static void fnt_reporte(){
        for (int i = 0; i < int_posiciones; i++){
            for (int j = 0; j < int_posiciones2; j++){
                if (Finca[i].equals("") || parcela[j].equals("")){
                    JOptionPane.showMessageDialog(null, "Debe registrar una finca primero");
                } else {
                    JOptionPane.showMessageDialog(null, "\t<<< REPORTE >>> \n" 
                    + "\n\t<<< FINCA >>>\n"
                    + "\nNombre de la finca: " + Finca[i].getNombre()
                    + "\nCódigo finca: " + Finca[i].getCodigo()
                    + "\nExtensión de la finca: " + Finca[i].getExtension() 
                    + "\nPropietario de la finca: " + Finca[i].getPropietario()
                    + "\nDirección de la finca: " + Finca[i].getDireccion()
                    + "\nUbicación de la finca: " + Finca[i].getUbicacion()
                    + "\nActividad de la finca: " + Finca[i].getAct_economica()
                    + "\nProducción de la finca: " + Finca[i].getProm_produccion()
                    + "---------------------------------------\n"
                    + "\n\t<<<PARCELAS >>>"
                    + "\nCódigo de la parcela: " + parcela[j].getCodigo()
                    + "\nNombre de la parcela: " + parcela[j].getNombre() 
                    + "\nActividad de la parcela: " + parcela[j].getActividad() 
                    + "\nProducción de la parcela: " + parcela[j].getProduccion()
                    + "\nStock de la parcela: " + parcela[j].getStock()
                    );
                }
            }
        }
        
    }

    private static void fnt_selectorP(int opcionP){
        if (opcionP == 1){
            fnt_menuFinca(true); 
        }
        if (opcionP == 2){
            fnt_menuParcelacion(true);
        }
        if (opcionP == 3){
            fnt_reporte();
        }
        if (opcionP == 4){
            System.exit(0);
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
