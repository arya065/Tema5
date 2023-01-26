package collections;

import java.util.*;

public class OrdenacionBusqueda {

    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dólar Americano"));
        paises.add(new Pais("Vietnam", 46, 505_400, "Euro"));

        paises.forEach(System.out::println);
        System.out.println("--------------");
        // Ordenación usando orden natural (requiere que Pais implemente Comparable)
        Collections.sort(paises);
        paises.forEach(System.out::println);

        // Ordenación usando comparator (proporcionamos el criterio
        // mediante una lambda)
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());

        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        System.out.println("-------------");
        paises.forEach(System.out::println);

        //Collections.sort(paises, criterioSuperficie);
        //La lista donde buscar la informacion deve estar ordenada previamente
        //segun el criterio de orden natural (nombre) --> Comparable en Pais
        Collections.sort(paises);
        System.out.println("---------------------busqueda binaria--------------");
        System.out.println("lista ordenada sefun orden natural(nombre)-----------");
        paises.forEach(System.out::println);
        Pais objetoBuscar = new Pais();
        objetoBuscar.setNombre("Portugal");//Lista ordenada por nombre,busqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("Portugal esta en la posicion " + posicion);
        // si intento buscar en la lidta con en valor que no es nombre se puede obtener
        // una posocion erronea
        objetoBuscar.setNombre("");
        objetoBuscar.setPoblacion(23);
        posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println(posicion);
        //si ordeno la lista por um criterio y busco por otro, el resultado es inesperado
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println(posicion);

        System.out.println("---------------------------------Oedenacion y busqueda por poblacion");
        //antes de usar binarySearch por poblacion la lista debe estar ordenada por poblacion
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println("El pais que tiene 146 millones es " + paises.get(posicion));
        
    }
}
