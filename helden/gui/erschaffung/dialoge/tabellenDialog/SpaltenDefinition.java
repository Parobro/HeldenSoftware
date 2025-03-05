/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.framework.held.Object.private;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJButton;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJCheckBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJSpinner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class SpaltenDefinition
implements ActionListener,
ChangeListener {
    private String \u00d400000;
    private int \u00d500000;
    private boolean new;
    private ART \u00d300000;
    private String o00000;
    private Class<?> return;

    public SpaltenDefinition(String string, int n, boolean bl, Class<?> clazz) {
        this.\u00d400000 = string;
        this.\u00d500000 = n;
        this.new = bl;
        this.return = clazz;
        this.\u00d300000 = ART.\u00d800000;
        this.o00000 = "";
    }

    public SpaltenDefinition(String string, int n, boolean bl, Class<?> clazz, ART aRT) {
        this(string, n, bl, clazz);
        this.\u00d300000 = aRT;
    }

    public SpaltenDefinition(String string, int n, boolean bl, Class<?> clazz, ART aRT, String string2) {
        this(string, n, bl, clazz);
        this.\u00d300000 = aRT;
        this.o00000 = string2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof ExtJButton) {
            ExtJButton extJButton = (ExtJButton)actionEvent.getSource();
            this.click(extJButton.getPayLoad());
        } else if (actionEvent.getSource() instanceof ExtJComboBox) {
            ExtJComboBox extJComboBox = (ExtJComboBox)actionEvent.getSource();
            this.click(extJComboBox.getPayLoad(), extJComboBox.getSelectedItem());
        } else if (actionEvent.getSource() instanceof ExtJCheckBox) {
            ExtJCheckBox extJCheckBox = (ExtJCheckBox)actionEvent.getSource();
            AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
            boolean bl = abstractButton.getModel().isSelected();
            this.selected(extJCheckBox.getPayLoad(), bl);
        } else {
            private.\u00d200000("Spaltendefinition: " + actionEvent.toString(), "alle");
        }
    }

    public void changed(Object object, int n) {
    }

    public void click(Object object) {
    }

    public void click(Object object, Object object2) {
    }

    public int getBreite() {
        return this.\u00d500000;
    }

    public ART getButtonArt() {
        return this.\u00d300000;
    }

    public String getButtonBeschriftung() {
        return this.o00000;
    }

    public Class<?> getCellClass() {
        return this.return;
    }

    public Integer getComboBoxLength(Object object) {
        return null;
    }

    public abstract Object getData(int var1);

    public List<Object> getItems(Object object) {
        return null;
    }

    public int getMax(Object object) {
        return 99;
    }

    public int getMin(Object object) {
        return 0;
    }

    public ART getMultifunctionalArt(int n) {
        return null;
    }

    public JPanel getPanel(Object object) {
        return new JPanel();
    }

    public int getSchrittweite(Object object) {
        return 1;
    }

    public boolean getSelected(Object object) {
        return false;
    }

    public String getText(int n) {
        return "";
    }

    public String getToolTip(int n) {
        return "";
    }

    public String getUeberschrift() {
        return this.\u00d400000;
    }

    public int getValue(Object object) {
        return 1;
    }

    public boolean isEditable() {
        return this.new;
    }

    public boolean isEditable(int n) {
        if (this.getData(n) == null) {
            return false;
        }
        return this.isEditable();
    }

    public boolean isEnabled(Object object) {
        return true;
    }

    public void selected(Object object, boolean bl) {
    }

    public Object selectedItem(Object object) {
        return null;
    }

    public void setBreite(int n) {
        this.\u00d500000 = n;
    }

    public void setCellClass(Class<?> clazz) {
        this.return = clazz;
    }

    public void setEditable(boolean bl) {
        this.new = bl;
    }

    public void setText(Object object, String string) {
    }

    public void setUeberschrift(String string) {
        this.\u00d400000 = string;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        ExtJSpinner extJSpinner = (ExtJSpinner)changeEvent.getSource();
        extJSpinner.releaseMouse();
        this.changed(extJSpinner.getPayLoad(), (Integer)extJSpinner.getValue());
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum ART {
        \u00d800000,
        \u00d200000,
        \u00f800000,
        \u00d300000,
        \u00d600000,
        null,
        \u00f600000,
        o00000,
        String,
        \u00f500000;

    }
}

