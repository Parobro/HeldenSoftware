/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class JTextFieldWithMenu
extends JTextField
implements ActionListener {
    private final JPopupMenu \u00f400000 = new JPopupMenu();
    private JMenuItem \u00d600000 = new JMenuItem("Cut");
    private JMenuItem \u00d500000 = new JMenuItem("Copy");
    private JMenuItem void = new JMenuItem("Paste");

    public JTextFieldWithMenu() {
        this.\u00d200000();
    }

    public JTextFieldWithMenu(String string) {
        this();
        this.setText(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JTextField jTextField;
        Object object = actionEvent.getSource();
        if (object == this.\u00d600000) {
            jTextField = (JTextField)this.\u00f400000.getInvoker();
            jTextField.cut();
        }
        if (object == this.\u00d500000) {
            jTextField = (JTextField)this.\u00f400000.getInvoker();
            jTextField.copy();
        }
        if (object == this.void) {
            jTextField = (JTextField)this.\u00f400000.getInvoker();
            jTextField.paste();
        }
    }

    private void \u00d200000() {
        this.\u00d600000.addActionListener(this);
        this.\u00d500000.addActionListener(this);
        this.void.addActionListener(this);
        this.\u00d500000.setAccelerator(KeyStroke.getKeyStroke(67, 2));
        this.void.setAccelerator(KeyStroke.getKeyStroke(86, 2));
        this.\u00d600000.setAccelerator(KeyStroke.getKeyStroke(88, 2));
        this.\u00f400000.add(this.\u00d600000);
        this.\u00f400000.add(this.\u00d500000);
        this.\u00f400000.add(this.void);
        this.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                switch (mouseEvent.getModifiers()) {
                    case 4: {
                        JTextFieldWithMenu.this.\u00f400000.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
                        break;
                    }
                }
            }
        });
    }
}

