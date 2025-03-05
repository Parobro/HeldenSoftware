/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.I;
import helden.framework.held.Object.Y;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.framework.held.object.oooo_0;
import helden.gui.A;
import helden.gui.B;
import helden.gui.oooo_1;
import helden.logging.Logger;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Date;
import java.util.Iterator;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;

/*
 * Renamed from helden.gui.ooOO.i
 */
public final class i_0
extends AbstractAction {
    private static i_0 o00000;
    private A \u00d200000;

    public static i_0 o00000(A a2) {
        if (o00000 == null) {
            o00000 = new i_0(a2);
        }
        return o00000;
    }

    private i_0(A a2) {
        super("Helden erneut laden", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Open.gif"))));
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.\u00d200000.\u00d2O0000() != null && JOptionPane.showConfirmDialog(this.\u00d200000, "Die \u00c4nderungen seit dem letzten Speichern gehen verloren.") != 0) {
            return;
        }
        B.\u00d200000().super(0, 10, "Held laden");
        this.o00000();
        B.\u00d200000().\u00d300000();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void o00000(File file, File file2) throws IOException {
        FileChannel fileChannel = null;
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            abstractInterruptibleChannel = new FileOutputStream(file2).getChannel();
            fileChannel.transferTo(0L, fileChannel.size(), (WritableByteChannel)((Object)abstractInterruptibleChannel));
        }
        catch (IOException iOException) {
        }
        finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (abstractInterruptibleChannel != null) {
                abstractInterruptibleChannel.close();
            }
        }
    }

    public void o00000() {
        Iterator<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator;
        Object object;
        long l2 = System.nanoTime();
        this.\u00d200000.setCursor(new Cursor(3));
        this.\u00d200000.\u00f400000();
        a_0.class().\u00f400000();
        boolean bl = false;
        Logger.getInstance().startLoging();
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad"));
        try {
            object = new I();
            iterator = ((I)object).o00000(file).iterator();
            Y y2 = ((I)object).\u00d200000();
            OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
            while (iterator.hasNext()) {
                oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                ((K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2).ifnew().o00000(false);
                this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, !iterator.hasNext());
            }
            this.\u00d200000.\u00f6O0000().o00000();
            this.\u00d200000.\u00f6O0000().o00000(y2);
            ((DefaultTreeModel)this.\u00d200000.\u00f6O0000().\u00d200000().getModel()).reload();
            this.\u00d200000.int().new(Einstellungen.getInstance().getLastSort());
            this.\u00d200000.\u00d300000().setSelectedItem(Einstellungen.getInstance().getLastSort());
            if (((I)object).o00000() != null) {
                try {
                    File file2 = new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad") + "." + ((I)object).o00000());
                    this.o00000(new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad")), file2);
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (Exception exception) {
            bl = true;
            exception.printStackTrace();
            JOptionPane.showMessageDialog(this.\u00d200000, exception.getMessage(), "Fehler beim Laden der Helden", 0);
        }
        if (a_0.class().\u00f800000()) {
            try {
                this.o00000(new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad")), new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad") + "." + new Date().getTime()));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            JOptionPane.showMessageDialog(this.\u00d200000, "Folgende Helden konnten nicht geladen werden:\n\n" + a_0.class().\u00d600000() + "\n\n" + "Diese Helden gehen unwiederbringlich verloren, " + "wenn sie auf speichern gehen!\n\n" + "Zur L\u00f6sung dieses Problemes, k\u00f6nnen sie sich an die Programmierer wenden.\n" + "http://forum.helden-software.de/", "Fehler beim Laden", 0);
        }
        if (a_0.class().\u00d200000()) {
            object = "<html><body>";
            object = (String)object + "Bei Laden der Helden sind einige Probleme identifiziert worden:<br><br>";
            object = (String)object + a_0.class().\u00f600000();
            object = (String)object + "<br>Nach einem erneuten Speichern, wird diese Meldung nicht mehr angezeigt.<br>";
            object = (String)object + "<br>F\u00fcr Fragen bitte unser Forum nutzen.<br>";
            JOptionPane.showMessageDialog(this.\u00d200000, object, "Fehler beim Laden", 1);
        }
        if (!a_0.class().\u00f800000() && !bl) {
            try {
                this.o00000(new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad")), new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad") + ".ok"));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        try {
            object = "helden/beispiel/Horasischer Einbrecher.xml";
            iterator = a_0.class().super(ClassLoader.getSystemResourceAsStream((String)object)).iterator();
            this.\u00d200000.int().o00000(iterator.next());
            this.\u00d200000.\u00d8O0000();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.\u00d200000.setCursor(new Cursor(0));
        oooo_0.\u00d400000("Ladezeit: " + (double)(System.nanoTime() - l2) / 1.0E9);
    }
}

