package controllers;

import models.Person;

public class SearchMethods {
    public Person binarySearchByAge(Person[] persons, int age, int size) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (persons[mid].getAge() == age) {
                return persons[mid];
            } else if (persons[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public Person binarySearchByName(Person[] persons, String name, int size) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (persons[mid].getName().equals(name)) {
                return persons[mid];
            } else if (persons[mid].getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

