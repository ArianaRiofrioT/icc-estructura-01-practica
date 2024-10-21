package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Ingrese personas");
        System.out.println("2. Clasificar personas");
        System.out.println("3. Buscar persona");
        System.out.println("4. Salir");
        return scanner.nextInt();
    }

    public Person inputPerson() {
        System.out.println("Ingresa el nombre: ");
        String name = scanner.next();
        System.out.println("Ingresa la edad: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }

    public int selectSortingMethod() {
        System.out.println("1. Ordenar por nombre (Bubble Sort)");
        System.out.println("2. Ordenar por edad (Insertion Sort)");
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por edad");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona encontrada: " + person);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    public String inputName() {
        System.out.println("Ingrese el nombre a buscar: ");
        return scanner.next();
    }

    public int inputAge() {
        System.out.println("Inrese la edad a buscar: ");
        return scanner.nextInt();
    }
}
