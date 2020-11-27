package geco;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGeneratorTest extends TestCase {
    private PasswordGenerator pw;
    @Before
    public void setUp() throws Exception {
        pw = new PasswordGenerator("");
    }

    @Test
    public void testGetRandomPassword() {
        assertEquals(8,pw.getRandomPassword().length());
    }
}