/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.components.JTextFieldWithMenu;
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
import javax.swing.SwingUtilities;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class JTextFieldWithRangeCheckUMenu
extends JTextFieldWithMenu
implements TextFieldChangedSupport,
A {
    private boolean OO0000 = true;
    private int \u00f600000 = 1;
    private Font oO0000;
    private String float = "";

    public JTextFieldWithRangeCheckUMenu(int n, boolean bl) {
        this.\u00f600000 = n;
        this.OO0000 = bl;
        this.String();
        this.\u00d300000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        super.actionPerformed(actionEvent);
        this.o00000(this.istLaengeOK());
    }

    @Override
    public boolean istLaengeOK() {
        boolean bl;
        int n = SwingUtilities.computeStringWidth(oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new().getFontMetrics(), this.getText());
        boolean bl2 = bl = n < this.\u00f600000;
        if (this.OO0000) {
            this.o00000(bl);
        }
        return bl;
    }

    @Override
    public void setMaxLaenge(int n) {
        this.\u00f600000 = n;
    }

    @Override
    public void setText(String string) {
        this.float = string == null ? "" : string;
        super.setText(string);
        this.istLaengeOK();
    }

    @Override
    public void setTextOhneSave(String string) {
        super.setText(string);
    }

    @Override
    public boolean wurdeTextfieldVeraendert() {
        return !this.float.equals(this.getText());
    }

    private void \u00d300000() {
        this.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent focusEvent) {
                JTextFieldWithRangeCheckUMenu.this.o00000(JTextFieldWithRangeCheckUMenu.this.istLaengeOK());
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                JTextFieldWithRangeCheckUMenu.this.o00000(JTextFieldWithRangeCheckUMenu.this.istLaengeOK());
            }
        });
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyPressed(KeyEvent keyEvent) {
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                JTextFieldWithRangeCheckUMenu.this.o00000(JTextFieldWithRangeCheckUMenu.this.istLaengeOK());
            }

            @Override
            public void keyTyped(KeyEvent keyEvent) {
                JTextFieldWithRangeCheckUMenu.this.o00000(JTextFieldWithRangeCheckUMenu.this.istLaengeOK());
            }
        });
        this.addPropertyChangeListener(new PropertyChangeListener(){

            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                JTextFieldWithRangeCheckUMenu.this.istLaengeOK();
            }
        });
    }

    private void String() {
        this.oO0000 = G.new(9);
    }

    private void o00000(boolean bl) {
        if (bl) {
            this.setBackground(Color.white);
        } else {
            this.setBackground(Color.red);
        }
    }
}

