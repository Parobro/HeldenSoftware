/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.framework.HeldEinstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.I;
import helden.framework.held.Object.M;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.gui.A;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class S
extends AbstractAction {
    private static S o00000;
    private A new;

    public static S super(A a2) {
        if (o00000 == null) {
            o00000 = new S(a2);
        }
        return o00000;
    }

    private S(A a2) {
        super("Helden speichern", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Save.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.super();
    }

    public void \u00d300000() {
        Einstellungen einstellungen = Einstellungen.getInstance();
        ArrayList<HeldEinstellungen> arrayList = einstellungen.getHeldEinstellungen();
        String string = Einstellungen.getInstance().getPfade().getPfad("einstellungsPfad");
        File file = new File(string);
        try {
            a_0.class().super(file, arrayList);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }
    }

    public boolean \u00d200000() {
        int n = JOptionPane.showConfirmDialog(this.new, "Sollen die Helden gespeichert werden?", "Speichern der Helden", 1);
        if (n == 0) {
            this.super();
        }
        return n != 2;
    }

    public void super() {
        int n;
        if (a_0.class().\u00f800000() && (n = JOptionPane.showConfirmDialog(this.new, "Sind sie sich wirklich sicher, dass die Helden gespeichert werden soll?\nWenn sie fortfahren, werden die folgenden Helden nicht gespeichert: " + a_0.class().\u00d600000(), "Speichern der Helden", 1)) != 0) {
            return;
        }
        String string = this.new.int().o00000();
        Einstellungen.getInstance().setLastSort(string);
        this.new.int().new("time");
        ListModel listModel = this.new.int().getModel();
        ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        for (int i2 = 0; i2 < listModel.getSize(); ++i2) {
            arrayList.add((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)listModel.getElementAt(i2));
        }
        this.new.int().new(string);
        this.\u00d300000();
        String string2 = Einstellungen.getInstance().getPfade().getPfad("heldenPfad");
        if (string2 == null) {
            string2 = System.getProperty("user.home") + System.getProperty("file.separator") + "helden.zip.hld";
        }
        File file = new File(string2 + ".temp");
        try {
            new I().o00000(file, arrayList, this.new.\u00f6O0000().\u00d200000().getPathForRow(0));
            for (int i3 = 0; i3 < listModel.getSize(); ++i3) {
                ((K)arrayList.get(i3)).ifnew().\u00d400000();
            }
            M.o00000(new File(string2));
            M.o00000(file.getAbsolutePath(), string2);
            JOptionPane.showMessageDialog(this.new, "Helden gespeichert in\n" + string2, "Helden gespeichert", 1);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.new, "Fehler beim Speichern der Helden", exception.getMessage(), 0);
            exception.printStackTrace();
        }
    }
}

