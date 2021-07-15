package bancolombia.question;

import bancolombia.model.SearchData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import org.w3c.dom.Attr;

import java.util.List;

import static bancolombia.userinterface.TreatmentPolicies.*;

public class Validating implements Question<Boolean> {
    public Validating(List<SearchData> searchData) {
        this.searchData = searchData;
    }
    List<SearchData> searchData;
    public static Validating theDocument(List<SearchData> searchData) {
        return new Validating(searchData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameDocument = Text.of(NAME_DOCUMENT).viewedBy(actor).asString();
        if (searchData.get(0).getTitle().equals(nameDocument)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
