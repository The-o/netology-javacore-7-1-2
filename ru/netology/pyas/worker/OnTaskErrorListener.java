package ru.netology.pyas.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String message);
}
