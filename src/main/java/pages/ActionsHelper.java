package pages;

import com.microsoft.playwright.Locator;

import java.util.function.Consumer;
import java.util.function.Predicate;

public final class ActionsHelper {

    private ActionsHelper(){};

    public static void perform(Locator element,Predicate<Locator> predicate, Consumer<Locator> elementConsumer){
        elementConsumer.accept(element);
    }

}
