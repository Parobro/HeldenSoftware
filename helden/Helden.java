/*
 * Decompiled with CFR 0.152.
 */
package helden;

import helden.Fehlermeldung;
import helden.Version;
import helden.comm.CommUtilities;
import helden.comm.hilfeTexte.HilfsTexteUpdater;
import helden.comm.updater.UpdateCheck;
import helden.comm.updater.UpdaterDownloader;
import helden.framework.Einstellungen;
import helden.framework.held.Object.M;
import helden.framework.held.Object.private;
import helden.gui.A;
import helden.gui.J;
import helden.gui.components.MsgDialogWithTextarea;
import helden.gui.laf.DSAMetalLookAndFeel;
import helden.gui.laf.DSAMetalLookAndFeel1;
import helden.gui.laf.DSAMetalLookAndFeel2;
import helden.gui.laf.DSAMetalLookAndFeel3;
import helden.gui.laf.DSAMetalLookAndFeel4;
import helden.gui.ooOO.S;
import helden.gui.ooOO.ifsuper;
import helden.gui.oooo_1;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Helden
extends WindowAdapter {
    private static Fehlermeldung o00000;

    public static void main(String[] stringArray) {
        String string;
        int n;
        Object object;
        Einstellungen.getInstance().setArgs(stringArray);
        if (stringArray != null && stringArray.length > 0) {
            object = stringArray;
            n = ((String[])object).length;
            for (int i2 = 0; i2 < n; ++i2) {
                Serializable serializable;
                String string2 = object[i2];
                boolean bl = true;
                if (string2.startsWith("-ep")) {
                    serializable = new File(string2.substring(3));
                    if (((File)serializable).exists() && ((File)serializable).isDirectory() && ((File)serializable).canWrite()) {
                        Einstellungen.getInstance().getPfade().setPfadePerEP(((File)serializable).getAbsolutePath());
                    } else {
                        JOptionPane.showMessageDialog(null, "Das angegebene Verzeichnis (" + string2.substring(3) + ") ist ung\u00fcltig.\n" + "Entweder es existiert nicht oder es ist nicht schreibbar.", "Fehler bein Starten!", 0);
                        System.exit(0);
                    }
                    bl = false;
                }
                if (string2.startsWith("-verderben")) {
                    Einstellungen.getInstance().setVerderben(true);
                    serializable = new Random();
                    if (((Random)serializable).nextInt(20) + 1 == 13) {
                        JOptionPane.showMessageDialog(null, "Ich will nicht!", "Fehler bein Starten!", 0);
                        System.exit(0);
                        return;
                    }
                    bl = false;
                }
                if (string2.equalsIgnoreCase("-hsLocalOff")) {
                    Einstellungen.getInstance().getPfade().setHsLocalUeberParameter(false);
                    bl = false;
                }
                if (string2.equalsIgnoreCase("-hsLocal")) {
                    Einstellungen.getInstance().getPfade().setHsLocalUeberParameter(true);
                    bl = false;
                }
                if (string2.equalsIgnoreCase("-hsDebianMode")) {
                    Einstellungen.getInstance().setDebianMode(true);
                    Einstellungen.getInstance().setAutoUpdate(false);
                    bl = false;
                }
                if (string2.equalsIgnoreCase("-hsDebianModeOff")) {
                    Einstellungen.getInstance().setDebianMode(false);
                    bl = false;
                }
                if (string2.equalsIgnoreCase("-hsDPI")) {
                    oooo_1.o00000(true);
                    oooo_1.o00000();
                    bl = false;
                }
                if (string2.startsWith("-test")) {
                    Einstellungen.getInstance().setTestMode(true);
                    bl = false;
                }
                if (string2.startsWith("-out=")) {
                    Einstellungen.getInstance().setActor(string2.substring("-out=".length()));
                    bl = false;
                }
                if (string2.startsWith("-tcpport=")) {
                    Einstellungen.getInstance().setPort(string2.substring("-tcpport=".length()));
                    bl = false;
                }
                if (string2.startsWith("-heldenUpdater")) {
                    JOptionPane.showMessageDialog(null, "Es gibt nun einen eingebauten Updater,<br>der heldenUpdater wird nicht mehr ben\u00f6tigt.");
                    bl = false;
                }
                if (string2.startsWith("/?")) {
                    serializable = new StringBuffer();
                    ((StringBuffer)serializable).append("---Parameterliste---\n");
                    ((StringBuffer)serializable).append("\"-hsLocal\"  setzt alle Pfade relative zum Jarfile, dieser Modus ist zB f\u00fcr USB-Sticks gedacht\n");
                    ((StringBuffer)serializable).append("\"-hsLocalOff\" schaltet den Localmodus wieder aus\n");
                    ((StringBuffer)serializable).append("\"-ep\" Durch diesen Parameter wird die Einstellungsdatei aus diesem Verzeichnis geladen.  z.B.  \"-epd:\\helden\"");
                    bl = false;
                    private.\u00d200000(((StringBuffer)serializable).toString(), "immer");
                    System.exit(0);
                }
                if (!bl) continue;
                private.\u00d200000("Der Parameter " + string2 + " ist unbekannt!", "immer");
                private.\u00d200000("Mit \"/?\" koennen alle moeglichen Parameter angezeigt werden.", "immer");
            }
        }
        System.setProperty("sun.awt.exception.handler", "helden.gui.allgemein.Fehlermeldung");
        if (Version.isTESTVERSION() && Integer.parseInt(string = new SimpleDateFormat("yyyyMMdd").format((Date)(object = new Date(System.currentTimeMillis())))) > Integer.parseInt(Version.getTESTENDE())) {
            JOptionPane.showMessageDialog(null, "Diese Testversion ist abgelaufen!\nBitte besorgen sie sich eine aktuelle Version!", "Programmende!", 0);
            System.exit(0);
        }
        if (System.getProperty("os.name").startsWith("Mac") && System.getProperty("java.version").startsWith("1.7.0")) {
            object = System.getProperty("java.version").substring(6, System.getProperty("java.version").length());
            try {
                n = Integer.parseInt((String)object);
                if (n < 40) {
                    JOptionPane.showMessageDialog(null, "<html>Es gibt Probleme beim Ausdruck mit MAC OS und JAVA 7 <br>Bitte auf Java 7 u40 oder neuer updaten oder Java 6 verwenden");
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (UpdateCheck.isWindowsVista78()) {
            Einstellungen.getInstance().setDebianMode(false);
        }
        new Helden();
    }

    private static boolean new() {
        try {
            ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/back.jpg"));
        }
        catch (IOException iOException) {
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            return true;
        }
        return false;
    }

    public Helden() {
        A.super(this);
        A a2 = A.\u00d4O0000();
        DSAMetalLookAndFeel4.setFrame(a2);
        Einstellungen.getInstance().setInitFalse();
        this.new(a2);
        this.o00000(a2);
        a2.\u00f600000();
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        super.windowClosed(windowEvent);
        System.exit(0);
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        super.windowClosing(windowEvent);
        A a2 = (A)windowEvent.getSource();
        if (!Einstellungen.getInstance().isVerderben() && a2.\u00d2O0000() != null && !S.super(a2).\u00d200000()) {
            return;
        }
        a2.dispose();
    }

    private void new(final A a2) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                File file = new CommUtilities().getJarPath();
                if (!Einstellungen.getInstance().isDebianMode() && !M.\u00d400000(file)) {
                    JOptionPane.showMessageDialog(a2, "<html>Keine Schreibrechte f\u00fcr den Ordner " + file + "<br>" + "Daher funktioniert der Parameter -hslocal nicht!");
                    System.out.println("Keine Schreibrechte im jar Ordner -hslocal nicht m\u00f6glich!");
                }
                if (!M.\u00d400000(new File(Einstellungen.getInstance().getPfade().getPfad("heldenPfad")))) {
                    JOptionPane.showMessageDialog(a2, "<html>Keine Schreibrechte im Ordner f\u00fcr die Helden! <br> Es kann nicht gespeichert werden!!");
                    System.out.println("Keine Schreibrechte im Ordner f\u00fcr die Helden!");
                }
            }
        });
    }

    private void o00000(final A a2) {
        if (Einstellungen.getInstance().getStartEventEinstellungen().checkEvent("dayly")) {
            if (Einstellungen.getInstance().isAutoUpdate()) {
                new UpdaterDownloader().start();
            }
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    UpdateCheck.getInstance(a2, false);
                }
            });
            new HilfsTexteUpdater().updateLocalFiles();
        }
        if (Einstellungen.getInstance().getStartEventEinstellungen().checkEvent("einmaligmessage")) {
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    MsgDialogWithTextarea msgDialogWithTextarea = new MsgDialogWithTextarea("Hilfe gesucht / Vollst\u00e4ndigkeit der Nebensettings", "<html><body><h2>Kurzfassung:</h2>F\u00fcr die Entwicklung, speziell wenn es um Myranische Magie geht,<br>brauchen wir auch Regelkundige, die den Entwicklern per <br>ICQ/Jabber/Skype bei Fragen kurzfristig zur Verf\u00fcgung stehen<br>und nat\u00fcrlich auch Tester, die die Implementierungen<br>f\u00fcr Myranor und DDZ testen k\u00f6nnen.<br><br>Deshalb:<br><ul><li>Wenn du Ahnung von den Settings hast, \u00fcberlege, ob du uns<br>nicht als Tester/Regelkundiger unterst\u00fctzen willst.<br>Beachte hierbei, dass die Community bei diesen Settings deutlich<br>kleiner ist. Wenn du es nicht machst, macht es m\u00f6glicherweise<br>kein anderer.<br><li>Wenn du die Helden-Software in diesen Settings nutzt, achte<br>einfach verst\u00e4rkt auf Probleme und Unsch\u00f6nheiten und melde sie.</ul><br><br><h2>Langfassung:</h2>In den letzten Wochen und Monaten ist immer mal wieder Kritik<br>zu uns vorgedrungen, dass einige Settings, insbesondere Myranor,<br>noch unvollst\u00e4ndig sind und auch noch nicht die Qualit\u00e4t<br>erreichen, die die Helden-Software im Bereich von<br>WdH/WdS/WdZ/WdG hat.<br><br>Die Gr\u00fcnde ist einfach:<br><ul><li>Es fehlen uns Tester und Regelkundige!<br><li>Au\u00dferdem ist die Community sehr zur\u00fcckhaltend mit<br>Fehlermeldungen.</ul><br>Keiner der Entwickler spielt in Myranor oder DDZ und auch<br>von den Testern gibt es nur einen der regelm\u00e4\u00dfig in Myranor<br>unterwegs ist.<br><br>Wenn ich mir die Statistik von Helden-Online anschaue, dann<br>sind gerade mal 1,3% der Helden auf Basis von DDZ und nur<br>0,5% auf Basis von Myranor generiert worden. Ich wei\u00df nicht,<br>ob die beiden Settings einfach so wenig gespielt werden oder<br>wir hier ein Henne-und-Ei Problem haben ('Helden-Software<br>funktioniert noch nicht so gut, also nutzen wir sie nicht.<br>Ohne Nutzer finden sich die Fehler nicht und die Software<br>wird nicht besser.')<br><br>", false);
                    msgDialogWithTextarea.setVisible(true);
                }
            });
        }
        if (Einstellungen.getInstance().getStartEventEinstellungen().checkEvent("mounth")) {
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    UpdateCheck.showAutoUpdaterInfoDialog(a2);
                }
            });
        }
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                String string = Einstellungen.getInstance().getLastVersion();
                if (!Version.getVersion().equals(string)) {
                    ifsuper.o00000(a2, 2).actionPerformed(null);
                }
            }
        });
    }

    static {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        try {
            UIManager.installLookAndFeel("DSA", DSAMetalLookAndFeel.class.getName());
            try {
                if (!System.getProperty("os.name").startsWith("Mac")) {
                    UIManager.installLookAndFeel("DSA1", DSAMetalLookAndFeel1.class.getName());
                    UIManager.installLookAndFeel("DSA2", DSAMetalLookAndFeel2.class.getName());
                    UIManager.installLookAndFeel("DSA3", DSAMetalLookAndFeel3.class.getName());
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            UIManager.installLookAndFeel("DSA mit gew\u00e4hlten GUI-Font", DSAMetalLookAndFeel4.class.getName());
            UIManager.setLookAndFeel(DSAMetalLookAndFeel.class.getName());
            o00000 = new Fehlermeldung();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

                @Override
                public void uncaughtException(Thread thread, Throwable throwable) {
                    System.gc();
                    o00000.handle(throwable);
                    private.\u00d200000("Exception was: " + throwable.toString(), "alle");
                }
            });
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (Helden.new()) {
            try {
                Desktop.getDesktop().browse(new URI("http://forum.helden-software.de/viewtopic.php?f=29&t=3781&p=16740"));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "<html>Ihre OpenJDK-Version enth\u00e4lt einen Fehler.<br><br>Aus diesem Grund l\u00e4uft die Helden-Software nicht.<br>Mehr Informationen in unserem Forum.");
            System.exit(255);
        }
        J.super();
    }
}

