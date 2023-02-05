package ru.libedinskiy;

import ru.libedinskiy.exception.InvalidOperationStackException;

import java.util.LinkedList;

/**
 * Класс реализующий интерфейс Stack для строковых значений
 */
public class StringStack implements Stack<String> {
    private final LinkedList<String> items;

    public StringStack() {
        this.items = new LinkedList();
    }

    /**
     * Метод предназначен для добавление элементов в стек
     * @param - value - значение добавление в стек
     * @throws - IllegalArgumentException - срабатывает при получение пустого элемента
     */
    @Override
    public void push(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException();
        }
        items.addLast(value);
    }

    /**
     * Метод предназначен для удаление первого элемента в стеке
     * @throws - InvalidOperationStackException - срабатывает при пустом списке
     * @return - возвращает удаленный элемент
     */
    @Override
    public String pop() {
        if (items.isEmpty()) {
            throw new InvalidOperationStackException();
        }

        return items.removeFirst();
    }

    /**
     * Метод предназначен для получение первого элмента в стеке
     * @throws - InvalidOperationStackException - срабатывает при пустом списке
     * @return - возвращает первый элемент
     */
    @Override
    public String peek() {
        if (items.isEmpty()) {
            throw new InvalidOperationStackException();
        }
        return items.getFirst();
    }

    /**
     * Количество элементов в списке
     * @return - возвращает кол-во элементов в списке
     */
    @Override
    public int count() {
        return items.size();
    }
}
