/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Collections;
import javax.xml.crypto.AlgorithmMethod;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.KeySelectorResult;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SigTool {
    private static SigTool super;
    private byte[] class = new byte[]{48, -127, -15, 48, -127, -88, 6, 7, 42, -122, 72, -50, 56, 4, 1, 48, -127, -100, 2, 65, 0, -4, -90, -126, -50, -114, 18, -54, -70, 38, -17, -52, -9, 17, 14, 82, 109, -80, 120, -80, 94, -34, -53, -51, 30, -76, -94, 8, -13, -82, 22, 23, -82, 1, -13, 91, -111, -92, 126, 109, -10, 52, 19, -59, -31, 46, -48, -119, -101, -51, 19, 42, -51, 80, -39, -111, 81, -67, -60, 62, -25, 55, 89, 46, 23, 2, 21, 0, -106, 46, -35, -52, 54, -100, -70, -114, -69, 38, 14, -26, -74, -95, 38, -39, 52, 110, 56, -59, 2, 64, 103, -124, 113, -78, 122, -100, -12, 78, -23, 26, 73, -59, 20, 125, -79, -87, -86, -14, 68, -16, 90, 67, 77, 100, -122, -109, 29, 45, 20, 39, 27, -98, 53, 3, 11, 113, -3, 115, -38, 23, -112, 105, -77, 46, 41, 53, 99, 14, 28, 32, 98, 53, 77, 13, -94, 10, 108, 65, 110, 80, -66, 121, 76, -92, 3, 68, 0, 2, 65, 0, -71, 90, -17, 90, 76, -56, 109, 71, 75, -20, 79, 52, 2, 32, -12, 60, -112, -41, -36, 41, 52, 109, -26, 57, 74, -43, -23, -41, 0, -64, 3, 95, -34, 62, -105, -90, 119, -86, -45, 4, -41, 124, 98, -128, -77, 58, -117, -51, -83, 125, 53, -23, -125, 28, 77, 40, -114, -120, 76, 76, -31, 21, -83, 36};
    private byte[] \u00d400000 = new byte[]{48, -127, -58, 2, 1, 0, 48, -127, -88, 6, 7, 42, -122, 72, -50, 56, 4, 1, 48, -127, -100, 2, 65, 0, -4, -90, -126, -50, -114, 18, -54, -70, 38, -17, -52, -9, 17, 14, 82, 109, -80, 120, -80, 94, -34, -53, -51, 30, -76, -94, 8, -13, -82, 22, 23, -82, 1, -13, 91, -111, -92, 126, 109, -10, 52, 19, -59, -31, 46, -48, -119, -101, -51, 19, 42, -51, 80, -39, -111, 81, -67, -60, 62, -25, 55, 89, 46, 23, 2, 21, 0, -106, 46, -35, -52, 54, -100, -70, -114, -69, 38, 14, -26, -74, -95, 38, -39, 52, 110, 56, -59, 2, 64, 103, -124, 113, -78, 122, -100, -12, 78, -23, 26, 73, -59, 20, 125, -79, -87, -86, -14, 68, -16, 90, 67, 77, 100, -122, -109, 29, 45, 20, 39, 27, -98, 53, 3, 11, 113, -3, 115, -38, 23, -112, 105, -77, 46, 41, 53, 99, 14, 28, 32, 98, 53, 77, 13, -94, 10, 108, 65, 110, 80, -66, 121, 76, -92, 4, 22, 2, 20, 28, -111, 23, -98, -91, -100, -64, -72, -72, -45, -127, -73, 0, 84, -118, -45, 9, 56, -85, -100};
    private KeyPair \u00d300000;
    private PublicKey \u00d600000;
    private PrivateKey \u00d200000;

    public static SigTool getInstance() {
        if (super == null) {
            try {
                super = new SigTool();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return super;
    }

    private SigTool() throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("DSA");
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(this.class);
        this.\u00d600000 = keyFactory.generatePublic(x509EncodedKeySpec);
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(this.\u00d400000);
        this.\u00d200000 = keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        this.\u00d300000 = new KeyPair(this.\u00d600000, this.\u00d200000);
    }

    public PublicKey getKey() {
        return this.\u00d600000;
    }

    public void sign(Document document) {
        try {
            XMLSignatureFactory xMLSignatureFactory = XMLSignatureFactory.getInstance("DOM");
            DOMSignContext dOMSignContext = new DOMSignContext(this.\u00d300000.getPrivate(), (Node)document.getDocumentElement());
            Reference reference = xMLSignatureFactory.newReference("", xMLSignatureFactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), Collections.singletonList(xMLSignatureFactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec)null)), null, null);
            SignedInfo signedInfo = xMLSignatureFactory.newSignedInfo(xMLSignatureFactory.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (C14NMethodParameterSpec)null), xMLSignatureFactory.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#dsa-sha1", null), Collections.singletonList(reference));
            KeyInfoFactory keyInfoFactory = xMLSignatureFactory.getKeyInfoFactory();
            KeyValue keyValue = keyInfoFactory.newKeyValue(this.\u00d300000.getPublic());
            KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(keyValue));
            XMLSignature xMLSignature = xMLSignatureFactory.newXMLSignature(signedInfo, keyInfo);
            xMLSignature.sign(dOMSignContext);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public VerfiyStatus verify(Document document) {
        NodeList nodeList = document.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
        if (nodeList.getLength() == 0) {
            return VerfiyStatus.\u00d300000;
        }
        try {
            _o _o2 = new _o();
            DOMValidateContext dOMValidateContext = new DOMValidateContext(_o2, nodeList.item(0));
            XMLSignatureFactory xMLSignatureFactory = XMLSignatureFactory.getInstance("DOM");
            XMLSignature xMLSignature = xMLSignatureFactory.unmarshalXMLSignature(dOMValidateContext);
            if (xMLSignature.validate(dOMValidateContext)) {
                return VerfiyStatus.\u00d200000;
            }
            return VerfiyStatus.\u00d400000;
        }
        catch (Exception exception) {
            return VerfiyStatus.\u00d400000;
        }
    }

    private class _o
    extends KeySelector {
        private _o() {
        }

        @Override
        public KeySelectorResult select(KeyInfo keyInfo, KeySelector.Purpose purpose, AlgorithmMethod algorithmMethod, XMLCryptoContext xMLCryptoContext) throws KeySelectorException {
            return new KeySelectorResult(){

                @Override
                public Key getKey() {
                    return SigTool.getInstance().getKey();
                }
            };
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum VerfiyStatus {
        \u00d300000,
        \u00d200000,
        \u00d400000;

    }
}

