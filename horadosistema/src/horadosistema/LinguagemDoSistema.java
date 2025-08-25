package horadosistema;

import java.util.Locale;
public class LinguagemDoSistema {
    public static void main(String[] args) {
        Locale lingua = Locale.getDefault();
        System.out.println("A linguagem do sistema é");
        System.out.println(lingua.getDisplayLanguage());
    }
}
