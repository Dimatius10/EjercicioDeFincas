import javax.swing.JOptionPane;

public class App_Fincas {
    static cls_registroFinca[] Finca = new cls_registroFinca[20];
    static int int_posiciones = 0;
    static boolean bln_sw;
    static int int_pos;

    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }
    private static void fnt_selectorP(int opcionP){
        if (opcionP == 1){
            String nombre = JOptionPane.showInputDialog(null, "Nombre de la finca: ");
            String codigo = JOptionPane.showInputDialog(null, " Codigo de la finca: ");
            String extension = JOptionPane.showInputDialog(null,  "Extension: ");
            String
        }
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
