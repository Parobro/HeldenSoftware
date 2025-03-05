/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.Einstellungen;
import java.awt.event.ActionEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Renamed from helden.gui.ooOO.ooOo
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oooo_1
extends AbstractAction {
    private static ArrayList<oooo_1> \u00d400000 = null;
    private static URLClassLoader \u00d300000;
    private JFrame new = null;
    private String o00000 = null;

    public static ArrayList<oooo_1> o00000(JFrame jFrame) {
        if (\u00d400000 == null) {
            try {
                oooo_1.o00000();
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(jFrame, "Fehlerhaftes LookAndFeel", exception.getMessage(), 0);
                exception.printStackTrace();
            }
            \u00d400000 = new ArrayList();
            for (UIManager.LookAndFeelInfo lookAndFeelInfo : UIManager.getInstalledLookAndFeels()) {
                if (!lookAndFeelInfo.getName().startsWith("DSA")) continue;
                \u00d400000.add(new oooo_1(jFrame, lookAndFeelInfo));
            }
        }
        return \u00d400000;
    }

    private static void o00000() throws MalformedURLException {
        ArrayList<URL> arrayList = new ArrayList<URL>();
        File file = new File("plugins");
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return;
        }
        for (File file2 : fileArray) {
            if (!file2.getName().endsWith(".jar")) continue;
            arrayList.add(file2.toURI().toURL());
        }
        int n = arrayList.size();
        URL[] uRLArray = new URL[arrayList.size()];
        for (int i2 = 0; i2 < n; ++i2) {
            uRLArray[i2] = (URL)arrayList.get(i2);
        }
        \u00d300000 = new URLClassLoader(uRLArray, oooo_1.class.getClassLoader());
        UIManager.put("ClassLoader", \u00d300000);
    }

    private oooo_1(JFrame jFrame, UIManager.LookAndFeelInfo lookAndFeelInfo) {
        super(lookAndFeelInfo.getName());
        this.new = jFrame;
        this.o00000 = lookAndFeelInfo.getClassName();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.o00000 != null) {
            try {
                if (\u00d300000 == null) {
                    UIManager.setLookAndFeel(this.o00000);
                } else {
                    Class<?> clazz = \u00d300000.loadClass(this.o00000);
                    UIManager.setLookAndFeel((LookAndFeel)clazz.newInstance());
                }
                Einstellungen.getInstance().setLookAndFeel(this.o00000);
                SwingUtilities.updateComponentTreeUI(this.new);
            }
            catch (ClassNotFoundException classNotFoundException) {
                JOptionPane.showMessageDialog(this.new, "Fehlerhaftes LookAndFeel", classNotFoundException.getMessage(), 0);
                classNotFoundException.printStackTrace();
            }
            catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                JOptionPane.showMessageDialog(this.new, "Fehlerhaftes LookAndFeel", unsupportedLookAndFeelException.getMessage(), 0);
                unsupportedLookAndFeelException.printStackTrace();
            }
            catch (InstantiationException instantiationException) {
                JOptionPane.showMessageDialog(this.new, "Fehlerhaftes LookAndFeel", instantiationException.getMessage(), 0);
                instantiationException.printStackTrace();
            }
            catch (IllegalAccessException illegalAccessException) {
                JOptionPane.showMessageDialog(this.new, "Fehlerhaftes LookAndFeel", illegalAccessException.getMessage(), 0);
                illegalAccessException.printStackTrace();
            }
        }
    }
}

