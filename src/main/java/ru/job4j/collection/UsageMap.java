package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("salikhov@yandex.ru", "Radmir Salikhov");
        map.put("petrov@yandex.ru", "Aleksey Petrov");
        map.put("salikhov@yandex.ru", "Radmir Salikhov");
        map.put("salikhov@yandex.ru", "Radmir Salikhov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
