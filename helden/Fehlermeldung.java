/*
 * Decompiled with CFR 0.152.
 */
package helden;

import helden.Helden;
import helden.Version;
import helden.comm.CommUtilities;
import helden.framework.Einstellungen;
import helden.framework.held.Object.Q;
import helden.framework.held.Object.private;
import helden.framework.held.Object.return;
import helden.framework.held.object.oooo_0;
import helden.gui.A;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Fehlermeldung
extends JFrame
implements ActionListener,
WindowListener {
    private static final long serialVersionUID = -8286367042202296935L;
    private Throwable \u00d200000;
    private JButton \u00d500000;
    private JButton \u00d400000;
    private JButton Object;
    private JButton o00000;

    public Fehlermeldung() {
        this.addWindowListener(this);
        Einstellungen.getInstance().setFehler();
        this.setSize(700, 400);
        this.setLocation(200, 200);
        this.setTitle("Fehler");
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(this.o00000(), "South");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.\u00d500000) {
            this.dispose();
        }
        if (actionEvent.getSource() == this.Object) {
            this.dispose();
            System.exit(0);
        }
        if (actionEvent.getSource() == this.\u00d400000) {
            this.null();
        }
        if (actionEvent.getSource() == this.o00000) {
            this.\u00f600000();
        }
    }

    public String getWeitereInformationen() {
        CommUtilities commUtilities = new CommUtilities();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Version: " + Version.getVersion() + " / " + Version.getSoftwareVersion());
        Package package_ = Helden.class.getPackage();
        if (package_ != null && package_.getImplementationVersion() != null) {
            stringBuffer.append(" / " + package_.getImplementationVersion());
        }
        stringBuffer.append("\n");
        if (A.\u00d4O0000().\u00d2O0000() != null) {
            stringBuffer.append("Aktueller Held: " + A.\u00d4O0000().\u00d2O0000().\u00f5o0000() + "\n");
        }
        stringBuffer.append("File " + commUtilities.getJarPath() + "\n");
        stringBuffer.append("MD5: " + Q.o00000(commUtilities.getJarPath()) + "\n");
        if (Einstellungen.getInstance().getArgs() == null) {
            stringBuffer.append("Parameter: <keine>");
        } else {
            stringBuffer.append("Parameter: " + Arrays.asList(Einstellungen.getInstance().getArgs()).toString());
        }
        stringBuffer.append("\n");
        stringBuffer.append("Verzeichnisse:\n");
        Set<String> set = Einstellungen.getInstance().getPfade().getAll().keySet();
        for (String string : set) {
            stringBuffer.append(" " + string);
            stringBuffer.append(": ");
            stringBuffer.append(Einstellungen.getInstance().getPfade().getPfad(string));
            stringBuffer.append("\n");
        }
        stringBuffer.append(" DebianMode: ");
        stringBuffer.append(Einstellungen.getInstance().isDebianMode());
        stringBuffer.append("\n");
        stringBuffer.append(" Jar: ");
        stringBuffer.append(Einstellungen.getInstance().getPfade().getJarPath());
        stringBuffer.append("\n");
        stringBuffer.append("\n");
        stringBuffer.append("Java:\n");
        Object object = System.getProperty("sun.arch.data.model");
        if (object == null) {
            object = "unknown";
        }
        stringBuffer.append(" " + System.getProperty("java.vm.vendor") + " " + System.getProperty("java.version") + " (" + (String)object + " bit)\n");
        stringBuffer.append(" " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch") + "\n");
        if (!((String)System.getProperties().get("java.vm.specification.vendor")).startsWith("Oracle Corporation") && !((String)System.getProperties().get("java.vm.specification.vendor")).startsWith("Sun")) {
            stringBuffer.append("Es wurde keine Sun/Oracle Runtime benutzt, dies k\u00f6nnte die Ursache f\u00fcr dein  Problem sein!");
        }
        stringBuffer.append("\n\n");
        stringBuffer.append("Default-Charset: ");
        stringBuffer.append(Charset.defaultCharset());
        stringBuffer.append("\n\n");
        long l2 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getMax();
        long l3 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
        int n = (int)(l2 / 1024L / 1024L);
        int n2 = (int)(l3 / 1024L / 1024L);
        stringBuffer.append("Memory:\n");
        stringBuffer.append(" Max f\u00fcr Java verf\u00fcgbar: " + n + "MB\n");
        stringBuffer.append(" Zur Zeit genutzt: " + n2 + "MB\n");
        return stringBuffer.toString();
    }

    public void handle(Throwable throwable) {
        if (this.isVisible()) {
            oooo_0.\u00f500000("Fehlerdialog schon aktiv!");
            return;
        }
        this.\u00d200000 = throwable;
        this.getContentPane().add(this.\u00d300000(), "Center");
        this.o00000.setVisible(Einstellungen.getInstance() != null && Einstellungen.getInstance().isTestMode());
        if (this.\u00d200000 instanceof OutOfMemoryError) {
            this.\u00d500000.setEnabled(false);
        }
        this.setVisible(true);
        private.\u00d200000(this.\u00f500000(), "immer");
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        if (this.\u00d200000 instanceof OutOfMemoryError) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        if (this.\u00d200000 instanceof OutOfMemoryError) {
            System.exit(0);
        }
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    private void \u00f600000() {
        try {
            String string;
            return return_ = new return();
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000();
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.new();
            HttpURLConnection httpURLConnection = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000("http://www.helden-software.de/scripts/reportError.php");
            return_.new("82427281316627396682025187190");
            return_.o00000("error", this.\u00d200000.getMessage());
            for (int i2 = 0; i2 < this.\u00d200000.getStackTrace().length; ++i2) {
                return_.o00000("trace" + String.format("%03d", i2), this.\u00d200000.getStackTrace()[i2].toString());
            }
            return_.o00000("config", this.getWeitereInformationen());
            httpURLConnection.setRequestProperty("Content-Type", return_.new());
            OutputStream outputStream = httpURLConnection.getOutputStream();
            return_.o00000(outputStream);
            outputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            while ((string = bufferedReader.readLine()) != null) {
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            oooo_0.o00000(exception);
        }
    }

    private void null() {
        JFileChooser jFileChooser = new JFileChooser();
        File file = new File("fehler.txt");
        jFileChooser.setSelectedFile(file);
        if (jFileChooser.showSaveDialog(this) == 0) {
            File file2 = jFileChooser.getSelectedFile();
            try {
                PrintWriter printWriter = new PrintWriter(file2, "UTF8");
                printWriter.print(this.\u00f500000());
                printWriter.flush();
                printWriter.close();
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Fehler beim Speichern", exception.getMessage(), 0);
                exception.printStackTrace();
            }
        }
    }

    private Component \u00d800000() {
        this.Object = new JButton("Beenden");
        this.Object.addActionListener(this);
        return this.Object;
    }

    private Component o00000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        jPanel.add(Box.createHorizontalGlue());
        jPanel.add(this.\u00d500000());
        jPanel.add(this.\u00d200000());
        jPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        jPanel.add(this.\u00d600000());
        jPanel.add(this.\u00d800000());
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        return jPanel;
    }

    private Component \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("Leider ist ein Fehler aufgetreten:");
        jLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel.add((Component)jLabel, "North");
        jPanel.add(this.String(), "Center");
        JLabel jLabel2 = new JLabel("<html>Bitte speichern sie diese Fehlermeldung und befolgen<br>sie die Anweisung unter dem Men\u00fcpunkt \"Hilfe/Fehler melden\" bzw.von wiki.helden-software.de/Bugs um den Fehler zu melden.<br><br>Vielen Dank!<br>");
        jLabel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel.add((Component)jLabel2, "South");
        return jPanel;
    }

    private String \u00f500000() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.\u00d200000 instanceof OutOfMemoryError) {
            stringBuffer.append("Nicht gen\u00fcgend Arbeitsspeicher f\u00fcr Java vorhanden! \n");
            stringBuffer.append("Bitte weisen sie dem Programm mehr Speicher zu.\n");
            stringBuffer.append("Eine Anleitung finden sie unter http://wiki.helden-software.de/Speicher");
        }
        stringBuffer.append(this.\u00d200000.toString());
        stringBuffer.append(this.\u00d200000.getMessage());
        stringBuffer.append("\n");
        for (int i2 = 0; i2 < this.\u00d200000.getStackTrace().length; ++i2) {
            stringBuffer.append(this.\u00d200000.getStackTrace()[i2]);
            stringBuffer.append("\n");
        }
        stringBuffer.append("\n");
        stringBuffer.append(this.getWeitereInformationen());
        return stringBuffer.toString();
    }

    private Component \u00d500000() {
        this.o00000 = new JButton("Online melden");
        this.o00000.addActionListener(this);
        return this.o00000;
    }

    private Component \u00d600000() {
        this.\u00d500000 = new JButton("Ignorieren");
        this.\u00d500000.addActionListener(this);
        return this.\u00d500000;
    }

    private Component \u00d200000() {
        this.\u00d400000 = new JButton("Fehlertext speichern...");
        this.\u00d400000.addActionListener(this);
        return this.\u00d400000;
    }

    private Component String() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText(this.\u00f500000());
        jTextArea.setEditable(false);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jTextArea);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        jPanel.add((Component)jScrollPaneFast, "Center");
        jPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        return jPanel;
    }
}

