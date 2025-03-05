/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.components.JTextAreaWithMenu;
import helden.gui.components.interfaces.TextFieldChangedSupport;
import helden.gui.super.OooO.O0OO.A;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class JTextAreaWithRangeCheckUMenu
extends JTextAreaWithMenu
implements TextFieldChangedSupport,
A {
    private boolean \u00d4O0000 = true;
    private int \u00d2O0000 = 1;
    private Font \u00d5O0000;
    private String public = "";
    private JPanel \u00d6O0000;

    public JTextAreaWithRangeCheckUMenu(int n, boolean bl) {
        this.\u00d2O0000 = n;
        this.\u00d4O0000 = bl;
        this.\u00d600000();
        this.\u00d500000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        super.actionPerformed(actionEvent);
        this.\u00d200000(this.istLaengeOK());
    }

    @Override
    public boolean istLaengeOK() {
        boolean bl;
        int n = 0;
        try {
            n = SwingUtilities.computeStringWidth(oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new().getFontMetrics(), this.getText());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        boolean bl2 = bl = n < this.\u00d2O0000;
        if (this.\u00d4O0000) {
            this.\u00d200000(bl);
        }
        return bl;
    }

    public void setBorderPanel(JPanel jPanel) {
        this.\u00d6O0000 = jPanel;
    }

    @Override
    public void setMaxLaenge(int n) {
        this.\u00d2O0000 = n;
    }

    @Override
    public void setText(String string) {
        this.public = string == null ? "" : string;
        super.setText(string);
        this.istLaengeOK();
    }

    @Override
    public void setTextOhneSave(String string) {
        super.setText(string);
    }

    @Override
    public void setVisible(boolean bl) {
        if (this.\u00d6O0000 != null) {
            this.\u00d6O0000.setVisible(bl);
        }
        super.setVisible(bl);
    }

    @Override
    public boolean wurdeTextfieldVeraendert() {
        return !this.public.equals(this.getText());
    }

    private void \u00d500000() {
        this.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent focusEvent) {
                JTextAreaWithRangeCheckUMenu.this.\u00d200000(JTextAreaWithRangeCheckUMenu.this.istLaengeOK());
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                JTextAreaWithRangeCheckUMenu.this.\u00d200000(JTextAreaWithRangeCheckUMenu.this.istLaengeOK());
            }
        });
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyPressed(KeyEvent keyEvent) {
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                JTextAreaWithRangeCheckUMenu.this.\u00d200000(JTextAreaWithRangeCheckUMenu.this.istLaengeOK());
            }

            @Override
            public void keyTyped(KeyEvent keyEvent) {
                JTextAreaWithRangeCheckUMenu.this.\u00d200000(JTextAreaWithRangeCheckUMenu.this.istLaengeOK());
            }
        });
        this.addPropertyChangeListener(new PropertyChangeListener(){

            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                JTextAreaWithRangeCheckUMenu.this.istLaengeOK();
            }
        });
    }

    private void \u00d600000() {
        this.\u00d5O0000 = G.new(9);
    }

    private void \u00d200000(boolean bl) {
        if (bl) {
            this.setBackground(Color.white);
        } else {
            this.setBackground(Color.red);
        }
    }
}

