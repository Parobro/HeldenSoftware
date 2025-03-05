/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E;

import helden.Version;
import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.J;
import helden.framework.held.Object.return;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.held.persistenz.XMLPersistierer;
import helden.framework.oooo.a_0;
import helden.framework.oooo.string_0;
import helden.gui.A;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO {
    public static final String[] \u00d400000 = new String[]{"Nichts zu tun", "lokale Kopie aktualisieren", "Online-Kopie aktualisieren", "Online-Kopie entfernen"};
    private static OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d500000;
    private static XMLParser new;
    private String \u00d300000;
    private HashMap<String, _o> o00000 = new HashMap();

    public static OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000() {
        if (\u00d500000 == null) {
            \u00d500000 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO();
            new = new XMLParser(null);
        }
        return \u00d500000;
    }

    public static Document new(String string) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputSource inputSource = new InputSource();
        inputSource.setCharacterStream(new StringReader(string));
        return documentBuilder.parse(inputSource);
    }

    public static String o00000(Document document) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes");
            StreamResult streamResult = new StreamResult(new StringWriter());
            DOMSource dOMSource = new DOMSource(document);
            transformer.transform(dOMSource, streamResult);
            return streamResult.getWriter().toString();
        }
        catch (Exception exception) {
            System.out.println(exception);
            return "";
        }
    }

    private OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO() {
    }

    public void o00000(return return_) {
        return_.o00000("user", Einstellungen.getInstance().getUsername());
        return_.o00000("pwd", Einstellungen.getInstance().getUserpasswort());
    }

    public Document \u00d400000() throws IOException, SAXException, ParserConfigurationException {
        String string;
        return return_ = new return();
        this.new();
        HttpURLConnection httpURLConnection = this.o00000(this.\u00d300000);
        return_.new("82427281316627396682025187190");
        return_.o00000("action", "tokens");
        return_.o00000("subaction", "listtoken");
        this.o00000(return_);
        httpURLConnection.setRequestProperty("Content-Type", return_.new());
        OutputStream outputStream = httpURLConnection.getOutputStream();
        return_.o00000(outputStream);
        outputStream.close();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        String string2 = "";
        while ((string = bufferedReader.readLine()) != null) {
            string2 = string2 + string;
        }
        bufferedReader.close();
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(string2);
    }

    public String return(String string) throws Exception {
        return this.o00000("action", "tokens", "subaction", "createauthtoken", "rechteid", "1", "beschreibung", string);
    }

    public String \u00f400000(String string) throws Exception {
        return this.o00000("action", "held", "subaction", "delete", "heldenid", string);
    }

    public void \u00d300000(String string) throws Exception {
        this.o00000("action", "tokens", "subaction", "delauthtoken", "zuloeschen", string);
    }

    public void \u00d300000() {
        TrustManager[] trustManagerArray = new TrustManager[]{new X509TrustManager(){

            @Override
            public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArray, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public String new(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) throws Exception {
        String string = null;
        try {
            string = this.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        catch (Exception exception) {
            return "ERROR XML-Darstellung des Helden";
        }
        ArrayList<String> arrayList = string_0.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000(), A.\u00d4O0000());
        String[] stringArray = new String[6 + arrayList.size() * 2 + 10];
        int n = 0;
        stringArray[n++] = "action";
        stringArray[n++] = "held";
        stringArray[n++] = "subaction";
        stringArray[n++] = "upload";
        stringArray[n++] = "held";
        stringArray[n++] = string;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            stringArray[n++] = "gruppenname" + i2;
            stringArray[n++] = arrayList.get(i2);
        }
        stringArray[n++] = "cfg_rsmodell";
        stringArray[n++] = Einstellungen.getInstance().getSeitenEinstellungen(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()).isZonenRuestung() ? "zone" : "einfach";
        stringArray[n++] = "cfg_geldkreise";
        stringArray[n++] = "" + Einstellungen.getInstance().isGeldKreiseDrucken();
        stringArray[n++] = "cfg_metatalente";
        stringArray[n++] = "" + Einstellungen.getInstance().isMetaTalenteAusgebe();
        stringArray[n++] = "cfg_zauberquellen";
        stringArray[n++] = "" + Einstellungen.getInstance().isZauberQuelledrucken();
        stringArray[n++] = "cfg_namenaufseiten";
        stringArray[n++] = "" + Einstellungen.getInstance().isNamenAufSeiteDrucken();
        return this.o00000(stringArray);
    }

    public void return() throws Exception {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public _o \u00d500000(String string) {
        _o _o2 = this.o00000.get(string);
        if (_o2 == null) {
            return _o.\u00d400000;
        }
        return _o2;
    }

    public K \u00d800000(String string) throws IOException, SAXException, ParserConfigurationException {
        Document document = this.\u00d400000(string);
        ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new.ladeHelden(document, null);
        if (arrayList.size() != 1) {
            throw new RuntimeException("Held " + string + " nicht gefunden!");
        }
        K k2 = (K)arrayList.get(0);
        k2.ifnew().o00000(false);
        return k2;
    }

    public Document \u00d400000(String string) throws IOException, SAXException, ParserConfigurationException {
        String string2;
        return return_ = new return();
        this.new();
        HttpURLConnection httpURLConnection = this.o00000(this.\u00d300000);
        return_.new("82427281316627396682025187190");
        return_.o00000("action", "returnheld");
        return_.o00000("format", "heldenxml");
        return_.o00000("heldenid", string);
        this.o00000(return_);
        httpURLConnection.setRequestProperty("Content-Type", return_.new());
        OutputStream outputStream = httpURLConnection.getOutputStream();
        return_.o00000(outputStream);
        outputStream.close();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        String string3 = "";
        while ((string2 = bufferedReader.readLine()) != null) {
            string3 = string3 + string2;
        }
        bufferedReader.close();
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(string3);
    }

    public Document \u00d500000() throws Exception {
        String string = this.o00000("action", "listhelden");
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(string);
    }

    public String \u00f400000() {
        return this.\u00d300000;
    }

    public Document \u00d800000() throws IOException, SAXException, ParserConfigurationException {
        String string;
        return return_ = new return();
        this.new();
        HttpURLConnection httpURLConnection = this.o00000(this.\u00d300000);
        return_.new("82427281316627396682025187190");
        return_.o00000("action", "tokens");
        return_.o00000("subaction", "listtoken");
        this.o00000(return_);
        httpURLConnection.setRequestProperty("Content-Type", return_.new());
        OutputStream outputStream = httpURLConnection.getOutputStream();
        return_.o00000(outputStream);
        outputStream.close();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        String string2 = "";
        while ((string = bufferedReader.readLine()) != null) {
            string2 = string2 + string;
        }
        bufferedReader.close();
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(string2);
    }

    public HttpURLConnection o00000(String string) throws IOException {
        try {
            this.return();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (string.contains("https://localhost:")) {
            this.\u00d300000();
        }
        URL uRL = new URL(string);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        if (Einstellungen.getInstance().getProxyVerwenden() && Einstellungen.getInstance().getProxyAuthentifikation()) {
            String string2 = Einstellungen.getInstance().getProxyUser() + ":" + Einstellungen.getInstance().getProxyPwd();
            httpURLConnection.addRequestProperty("Proxy-Authorization", "Basic " + J.o00000(new String(string2.getBytes("UTF-8"))));
        }
        httpURLConnection.setAllowUserInteraction(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.addRequestProperty("User-Agent", "Helden-Software V" + Version.getVersion());
        httpURLConnection.addRequestProperty("Content-Encoding", "UTF-8");
        return httpURLConnection;
    }

    public String o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) throws ParserConfigurationException {
        XMLPersistierer xMLPersistierer = new XMLPersistierer();
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(xMLPersistierer.getHeldenXMLDocument(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2));
    }

    public String o00000(String ... stringArray) throws Exception {
        int n;
        String string = "";
        for (int i2 = 0; i2 < stringArray.length; i2 += 2) {
            if (!string.isEmpty()) {
                string = string + "&";
            }
            string = string + URLEncoder.encode(stringArray[i2], "UTF-8");
            string = string + "=";
            string = string + URLEncoder.encode(stringArray[i2 + 1], "UTF-8");
        }
        string = string + "&";
        string = string + URLEncoder.encode("user", "UTF-8");
        string = string + "=";
        string = string + URLEncoder.encode(Einstellungen.getInstance().getUsername(), "UTF-8");
        string = string + "&";
        string = string + URLEncoder.encode("pwd", "UTF-8");
        string = string + "=";
        string = string + URLEncoder.encode(Einstellungen.getInstance().getUserpasswort(), "UTF-8");
        this.new();
        HttpURLConnection httpURLConnection = this.o00000(this.\u00d300000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(string.length()));
        httpURLConnection.addRequestProperty("User-Agent", "Helden-Software V" + Version.getVersion());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF8");
        outputStreamWriter.write(string);
        outputStreamWriter.flush();
        StringWriter stringWriter = new StringWriter();
        char[] cArray = new char[1024];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        while ((n = bufferedReader.read(cArray)) != -1) {
            ((Writer)stringWriter).write(cArray, 0, n);
        }
        outputStreamWriter.close();
        ((Reader)bufferedReader).close();
        return ((Object)stringWriter).toString();
    }

    public String o00000(String string, String string2, String string3) throws IOException {
        String string4;
        return return_ = new return();
        this.new();
        HttpURLConnection httpURLConnection = this.o00000(this.\u00d300000);
        return_.new("82427281316627396682025187190");
        return_.o00000("action", "createaccount");
        return_.o00000("accountname", string);
        return_.o00000("email", string2);
        return_.o00000("password", string3);
        httpURLConnection.setRequestProperty("Content-Type", return_.new());
        OutputStream outputStream = httpURLConnection.getOutputStream();
        return_.o00000(outputStream);
        outputStream.close();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        String string5 = "";
        while ((string4 = bufferedReader.readLine()) != null) {
            string5 = string5 + string4;
        }
        bufferedReader.close();
        return string5;
    }

    public void o00000(String string, _o _o2) {
        if (!_o2.equals((Object)_o.\u00d400000)) {
            this.o00000.put(string, _o2);
        }
    }

    public void new(String string, String string2, String string3) throws Exception {
        String string4 = this.o00000("action", "held", "subaction", "listgruppen", "heldenid", string);
        Document document = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(string4);
        NodeList nodeList = a_0.new(document, "//gruppen/gruppe/gruppenname/text()");
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            String string5 = nodeList.item(i2).getNodeValue();
            string_0.o00000(string2, string5, string3);
        }
    }

    public void \u00f500000(String string) {
        this.\u00d300000 = string;
    }

    public void new() {
        Properties properties = System.getProperties();
        if (Einstellungen.getInstance().getProxyVerwenden()) {
            properties.put("proxyHost", Einstellungen.getInstance().getProxyServer());
            properties.put("proxyPort", Einstellungen.getInstance().getProxyPort());
            properties.put("proxySet", "" + Einstellungen.getInstance().getProxyVerwenden());
        } else {
            properties.put("proxySet", "" + Einstellungen.getInstance().getProxyVerwenden());
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum _o {
        o00000("Synchronisieren"),
        \u00d500000("nicht hochladen"),
        \u00d400000("nichts festelegt");

        private String new;

        public static _o o00000(String string) {
            for (_o _o2 : _o.values()) {
                if (!_o2.toString().equals(string)) continue;
                return _o2;
            }
            return null;
        }

        private _o(String string2) {
            this.new = string2;
        }

        public String toString() {
            return this.new;
        }
    }
}

