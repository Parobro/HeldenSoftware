/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenxmlplugin;

import helden.Version;
import helden.framework.Einstellungen;
import helden.framework.oooo.return_0;
import helden.gui.return;
import helden.plugin.datenxmlplugin.DatenAustausch3Impl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XMLPluginViaTCPIP
implements Runnable {
    private boolean super;
    private Socket \u00d300000 = null;
    private return \u00d200000;

    public XMLPluginViaTCPIP(return return_) {
        this.\u00d200000 = return_;
        this.super = true;
    }

    public XMLPluginViaTCPIP(Socket socket, return return_) {
        this.\u00d200000 = return_;
        this.super = false;
        this.\u00d300000 = socket;
    }

    public void handle() throws IOException {
        String string;
        DatenAustausch3Impl datenAustausch3Impl = new DatenAustausch3Impl(this.\u00d200000);
        String string2 = "";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.\u00d300000.getOutputStream(), "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter, true);
        printWriter.append("<start  heldenfullversion=\"" + Version.getVersion() + "\" " + " heldenversion=\"" + Version.getSoftwareVersion() + "\" " + "/>" + '\u0000');
        printWriter.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.\u00d300000.getInputStream(), "UTF-8"));
        String string3 = "\u0000";
        while ((string = bufferedReader.readLine()) != null) {
            string2 = string2 + string + '\n';
            while (string2.contains(string3)) {
                Document document;
                String string4 = string2.substring(0, string2.indexOf(string3));
                string2 = string4.length() == string2.length() ? "" : string2.substring(string2.indexOf(string3) + 1);
                try {
                    document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(string4)));
                }
                catch (Exception exception) {
                    this.o00000(printWriter, this.o00000("XML-Error: " + exception.getMessage() + "\n" + string4));
                    continue;
                }
                Object object = datenAustausch3Impl.exec(document);
                if (object instanceof Document) {
                    this.o00000(printWriter, (Document)object);
                    continue;
                }
                this.o00000(printWriter, this.o00000("No XML-Result"));
            }
        }
    }

    public void makeSocket() {
        try {
            Socket socket;
            ServerSocket serverSocket = new ServerSocket();
            if (Einstellungen.getInstance().getPortNummer() == 0) {
                serverSocket.bind(new InetSocketAddress("127.0.0.1", 0));
            } else {
                serverSocket.bind(new InetSocketAddress("0.0.0.0", Einstellungen.getInstance().getPortNummer()));
            }
            return_0.o00000("helden4_1.plugintcpip", "" + serverSocket.getLocalPort());
            while ((socket = serverSocket.accept()) != null) {
                Thread thread = new Thread(new XMLPluginViaTCPIP(socket, this.\u00d200000));
                thread.start();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    @Override
    public void run() {
        if (this.super) {
            this.makeSocket();
        } else {
            try {
                this.handle();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private void o00000(PrintWriter printWriter, Document document) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty("standalone", "yes");
            transformer.setOutputProperty("encoding", "UTF-8");
            DOMSource dOMSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(printWriter);
            transformer.transform(dOMSource, streamResult);
            printWriter.print("\u0000");
            printWriter.flush();
        }
        catch (TransformerConfigurationException transformerConfigurationException) {
            transformerConfigurationException.printStackTrace();
        }
        catch (TransformerException transformerException) {
            transformerException.printStackTrace();
        }
    }

    private Document o00000(String string) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
            Element element = document.createElement("error");
            document.appendChild(element);
            element.setAttribute("msg", string);
            return document;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

