package U8_interfaces_gráficas.Ejemplos_JFrame;

import javax.swing.JFrame;
import U08.Examples.A_JFrame.B_MarcoCentrado;

/**
 *
 * @author malbert
 */
public class Z_MisMarcos {

    public static void main(String[] args){
        // MiPrimerMarco
        //A_MiPrimerMarco mimarco=new A_MiPrimerMarco();

        // MarcoCentrado
        B_MarcoCentrado mimarco = new B_MarcoCentrado();

        //MarcoConTexto
        //MarcoConTexto mimarco = new MarcoConTexto();

        //MarcoConDibujos
        //D_MarcoConDibujos mimarco = new D_MarcoConDibujos();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }

}