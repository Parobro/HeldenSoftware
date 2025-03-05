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
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class JTextAreaWithMenu
extends JTextArea
implements ActionListener {
    private final JPopupMenu \u00d400000 = new JPopupMenu();
    private JMenuItem \u00d200000 = new JMenuItem("Cut");
    private JMenuItem o00000 = new JMenuItem("Copy");
    private JMenuItem Object = new JMenuItem("Paste");

    public JTextAreaWithMenu() {
        this.o00000();
    }

    public JTextAreaWithMenu(int n, int n2) {
        super(n, n2);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JTextArea jTextArea;
        Object object = actionEvent.getSource();
        if (object == this.\u00d200000) {
            jTextArea = (JTextArea)this.\u00d400000.getInvoker();
            jTextArea.cut();
        }
        if (object == this.o00000) {
            jTextArea = (JTextArea)this.\u00d400000.getInvoker();
            jTextArea.copy();
        }
        if (object == this.Object) {
            jTextArea = (JTextArea)this.\u00d400000.getInvoker();
            jTextArea.paste();
        }
    }

    private void o00000() {
        this.\u00d200000.addActionListener(this);
        this.o00000.addActionListener(this);
        this.Object.addActionListener(this);
        this.o00000.setAccelerator(KeyStroke.getKeyStroke(67, 2));
        this.Object.setAccelerator(KeyStroke.getKeyStroke(86, 2));
        this.\u00d200000.setAccelerator(KeyStroke.getKeyStroke(88, 2));
        this.\u00d400000.add(this.\u00d200000);
        this.\u00d400000.add(this.o00000);
        this.\u00d400000.add(this.Object);
        this.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                switch (mouseEvent.getModifiers()) {
                    case 4: {
                        JTextAreaWithMenu.this.\u00d400000.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
                        break;
                    }
                }
            }
        });
    }
}

