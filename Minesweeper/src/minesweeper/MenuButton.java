package minesweeper;
import javax.swing.*;
import java.awt.*;

public class MenuButton extends JButton {
    private static final long serialVersionUID = -1L;
    private Dimension dimension;
    private Font font;
    private String type;


    public MenuButton(String type, int x, int y) {
        super(type);
        this.type = type;
        dimension = new Dimension(x, y);
        setPreferredSize(dimension);
        font = new Font(Font.DIALOG, Font.BOLD, 9);
        setFont(font);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
    }

    public MenuButton(String type) {
        super(type);
        this.type = type;
    }

    public MenuButton (ImageIcon image) {
        super(image);
        this.type = image.toString();
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
    }

    String getType() {
        return type;
    }
    private void setType(String type) {
        this.type = type;
    }
}