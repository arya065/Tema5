package ej5G;

import java.util.*;

public class Traductor {

    HashMap<String, String> traductor;// espanol-key; ingles-value

    public Traductor() {
        this.traductor = new HashMap<>();
    }

    public void addWord() {
        int i = 1;
        String palabraEspanol = leerString(i);
        i++;
        String palabraIngles = leerString(i);
        traductor.put(palabraEspanol, palabraIngles);
    }

    public String leerString(int i) {
        Scanner in = new Scanner(System.in);
        if (i == 1) {
            System.out.print("Introduce palabra en espanol");
            String volver = in.nextLine();
            return volver;
        } else {
            System.out.println("Introduce palabra en ingles");
            String volver = in.nextLine();
            return volver;
        }
    }

    public void eleminar() {

    }

    public void cambiar() {

    }

    public void makeTranslation() {

    }

    public void getListSpanish() {

    }

    public void getListEnglish() {

    }

    public static void main(String[] args) {
        /*
        Создайте класс, содержащий main () и 10 записей в вашем переводчике. Попробуйте применяемые методы.
         */
        System.out.println("helloworld");
    }
}
