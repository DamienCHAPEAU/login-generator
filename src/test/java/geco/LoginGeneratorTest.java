package geco;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest extends TestCase {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(this.loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        //CT1
        loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(loginService.loginExists("PDUR"));
    }

}