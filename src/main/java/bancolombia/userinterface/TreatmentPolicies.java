package bancolombia.userinterface;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TreatmentPolicies {
    public static final Target NOSOTROS = Target.the("Enter to ACERCA DE NOSOTROS")
            .located(By.id("header-nosotros"));
    public static final Target SERVICIOS = Target.the("Enter to SERVICES DE BANCOLOMBIA")
            .located(By.id("serv"));
    public static final Target PROVIDER = Target.the("Enter to PROVEEDORES")
            .located(By.xpath("//a[contains(text(), 'Proveedores')]"));
    public static final Target NAME_DOCUMENT = Target.the("Name of document")
            .located(By.xpath("//div[@id='wizard2']//div//div[3]//div//div[1]/div//h2"));
    public static final Target DOWNLOAD_DOCUMENT = Target.the("Document for download")
            .located(By.xpath("//div[@id='wizard2']//div//div[3]//div//div[1]//div//p[2]//a"));
    public static final Integer NUMBER_WINDOW = Serenity.getWebdriverManager().getActiveWebdriverCount();
}
