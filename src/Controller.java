package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Person[] persons;
    private int personCount;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.persons = new Person[100];  
        this.personCount = 0;
    }

    public void start() {
        boolean running = true;
        while (running) {
            int option = view.showMenu();
            switch (option) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    sortPersons();
                    break;
                case 3:
                    searchPerson();
                    break;
                case 4:
                    running = false;
                    break;
            }
        }
    }

    private void addPerson() {
        persons[personCount++] = view.inputPerson();
    }

    private void sortPersons() {
        int method = view.selectSortingMethod();
        if (method == 1) {
            sortingMethods.sortByNameWithBubble(persons, personCount);
        } else {
            sortingMethods.sortByAgeWithInsertion(persons, personCount);
        }
        view.displayPersons(persons);
    }

    private void searchPerson() {
        int criterion = view.selectSearchCriterion();
        if (criterion == 1) {
            String name = view.inputName();
            Person result = searchMethods.binarySearchByName(persons, name, personCount);
            view.displaySearchResult(result);
        } else {
            int age = view.inputAge();
            Person result = searchMethods.binarySearchByAge(persons, age, personCount);
            view.displaySearchResult(result);
        }
    }
}
