/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.Fehlermeldung;
import helden.Version;
import helden.gui.allgemein.Utils;
import helden.gui.ooOO.T;
import helden.gui.ooOO.privatesuper;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public class oO00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements ActionListener {
    private privatesuper o00000;
    private JDialog \u00d200000;

    public oO00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(privatesuper privatesuper2, JDialog jDialog) {
        this.o00000 = privatesuper2;
        this.\u00d200000 = jDialog;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        T t;
        Window window;
        if (actionEvent.getSource().equals(this.o00000.interface())) {
            this.\u00d200000.setVisible(false);
        }
        if (actionEvent.getSource().equals(this.o00000.super())) {
            if (this.o00000.super().isSelected()) {
                this.o00000.\u00d8O0000().setText("");
                window = new Fehlermeldung();
                this.o00000.\u00d8O0000().setText(((Fehlermeldung)window).getWeitereInformationen());
            } else {
                this.o00000.\u00d8O0000().setText("");
                this.o00000.\u00f4O0000();
            }
        }
        if (actionEvent.getSource().equals(this.o00000.do())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(1, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.Objectsuper())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(2, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d600000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(3, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d2O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(4, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00f6O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(5, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d800000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(6, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d3O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(7, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00f800000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(8, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d6O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(9, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.int())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(10, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d4O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(11, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00f8O0000())) {
            window = new JDialog(Utils.getFrame(this.\u00d200000), "\u00dcber Helden Version: " + Version.getVersion(), true);
            t = new T(12, (JDialog)window);
            ((JDialog)window).getContentPane().add(t);
            window.setSize(400, 500);
            Utils.zentriere(window);
            ((Dialog)window).setVisible(true);
        }
    }
}

