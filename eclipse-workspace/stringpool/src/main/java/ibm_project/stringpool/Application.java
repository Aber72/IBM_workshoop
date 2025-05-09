
package ibm_project.stringpool;

import java.util.Locale;

public class Application {

    public static void main(String[] args) {
        // Get the default locale
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: " + locale.getDisplayName());

        // Get the locale for a specific country and language
        Locale frenchLocale = new Locale("fr", "FR");
        System.out.println("French Locale: " + frenchLocale.getDisplayName());

        // Get the locale for a specific language
        Locale englishLocale = new Locale("en");
        System.out.println("English Locale: " + englishLocale.getDisplayName());

        // Get the locale for a specific country
        Locale usaLocale = new Locale("", "US");
        System.out.println("USA Locale: " + usaLocale.getDisplayName());
    }
}
