package U8_interfaces_gráficas.GestionDeEquipos;

import javax.swing.*;
import java.awt.*;

public class PanelEquipos extends JPanel {
    public PanelEquipos() {
        setLayout(new GridLayout(0, 2));
        String[] labels = new String[] {"País al que pertenece la competición:", "Nombre de la competición:", "Entrenador del equipo:"};

        for (String textoLabel : labels) {
            JLabel newLabel = new JLabel(textoLabel);
            add(newLabel);
            JTextField newField = new JTextField();
            add(newField);
        }
    }
}
