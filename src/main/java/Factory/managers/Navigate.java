package Factory.managers;

import Factory.config.ConfigClass;

public class Navigate {

    private static final String URL = ConfigClass.getConfig().url();

    public static void launchUrl() {
        PlayManager.getPage().navigate(URL);
        PlayManager.getPage().setViewportSize(1720,1420);
    }
}

