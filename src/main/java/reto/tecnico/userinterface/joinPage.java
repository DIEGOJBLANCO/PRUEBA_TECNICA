package reto.tecnico.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class joinPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to register").located(By.className("unauthenticated-nav-bar__sign-up"));
}
