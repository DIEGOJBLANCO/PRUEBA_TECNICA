package reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class completeForm {
    public static final Target INPUT_FIRSTNAME          = Target.the("where do we write the name").located(By.xpath("//*[@id='firstName']"));
    public static final Target INPUT_LASTTNAME          = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL              = Target.the("where do we write the email").located(By.xpath("//*[@id='email']"));
    public static final Target INPUT_MONTH              = Target.the("where do we write the birthMonth").located(By.id("birthMonth"));
    public static final Target INPUT_DAY                = Target.the("where do we write the birthDay").located(By.id("birthDay"));
    public static final Target INPUT_YEAR               = Target.the("where do we write the birthYear").located(By.id("birthYear"));
    public static final Target LANGUAGE                 = Target.the("where do we write the language").located(By.xpath("//*[@type='search']"));
    public static final Target NEXT_BUTTON              = Target.the("Button for next page").located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_CITY               = Target.the("where do we write the city").located(By.xpath("//*[@id='city']"));
    public static final Target INPUT_POSTAL_CODE        = Target.the("where do we write the postal code").located(By.xpath("//*[@id='zip']"));
    public static final Target INPUT_COUNTRY            = Target.the("where do we write the country").located(By.xpath("//*[@id='country']"));
    public static final Target NEXT_BUTTON2             = Target.the("Button for next page").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target INPUT_PASSWORD           = Target.the("where do we write the password").located(By.xpath("//*[@id='password']"));
    public static final Target INPUT_CONFIRM_PASSWORD   = Target.the("where do we confirm the password").located(By.xpath("//*[@id='confirmPassword']"));
    public static final Target ACCEPT_TERMS             = Target.the("where do we accept the terms").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_PRIVACY           = Target.the("where do we accept the terms of privacy").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_COMPLETE           = Target.the("").located(By.xpath("//*[@id='laddaBtn']"));
    public static final Target CONFIRM_REGISTRATION     = Target.the("").located(By.xpath("//h1"));
}
