package org.repkg.packages;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;


public class RepkgHandler extends DefaultHandler{
        private static final String PACKAGES = "packages";
        private static final String PACKAGE = "package";
        private static final String NAME = "packageName";
        private static final String VERSION = "version";
        private static final String SHA256 = "sha256";

        private Repkg repkg;
        private StringBuilder elementValue;

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (elementValue == null) {
                elementValue = new StringBuilder();
            } else {
                elementValue.append(ch, start, length);
            }
        }

        @Override
        public void startDocument() throws SAXException {
            repkg = new Repkg();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            switch(qName) {
                case PACKAGES:
                    repkg.setPackageVers(new ArrayList<>());
                    break;
                case PACKAGE:
                    repkg.getPackageVers().add(new PackageVer());
                    break;
                case NAME:
                    elementValue = new StringBuilder();
                    break;
                case VERSION:
                    elementValue = new StringBuilder();
                    break;
                case SHA256:
                    elementValue = new StringBuilder();
                    break;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            switch(qName) {
                case NAME:
                    latestPackageVer().setPackageName(elementValue.toString());
                    break;
                case VERSION:
                    latestPackageVer().setVersion(elementValue.toString());
                    break;
                case SHA256:
                    latestPackageVer().setSha256(elementValue.toString());
                    break;
            }
        }

        private PackageVer latestPackageVer() {
            List<PackageVer> packageVers = repkg.getPackageVers(); 
            int latestPackageVerIndex = packageVers.size() - 1;
            return packageVers.get(latestPackageVerIndex);
        }

        public Repkg getRepkg() {
            return repkg;
        }

}
