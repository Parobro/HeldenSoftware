/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO;

import helden.gui.O0OO.D.o0OO;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.erschaffung.dialoge.JTabbedPaneWithVisible;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class A
extends JDialog {
    protected O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;
    private JTabbedPaneWithVisible new;

    public A(helden.gui.A a2) {
        super((Frame)a2, false);
    }

    public void \u00d200000() {
        this.new = new JTabbedPaneWithVisible();
        this.new.setTabPlacement(2);
        this.setSize(1000, 550);
        this.getContentPane().setLayout(new BorderLayout());
        this.Object();
        this.getContentPane().add((Component)this.new, "Center");
        JButton jButton = new JButton("Save");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (A.this.o00000()) {
                        A.this.setVisible(false);
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        this.getContentPane().add((Component)jButton, "South");
        this.setLocationRelativeTo(null);
    }

    public abstract boolean o00000();

    protected abstract void Object();

    protected void o00000(o0OO o0OO2) {
        this.new.addTab(o0OO2.Object(), o0OO2.o00000());
    }
}

