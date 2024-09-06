package org.repkg.parser;

import javax.xml.parsers.SAXParserFactory;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import org.repkg.packages.RepkgHandler;
import org.xml.sax.SAXException;

public class SaxParser {
    private SAXParserFactory factory;
    private SAXParser parser;
    private RepkgHandler handler;

    public SaxParser() throws ParserConfigurationException, SAXException {
        factory = SAXParserFactory.newInstance();
        parser = factory.newSAXParser();
        handler = new RepkgHandler();
    }

    public void parse(String xmlFile) throws IOException, SAXException {
        parser.parse(xmlFile, handler);
    }

    public RepkgHandler getHandler() {
        return handler;
    }
}
