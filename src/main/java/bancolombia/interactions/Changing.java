package bancolombia.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;



public class Changing implements Interaction{

    private Integer numWinodw;
    public Changing(Integer numWinodw) {
        this.numWinodw = numWinodw;
    }


    public static Changing theWindow(Integer numWinodw) {
        return new Changing(numWinodw);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> allWindows = Serenity.getWebdriverManager().getWebdriver().getWindowHandles();
        Integer intW = 0;
        for (String curWindow : allWindows){
            intW = intW +1;
            if (intW == numWinodw){
                Serenity.getWebdriverManager().getWebdriver().switchTo().window(curWindow);
                break;
            }
        }
    }
}
