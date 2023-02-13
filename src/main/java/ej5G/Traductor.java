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

    public String leer(int i) {//Scanner
        Scanner in = new Scanner(System.in);
        if (i == 1) {// leer string
            String volver = in.nextLine();
            return volver;
        } else {// leer int
            String volver = "" + in.nextInt();
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

        if (traductor.containsKey(oldEngWord)) {

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
        } else {
            System.out.println("No hay esta palabra");
        }

    }

    public String makeTranslation(String word) {
        String volver = traductor.get(word);
        return volver;
    }

    public Collection<String> getListSpanish() {
        Collection<String> values = traductor.values();
        return values;
    }

    public Set<String> getListEnglish() {
        Set<String> values = traductor.keySet();
        return values;
    }

    @Override
    public String toString() {
        return "Traductor{" + "traductor=" + traductor + '}';
    }

    public static void main(String[] args) {
        Traductor test = new Traductor();
        for (int i = 0; i < 3; i++) {//crear 10 palabras
            test.addWord();
        }
        System.out.println(test.toString());//mostrar lista que tenemos
        System.out.println("-----------------------------------------");
        System.out.println(test.makeTranslation("apple"));//traducir palabra
        System.out.println("-----------------------------------------");
        test.eleminar();
        System.out.println(test.toString());//mostrar lista sin elemento que eleminamos
        System.out.println("-----------------------------------------");
        test.cambiar();
        System.out.println(test.toString());//mostrar lista con cambios
        System.out.println("-----------------------------------------");
        System.out.println(test.getListSpanish());//lista palabras espanol
        System.out.println(test.getListEnglish());//lista palabras ingles
    }
}
