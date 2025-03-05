/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.pfadEinstellung;

import helden.framework.held.Object.private;
import helden.gui.components.JTextFieldWithMenu;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class JPfadTextField
extends JTextFieldWithMenu {
    private String \u00f500000 = "";

    public JPfadTextField() {
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyPressed(KeyEvent keyEvent) {
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if (!JPfadTextField.this.checkPfad()) {
                    JPfadTextField.this.setBackground(Color.RED);
                } else {
                    JPfadTextField.this.setBackground(Color.WHITE);
                }
            }

            @Override
            public void keyTyped(KeyEvent keyEvent) {
            }
        });
    }

    public boolean checkPfad() {
        if (this.hasChanged()) {
            boolean bl = false;
            try {
                File file = new File(super.getText());
                int n = 0;
                while (!file.exists()) {
                    file = file.getParentFile();
                    ++n;
                }
                file = new File(super.getText());
                file.mkdirs();
                if (file.canRead() && file.canWrite()) {
                    bl = true;
                }
                for (int i2 = 0; i2 < n; ++i2) {
                    file.delete();
                    file = file.getParentFile();
                }
            }
            catch (Exception exception) {
                private.\u00d200000(exception.getMessage(), "christian");
                return false;
            }
            return bl;
        }
        return true;
    }

    public String getDefaultText() {
        return this.\u00f500000;
    }

    @Override
    public String getText() {
        return this.o00000(super.getText());
    }

    public boolean hasChanged() {
        return !this.\u00f500000.equals(super.getText());
    }

    public void reset() {
        this.setText(this.\u00f500000);
    }

    public void setDefaultText(String string) {
        this.\u00f500000 = string;
        this.setText(string);
    }

    private String o00000(String string) {
        string = string.trim();
        while (string.endsWith("/") || string.endsWith(System.getProperty("file.separator"))) {
            string = string.substring(0, string.length() - 1);
        }
        this.setText(string);
        return string;
    }
}

