//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//   Реализовать в java.
//2. Создать множество ноутбуков (ArrayList).
//3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//   Например, спросить у пользователя минимальный размер оперативной памяти
//   или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию

import java.util.*;

public class Laptop {
    int id;
    int ram;
    int ssd;
    String os;
    String color;

    public Laptop(int id, int ram, int ssd, String os, String color) {
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ram, ssd, os, color);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}
