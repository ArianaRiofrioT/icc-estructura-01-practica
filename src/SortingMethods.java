package controllers;

import models.Person;

public class SortingMethods {
    public void sortByNameWithBubble(Person[] persons, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (persons[j].getName().compareTo(persons[j + 1].getName()) > 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    public void sortByAgeWithInsertion(Person[] persons, int size) {
        for (int i = 1; i < size; i++) {
            Person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getAge() > key.getAge()) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = key;
        }
    }
}
