
import org.testng.Assert;
import org.testng.annotations.Test;

import page.Login;
import service.UserCreator;
import test.CommonConditions;

public class LoginTest extends CommonConditions {

    @Test
    public void Login() {
        var user = UserCreator.withCredentialsFromProperty();
        var login = new Login(driver);

        login.openPage();
        login.putLoginData(user);
        var loginUnsuccess = login.loginClick();

        Assert.assertTrue(loginUnsuccess);
    }

}