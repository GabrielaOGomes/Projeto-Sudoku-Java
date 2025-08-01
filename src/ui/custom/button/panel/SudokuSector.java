package ui.custom.button.panel;

import ui.custom.button.input.NumberText;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static java.awt.Color.black;

public class SudokuSector extends JPanel {

    public SudokuSector(final List<NumberText> textFields) {
        var dimension = new Dimension(170, 170);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);
    }


}
