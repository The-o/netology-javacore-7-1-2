package ru.netology.pyas.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
