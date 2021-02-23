package reto.tecnico.questions;
import reto.tecnico.tasks.OpenUp;
import reto.tecnico.tasks.fillForm;
import reto.tecnico.userinterface.uTestPage;
import reto.tecnico.userinterface.completeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirmRegistration = Text.of(completeForm.CONFIRM_REGISTRATION).viewedBy(actor).asString();
        if (question.equals(confirmRegistration)){
            result = true;

        }else {
            result = false;
        }
        return result;
    }
}
