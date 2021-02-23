package reto.tecnico.tasks;

import reto.tecnico.model.retoTecnicoData;
import reto.tecnico.userinterface.completeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class fillForm implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String year;
    private String language;
    private String Postal_Code;
    private String Country;
    private String City;
    private String password;

    public fillForm (String firstName, String lastName, String email, String birthMonth, String birthDay, String year, String language, String Postal_Code, String Country,String City, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.year = year;
        this.language = language;
        this.Postal_Code = Postal_Code;
        this.Country = Country;
        this.City = City;
        this.password = password;

}

    public static fillForm the(){
        return Tasks.instrumented(fillForm.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(completeForm.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(completeForm.INPUT_LASTTNAME),
                Enter.theValue(email).into(completeForm.INPUT_EMAIL),
                Enter.theValue(birthMonth).into(completeForm.INPUT_MONTH),
                Enter.theValue(birthDay).into(completeForm.INPUT_DAY),
                Enter.theValue(year).into(completeForm.INPUT_YEAR),
                Enter.theValue(language).into(completeForm.LANGUAGE),
                Click.on(completeForm.NEXT_BUTTON),
                Enter.theValue(City).into(completeForm.INPUT_CITY),
                Enter.theValue(Postal_Code).into(completeForm.INPUT_POSTAL_CODE),
                Enter.theValue(Country).into(completeForm.INPUT_COUNTRY),
                Click.on(completeForm.NEXT_BUTTON2),
                Enter.theValue(password).into(completeForm.INPUT_PASSWORD),
                Enter.theValue(password).into(completeForm.INPUT_CONFIRM_PASSWORD),
                Click.on(completeForm.ACCEPT_TERMS),
                Click.on(completeForm.ACCEPT_PRIVACY),
                Click.on(completeForm.ENTER_COMPLETE)

                );

    }
}
