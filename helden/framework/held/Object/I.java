/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.held.Object.Y;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.gui.B;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.swing.tree.TreePath;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class I {
    private static final int o00000 = 2048;
    private Y new;
    private String \u00d300000 = null;

    public static String o00000(String string) {
        String string2 = "1234567890abcdefghijklmnopjrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
        String string3 = "";
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c = string.charAt(i2);
            if (string2.lastIndexOf(c) <= -1) continue;
            string3 = string3 + c;
        }
        return string3;
    }

    public Y \u00d200000() {
        return this.new;
    }

    public String o00000() {
        return this.\u00d300000;
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> o00000(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
        propertyChangeSupport.addPropertyChangeListener(B.\u00d200000());
        this.new = null;
        if (fileInputStream != null) {
            ZipFile zipFile = new ZipFile(file);
            int n = zipFile.size();
            int n2 = 0;
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                ++n2;
                ZipEntry zipEntry = enumeration.nextElement();
                if (!zipEntry.isDirectory()) {
                    try {
                        InputStream inputStream = zipFile.getInputStream(zipEntry);
                        if (zipEntry.getName().endsWith("tree")) {
                            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                            documentBuilderFactory.setNamespaceAware(true);
                            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                            Document document = documentBuilder.parse(inputStream);
                            this.new = a_0.class().\u00d200000(document);
                        } else {
                            arrayList.addAll(a_0.class().super(inputStream));
                        }
                        inputStream.close();
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                propertyChangeSupport.firePropertyChange("value", new Integer(n), new Integer(n2));
            }
            zipFile.close();
            fileInputStream.close();
        }
        this.\u00d300000 = a_0.class().super();
        return arrayList;
    }

    public void o00000(File file, ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, TreePath treePath) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            zipOutputStream.setLevel(9);
            try {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    object4 = arrayList.get(i2);
                    object2 = object3 = "held_" + object4.\u00f4o0000() + "_" + I.o00000(object4.\u00f5o0000()) + ".xml";
                    object = new ZipEntry((String)object2);
                    zipOutputStream.putNextEntry((ZipEntry)object);
                    a_0.class().super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object4, zipOutputStream);
                    zipOutputStream.closeEntry();
                }
                String string = "held.xml.tree";
                object4 = string;
                object3 = new ZipEntry((String)object4);
                zipOutputStream.putNextEntry((ZipEntry)object3);
                object2 = a_0.class().super(treePath);
                object = TransformerFactory.newInstance();
                Transformer transformer = ((TransformerFactory)object).newTransformer();
                transformer.setOutputProperty("indent", "yes");
                transformer.setOutputProperty("standalone", "yes");
                transformer.setOutputProperty("encoding", "UTF-8");
                DOMSource dOMSource = new DOMSource((Node)object2);
                StreamResult streamResult = new StreamResult(zipOutputStream);
                transformer.transform(dOMSource, streamResult);
                zipOutputStream.closeEntry();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                zipOutputStream.finish();
                zipOutputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public void o00000(File file, File file2, File file3) {
        String string = file3.getName();
        String string2 = file3.getAbsolutePath() + ".zip";
        if (!file.isFile() && !file.isDirectory()) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string2);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            zipOutputStream.setLevel(9);
            try {
                int n;
                if (file.getAbsolutePath().equalsIgnoreCase(string2)) {
                    return;
                }
                String string3 = string;
                FileInputStream fileInputStream = new FileInputStream(file);
                ZipEntry zipEntry = new ZipEntry(string3);
                zipOutputStream.putNextEntry(zipEntry);
                byte[] byArray = new byte[2048];
                while ((n = fileInputStream.read(byArray, 0, 2048)) != -1) {
                    zipOutputStream.write(byArray, 0, n);
                }
                zipOutputStream.closeEntry();
                if (file2.exists()) {
                    string3 = file2.getName();
                    fileInputStream = new FileInputStream(file2);
                    ZipEntry zipEntry2 = new ZipEntry(string3);
                    zipOutputStream.putNextEntry(zipEntry2);
                    byArray = new byte[2048];
                    while ((n = fileInputStream.read(byArray, 0, 2048)) != -1) {
                        zipOutputStream.write(byArray, 0, n);
                    }
                    zipOutputStream.closeEntry();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                zipOutputStream.finish();
                zipOutputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}

