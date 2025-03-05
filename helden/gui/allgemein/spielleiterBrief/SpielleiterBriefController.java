/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.spielleiterBrief;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.class;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.allgemein.spielleiterBrief.SpielleiterAuswahl;
import helden.gui.allgemein.spielleiterBrief.SpielleiterBriefHauptPanel;
import helden.gui.allgemein.spielleiterBrief.SpielleiterBriefInlinePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpielleiterBriefController
implements ActionListener {
    private HashMap<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO, SpielleiterAuswahl> class = new HashMap();
    private List<SpielleiterBriefInlinePanel> \u00d400000 = new ArrayList<SpielleiterBriefInlinePanel>();
    private List<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d600000 = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
    private SpielleiterBriefHauptPanel super = null;
    private A \u00d300000;
    private JDialog \u00d200000;

    public SpielleiterBriefController(A a2) {
        this.\u00d300000 = a2;
        for (SpielleiterAuswahl spielleiterAuswahl : Einstellungen.getInstance().getSlAuswahl()) {
            this.class.put(spielleiterAuswahl.getHeld(), spielleiterAuswahl);
            this.\u00d600000.add(spielleiterAuswahl.getHeld());
        }
        this.super = new SpielleiterBriefHauptPanel(this);
        this.\u00d200000 = new JDialog(a2);
        this.\u00d200000.add(this.super);
        this.\u00d200000.setTitle("Spielleiterbrief drucken");
        this.\u00d200000.setDefaultCloseOperation(2);
        this.\u00d200000.setSize(470, 450);
        this.\u00d200000.setLocationRelativeTo(null);
        this.\u00d200000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.super.getBtnSchlieen()) {
            this.\u00d400000();
        }
        if (actionEvent.getSource() == this.super.getBtnDrucken()) {
            this.\u00d300000();
        }
        if (actionEvent.getSource() == this.super.getBtnSpeichern()) {
            this.new();
            this.\u00d200000.dispose();
        }
    }

    public HashMap<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO, SpielleiterAuswahl> getAuswahlMap() {
        return this.class;
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO getGemerktenHeld(int n) {
        if (n >= 0 && n < this.\u00d600000.size()) {
            return this.\u00d600000.get(n);
        }
        return null;
    }

    public List<SpielleiterBriefInlinePanel> getInlinePanelList() {
        return this.\u00d400000;
    }

    public void updateGUI() {
        for (SpielleiterBriefInlinePanel spielleiterBriefInlinePanel : this.\u00d400000) {
            spielleiterBriefInlinePanel.updateLableStatus();
        }
    }

    private boolean o00000() {
        for (SpielleiterBriefInlinePanel spielleiterBriefInlinePanel : this.\u00d400000) {
            if (spielleiterBriefInlinePanel.getAuswahl() == null) {
                return true;
            }
            if (spielleiterBriefInlinePanel.getAuswahl().istAuswahlOk()) continue;
            return false;
        }
        return true;
    }

    private void \u00d300000() {
        if (this.o00000()) {
            ArrayList<SpielleiterAuswahl> arrayList = new ArrayList<SpielleiterAuswahl>();
            for (SpielleiterBriefInlinePanel spielleiterBriefInlinePanel : this.\u00d400000) {
                SpielleiterAuswahl spielleiterAuswahl = spielleiterBriefInlinePanel.getAuswahl();
                if (spielleiterAuswahl == null) continue;
                arrayList.add(spielleiterAuswahl);
            }
            this.o00000(arrayList);
        } else {
            JOptionPane.showMessageDialog(this.\u00d200000, "Es sind bei einem Helden zu viele Eintr\u00e4ge gew\u00e4hlt");
        }
    }

    private void o00000(List<SpielleiterAuswahl> list) {
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet();
        DocFlavor.SERVICE_FORMATTED sERVICE_FORMATTED = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
        HashPrintRequestAttributeSet hashPrintRequestAttributeSet = new HashPrintRequestAttributeSet();
        hashPrintRequestAttributeSet.add(new JobName("SL Brief", null));
        PrintService[] printServiceArray = PrintServiceLookup.lookupPrintServices(sERVICE_FORMATTED, hashPrintRequestAttributeSet);
        hashPrintRequestAttributeSet.add(new MediaPrintableArea(5.0f, 5.0f, 200.0f, 287.0f, 1000));
        Printable printable = helden.framework.held.B.B.class.o00000(list);
        SimpleDoc simpleDoc = new SimpleDoc(printable, sERVICE_FORMATTED, hashDocAttributeSet);
        if (printServiceArray.length == 0) {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            if (printerJob.getPrintService() == null) {
                JOptionPane.showMessageDialog(this.\u00d300000, "Kein Drucker vorhanden", "Fehler beim Drucken", 0);
            } else {
                printerJob.setPrintable(printable);
                printerJob.setJobName("Helden");
                if (printerJob.printDialog()) {
                    try {
                        printerJob.print();
                    }
                    catch (Exception exception) {
                        JOptionPane.showMessageDialog(this.\u00d300000, exception.getMessage(), "Fehler beim Drucken", 0);
                    }
                }
            }
        } else {
            PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
            PrintService printService2 = ServiceUI.printDialog(null, 100, 100, printServiceArray, printService, sERVICE_FORMATTED, hashPrintRequestAttributeSet);
            if (printService2 != null) {
                DocPrintJob docPrintJob = printService2.createPrintJob();
                try {
                    docPrintJob.print(simpleDoc, hashPrintRequestAttributeSet);
                }
                catch (PrintException printException) {
                    JOptionPane.showMessageDialog(this.\u00d300000, printException.getMessage(), "Fehler beim Drucken", 0);
                }
            }
        }
    }

    private void \u00d400000() {
        int n = JOptionPane.showConfirmDialog(this.\u00d300000, "Wirklich schlie\u00dfen? Ungespeicherte Infos gehen verloren!");
        if (n == 0) {
            this.\u00d200000.dispose();
        }
    }

    private void new() {
        ArrayList<SpielleiterAuswahl> arrayList = new ArrayList<SpielleiterAuswahl>();
        for (SpielleiterBriefInlinePanel spielleiterBriefInlinePanel : this.\u00d400000) {
            SpielleiterAuswahl spielleiterAuswahl = spielleiterBriefInlinePanel.getAuswahl();
            if (spielleiterAuswahl == null) continue;
            arrayList.add(spielleiterAuswahl);
        }
        Einstellungen.getInstance().setSLAuswahl(arrayList);
    }
}

