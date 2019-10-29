package co.com.accenture.automation.trivagoreserve.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ReserveTrivago extends PageObject {

    public static final Target INPUT_CITY_DESTINATION = Target.the("Input city destination").located(By.xpath("//*[@id=\"querytext\"]"));
    public static final Target CHOOSE_SOURCE_CITY = Target.the("Select the source city").located(By.xpath("//*[@class=\"input shadowtext\"]"));
    public static final Target INPUT_ARRIVAL_DATE = Target.the("Input arrival date").located(By.xpath("//*[@class=\"dealform-button__text-wrapper\"]"));
    public static final Target CHOOSE_SOURCE_ARRIVAL_DATE = Target.the("Select the source city").located(By.xpath("//*[@datetime=\"2019-12-24\"]"));
    public static final Target INPUT_DEPARTURE_DATE = Target.the("Input departure date").located(By.xpath("//*[@class=\"dealform-button__text-wrapper\"]"));
    public static final Target CHOOSE_SOURCE_DEPARTURE_DATE = Target.the("Source departure date").located(By.xpath("//*[@datetime=\"2019-12-31\"]"));
    public static final Target INPUT_SELECT_ROOM = Target.the("Input select room").located(By.xpath("//*[@class=\"flex\"]"));
    public static final Target SEARCH_BUTTON = Target.the("Select the search button").located(By.xpath("//*[@class=\"icon-ic search-button__icon icon-center icon-contain\"]"));
}



