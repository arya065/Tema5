package ej5G;

import java.util.*;

public class Traductor {

    HashMap<String, String> traductor;// espanol-key; ingles-value

    public Traductor() {
        this.traductor = new HashMap<>();
    }

    public void addWord() {
        System.out.println("Introduce palabra en espanol");
        String palabraEspanol = leer(1);
        System.out.println("Introduce palabra en ingles");
        String palabraIngles = leer(1);
        traductor.put(palabraIngles, palabraEspanol);
    }

    public String leer(int i) {
        Scanner in = new Scanner(System.in);
        if (i == 1) {// leer string
            String volver = in.nextLine();
//            in.next();
            return volver;
        } else {// leer int
            String volver = "" + in.nextInt();
//            in.next();
            return volver;
        }

    }

    public void eleminar() {
        System.out.println("Introduce palabra en ingles que quieres eliminar");
        String engWord = leer(1);
        traductor.remove(engWord);
    }

    public void cambiar() {
        boolean error = true;
        System.out.println("Introduce palabra en ingles que quieres cambiar");
        String oldEngWord = leer(1);

        while (error) {
            System.out.println("""
                           Introduce que palabra quieres cambiar
                           1 - Cambiar palabra ingles
                           2 - Cambiar palabra espanol
                           """);
            String option = leer(0);

            if (option.equalsIgnoreCase("1")) {
                error = false;
                String oldSpWord = traductor.get(oldEngWord);
                System.out.println("Introduce palabra en ingles");
                String newEngWord = leer(1);
                traductor.remove(oldEngWord);
                traductor.put(newEngWord, oldSpWord);
            } else if (option.equalsIgnoreCase("2")) {
                error = false;
                System.out.println("Introduce palabra en espanol");
                String newSpWord = leer(1);
                traductor.replace(oldEngWord, newSpWord);
            } else {
                System.out.println("Introduce opcion correcto");
                error = true;
            }
        }

    }

    public String makeTranslation(String word, int option) {
        if (option == 1) {// traducion de eng a esp
            String volver = traductor.get(word);
            return volver;
        } else {// traducion de esp a eng
//            String volver = traductor.ge
            return "error";
        }
    }

    public void getListSpanish() {
        Collection<String> values = traductor.values();
        System.out.println(values);
    }

    public void getListEnglish() {
        Set<String> values = traductor.keySet();
        System.out.println(values);
    }

    @Override
    public String toString() {
        return "Traductor{" + "traductor=" + traductor + '}';
    }
    
    public static void main(String[] args) {
        /*
        Создайте класс, содержащий main () и 10 записей в вашем переводчике. Попробуйте применяемые методы.
         */
        Traductor test = new Traductor();
        test.addWord();
        test.addWord();
        test.addWord();
        test.addWord();
        System.out.println(test.toString());

//        test.eleminar();
//        System.out.println(test.toString());
//        
//        test.cambiar();
//        System.out.println(test.toString());
        test.getListSpanish();
        test.getListEnglish();
    }
}
