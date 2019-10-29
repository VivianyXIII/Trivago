package co.com.accenture.automation.trivagoreserve.tasks;

import co.com.accenture.automation.trivagoreserve.userinterfaces.ReserveTrivago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class GoTo implements Task {

    private List<List<String>> data;

    public GoTo(List<List<String>> data) {

        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo((Click.on(ReserveTrivago.INPUT_CITY_DESTINATION)),
                        Enter.theValue(data.get(1).get(0)).into(ReserveTrivago.CHOOSE_SOURCE_CITY),
                        Click.on(ReserveTrivago.INPUT_ARRIVAL_DATE),
                        Click.on(ReserveTrivago.CHOOSE_SOURCE_ARRIVAL_DATE.of(data.get(1).get(2))),
                        Click.on(ReserveTrivago.INPUT_DEPARTURE_DATE),
                        Click.on(ReserveTrivago.CHOOSE_SOURCE_DEPARTURE_DATE.of(data.get(1).get(2))),
                        Click.on(ReserveTrivago.INPUT_SELECT_ROOM),
                        Click.on(ReserveTrivago.SEARCH_BUTTON));
    }

    public static GoTo thePage(List<List<String>> data) {

        return Tasks.instrumented(GoTo.class, data);
    }
}
