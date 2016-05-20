package ru.mail.sphere.Stack;

public interface Stack<T> {
    void push(T elem);
    T pop();

    // взять верхушку без извлечения
    T peek();
}
