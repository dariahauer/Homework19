package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {

        return numberList
                .stream()
                .filter(number -> number > 20)
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> bookTitles = new ArrayList<>();
        titles
                .stream()
                .forEach(i -> bookTitles.add(new Book(i)));
        return bookTitles;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> bookTitles = new ArrayList<>();
        titles
                .stream()
                .filter(title -> title.startsWith("Gra"))
                .forEach(title -> bookTitles.add(new Book(title)));
        return bookTitles;
    }
}

