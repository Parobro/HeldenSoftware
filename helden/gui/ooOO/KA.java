/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.held.B.B.class;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import java.awt.event.ActionEvent;
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
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class KA
extends AbstractAction {
    private static KA o00000;
    private A new;

    public static KA o00000(A a2) {
        if (o00000 == null) {
            o00000 = new KA(a2);
        }
        return o00000;
    }

    private KA(A a2) {
        super("Kampfprotokoll drucken ...");
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.o00000(new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>());
    }

    public void o00000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet();
        DocFlavor.SERVICE_FORMATTED sERVICE_FORMATTED = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
        HashPrintRequestAttributeSet hashPrintRequestAttributeSet = new HashPrintRequestAttributeSet();
        hashPrintRequestAttributeSet.add(new JobName("KampfProtokoll", null));
        PrintService[] printServiceArray = PrintServiceLookup.lookupPrintServices(sERVICE_FORMATTED, hashPrintRequestAttributeSet);
        hashPrintRequestAttributeSet.add(new MediaPrintableArea(5.0f, 5.0f, 200.0f, 287.0f, 1000));
        Printable printable = class.o00000(arrayList);
        SimpleDoc simpleDoc = new SimpleDoc(printable, sERVICE_FORMATTED, hashDocAttributeSet);
        if (printServiceArray.length == 0) {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            if (printerJob.getPrintService() == null) {
                JOptionPane.showMessageDialog(this.new, "Kein Drucker vorhanden", "Fehler beim Drucken", 0);
            } else {
                printerJob.setPrintable(printable);
                printerJob.setJobName("Helden");
                if (printerJob.printDialog()) {
                    try {
                        printerJob.print();
                    }
                    catch (Exception exception) {
                        JOptionPane.showMessageDialog(this.new, exception.getMessage(), "Fehler beim Drucken", 0);
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
                    JOptionPane.showMessageDialog(this.new, printException.getMessage(), "Fehler beim Drucken", 0);
                }
            }
        }
    }
}

