package nl.ru.languageininteraction.synaesthesia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GraphemeColour implements EntryPoint {

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
        final RootLayoutPanel widgetTag = RootLayoutPanel.get();
        widgetTag.getElement().setId("widgetTag");
        final AppController appController = new AppController(widgetTag);
        appController.start();
    }
}
