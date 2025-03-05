/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Einstellungen;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.erschaffung.dialoge.LadenDialog;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class LadenZustand
extends ErschaffungsZustand {
    static final Comparator<String> \u00d8O0000 = new Comparator<String>(){
        private DateFormat o00000 = new SimpleDateFormat();

        public int super(String string, String string2) {
            try {
                Date date = this.o00000.parse(string.substring(0, 13));
                Date date2 = this.o00000.parse(string2.substring(0, 13));
                return date.compareTo(date2);
            }
            catch (Exception exception) {
                return 0;
            }
        }
    };
    private HauptDialog \u00d4O0000;
    private LadenDialog interface = null;
    private Map<String, String> \u00d6O0000 = new HashMap<String, String>();

    public LadenZustand(HauptDialog hauptDialog, HEW2 hEW2) {
        super(hEW2);
        this.super = hEW2;
        this.\u00d4O0000 = hauptDialog;
        this.\u00d400000();
        this.interface = new LadenDialog(this);
    }

    @Override
    public String getBezeichner() {
        return "Laden";
    }

    public Map<String, String> getGespeicherteZustaende() {
        return this.\u00d6O0000;
    }

    @Override
    public String getHelp() {
        StringBuffer stringBuffer = new StringBuffer("<html>");
        stringBuffer.append("Die Helden werden aus dem Ordner<p>");
        stringBuffer.append(Einstellungen.getInstance().getPfade().getPfad("erschaffungsSavesPfad"));
        stringBuffer.append("</p>\n<p>geladen.");
        stringBuffer.append("");
        return stringBuffer.toString();
    }

    public List<String> getListe() {
        ArrayList<String> arrayList = new ArrayList<String>(this.getGespeicherteZustaende().keySet());
        Collections.sort(arrayList, \u00d8O0000);
        return arrayList;
    }

    public void importieren() {
        this.\u00d4O0000.laden();
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.class;
    }

    public void laden() {
        DefaultListModel defaultListModel = (DefaultListModel)this.interface.getJLadenList().getModel();
        if (defaultListModel.size() > this.interface.getJLadenList().getSelectedIndex() && this.interface.getJLadenList().getSelectedIndex() >= 0) {
            String string = (String)this.interface.getJLadenList().getSelectedValue();
            if (this.\u00d4O0000.laden(this.\u00d6O0000.get(string))) {
                JOptionPane.showMessageDialog(null, "Den geladenen Held bitte genau pr\u00fcfen!", "Laden", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nichts ausgew\u00e4hlt!", "Fehler", 1);
        }
    }

    public void loeschen() {
        DefaultListModel defaultListModel = (DefaultListModel)this.interface.getJLadenList().getModel();
        if (defaultListModel.size() > this.interface.getJLadenList().getSelectedIndex() && this.interface.getJLadenList().getSelectedIndex() >= 0) {
            String string = (String)this.interface.getJLadenList().getSelectedValue();
            new File(this.getGespeicherteZustaende().get(string)).delete();
            this.\u00d400000();
            this.update();
            JOptionPane.showMessageDialog(null, "Gel\u00f6scht!", "", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nichts ausgew\u00e4hlt!", "Fehler", 1);
        }
    }

    @Override
    public void update() {
        this.interface.update();
    }

    @Override
    protected JPanel getPanel() {
        return this.interface;
    }

    private void \u00d400000() {
        this.\u00d6O0000.clear();
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("erschaffungsSavesPfad"));
        file.mkdirs();
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File file2 : fileArray) {
                if (!file2.isFile() || !file2.getName().endsWith(".erschaffung.hld")) continue;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                String string = simpleDateFormat.format(new Date(file2.lastModified())) + " - " + file2.getName().substring(0, file2.getName().length() - ".erschaffung.hld".length());
                this.getGespeicherteZustaende().put(string, file2.getAbsolutePath());
            }
        }
    }
}

