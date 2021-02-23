package reto.tecnico.tasks;

import reto.tecnico.userinterface.joinPage;
import reto.tecnico.model.retoTecnicoData;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Join implements Task {
    public static Join onthePague() {
        return Tasks.instrumented(Join.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(joinPage.LOGIN_BUTTON));
    }
}

