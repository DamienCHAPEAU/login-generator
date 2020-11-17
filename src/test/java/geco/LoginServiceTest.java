package geco;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;

//Classe de Test Login service
public class LoginServiceTest extends TestCase {

    private LoginService loginsExistants;

    @Before
    public void setUp() throws Exception {
        loginsExistants = new LoginService(new String[]{"Login1","Login2"});
    }

    public void testLoginExists() {
        assertTrue(loginsExistants.loginExists("Login1"));
        assertFalse(loginsExistants.loginExists("Login6"));
    }

    public void testAddLogin() {
        loginsExistants.addLogin("Login3");
        assertTrue(loginsExistants.loginExists("Login3"));
    }

    public void testFindAllLoginsStartingWith() {
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"Login1", "Login2"})),loginsExistants.findAllLoginsStartingWith("Login"));
    }

    public void testFindAllLogins() {
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"Login1", "Login2"})),loginsExistants.findAllLogins());
    }
}
