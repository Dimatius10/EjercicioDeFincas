import javax.swing.JOptionPane;

public class App_fincas {
    static cls_registroFinca[] Finca = new cls_registroFinca[20];
    static int int_posiciones = 0;
    static boolean bln_sw;
    static int int_pos;

    public static void main(String[] args) {
        
    }
    
    private static void fnt_menuPrincipal(boolean mp){
        while (mp == true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null , "<<<MENU PRINCIPAL>>>\n" 
            + "1.Registro Finca\n" 
            + "2.Parcelación \n" 
            + "3.Reportes\n" 
            + "4.Salir"));
        }
    }
}
