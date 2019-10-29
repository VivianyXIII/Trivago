package co.com.accenture.automation.trivagoreserve.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

    private PageObject pageTrivago;

    public OpenTheBrowser(PageObject pageTrivago) {

        this.pageTrivago = pageTrivago;
    }

    @Override
    @Step("{0} opens the browser on Trivago Home '#page' ")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(pageTrivago));
    }

    public static OpenTheBrowser on(PageObject pageTrivago) {

        return Tasks.instrumented(OpenTheBrowser.class, pageTrivago);
    }
}
