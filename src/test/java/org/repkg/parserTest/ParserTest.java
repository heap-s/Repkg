package org.repkg.parserTest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.repkg.parser.SaxParser;
import org.repkg.packages.Repkg;
import org.repkg.packages.PackageVer;

import java.util.List;

public class ParserTest {

    @Test
    public void testParseTestConfig() throws Exception {
        SaxParser parser = new SaxParser();
        parser.parse("src/test/java/org/repkg/configs/testconfig.xml");
        Repkg repkg = parser.getHandler().getRepkg();
        
        List<PackageVer> packages = repkg.getPackageVers();
        assertEquals(2, packages.size());

        PackageVer package1 = packages.get(0);
        assertEquals("test-package", package1.getPackageName());
        assertEquals("1.0.0", package1.getVersion());
        assertEquals("abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890", package1.getSha256());
        assertEquals("https://example.com/test-package-1.0.0.tar.gz", package1.getUrl());

        PackageVer package2 = packages.get(1);
        assertEquals("another-package", package2.getPackageName());
        assertEquals("2.1.3", package2.getVersion());
        assertEquals("0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef", package2.getSha256());
        assertEquals("https://example.com/another-package-2.1.3.tar.gz", package2.getUrl());
    }
}
