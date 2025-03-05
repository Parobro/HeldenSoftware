/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F;

import helden.framework.held.B.B.class;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.super.F.C;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
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
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class super
implements ActionListener,
ChangeListener {
    private A \u00d300000;
    private C o00000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> new;
    private int \u00d400000;
    private int \u00d500000;

    public super(A a2, C c) {
        this.\u00d300000 = a2;
        this.o00000 = c;
        this.\u00d400000 = 0;
        this.\u00d500000 = 4;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.o00000.\u00f4\u00d40000())) {
            helden.gui.ooOO.C.o00000(this.\u00d300000).actionPerformed(actionEvent);
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d4\u00d50000()) && this.new != null && this.new.size() > 0) {
            this.o00000();
        }
        if (actionEvent.getSource().equals(this.o00000.\u00d2\u00d50000())) {
            this.new();
        }
        if (actionEvent.getSource().equals(this.o00000.ObjectString())) {
            this.\u00d300000();
        }
        if (actionEvent.getSource().equals(this.o00000.\u00f4\u00d50000())) {
            if (this.o00000.\u00f4\u00d50000().isSelected()) {
                this.o00000.voidString().o00000();
            } else {
                this.o00000.voidString().new();
            }
        }
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> o00000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.new = arrayList;
        if (this.\u00d400000 == 0) {
            this.o00000.ObjectString().setEnabled(false);
        } else if (this.\u00d500000 >= this.new.size()) {
            this.o00000.ObjectString().setEnabled(false);
        } else {
            this.o00000.ObjectString().setEnabled(true);
        }
        if (this.\u00d500000 + this.\u00d400000 >= this.new.size()) {
            this.o00000.\u00d2\u00d50000().setEnabled(false);
        } else {
            this.o00000.\u00d2\u00d50000().setEnabled(true);
        }
        if (this.new.size() >= this.\u00d500000 + this.\u00d400000) {
            return new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>(this.new.subList(this.\u00d400000, this.\u00d500000 + this.\u00d400000));
        }
        if (this.new.size() >= this.\u00d500000) {
            if (this.\u00d400000 > 0) {
                return new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>(this.new.subList(this.\u00d400000, this.\u00d400000 + this.\u00d500000));
            }
            return new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>(this.new.subList(0, this.new.size() - (this.new.size() - this.\u00d500000)));
        }
        return this.new;
    }

    public void o00000() {
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet();
        DocFlavor.SERVICE_FORMATTED sERVICE_FORMATTED = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
        HashPrintRequestAttributeSet hashPrintRequestAttributeSet = new HashPrintRequestAttributeSet();
        hashPrintRequestAttributeSet.add(new JobName("KampfProtokoll", null));
        PrintService[] printServiceArray = PrintServiceLookup.lookupPrintServices(sERVICE_FORMATTED, hashPrintRequestAttributeSet);
        hashPrintRequestAttributeSet.add(new MediaPrintableArea(5.0f, 5.0f, 200.0f, 287.0f, 1000));
        Printable printable = class.o00000(this.new);
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

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.\u00d500000 = (Integer)this.o00000.interfaceObject().getValue();
        if (this.new.size() >= this.\u00d500000) {
            if (this.new.size() - this.\u00d500000 < this.\u00d400000) {
                this.\u00d400000 = this.new.size() - this.\u00d500000;
            }
            this.o00000.\u00f5\u00d40000().o00000(this.o00000(this.new));
            if (this.o00000.\u00f4\u00d50000().isSelected()) {
                this.o00000.voidString().o00000();
            } else {
                this.o00000.voidString().new();
            }
        } else {
            this.\u00d400000 = 0;
        }
    }

    private void \u00d300000() {
        if (this.\u00d400000 > 0) {
            --this.\u00d400000;
            this.o00000.\u00f5\u00d40000().o00000(this.o00000(this.new));
            if (this.o00000.\u00f4\u00d50000().isSelected()) {
                this.o00000.voidString().o00000();
            } else {
                this.o00000.voidString().new();
            }
        }
    }

    private void new() {
        if (this.\u00d400000 + this.\u00d500000 < this.new.size()) {
            ++this.\u00d400000;
            this.o00000.\u00f5\u00d40000().o00000(this.o00000(this.new));
            if (this.o00000.\u00f4\u00d50000().isSelected()) {
                this.o00000.voidString().o00000();
            } else {
                this.o00000.voidString().new();
            }
        }
    }
}

