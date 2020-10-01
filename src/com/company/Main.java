package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Warrior warrior = new Warrior();
	warrior.applySuperAbility();


    Medic medic = new Medic();
    medic.applySuperAbility();

    Magic magic = new Magic();
    magic.applySuperAbility();

        Random r = new Random();
        int random = r.nextInt(3);
        switch (random) {
            case 1:
                System.out.println(warrior.applySuperAbility());
                break;
            case 2:
                System.out.println(medic.applySuperAbility());
                break;
            case 3:
                System.out.println(magic.applySuperAbility());
            default:
                System.out.println("Не кто не применял суперспособность CRITICAL DAMAGE");
                break;
        }

    }
}
/*Создать интерфейс HavingSuperAbility (имеющий суперспособность) добавить
 в него 1 абстрактный метод applySuperAbility(String superAbilityType);
Создать абстрактный класс Hero с полями здоровье, урон и тип суперспособности
 и реализовать интерфейс HavingSuperAbility.
Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero.
 В каждом классе по своему реализовать метод applySuperAbility(String superAbilityType)
 следующим образом - просто распечатать что то вроде того
 “Warrior применил суперспособность CRITICAL DAMAGE”.
В классе Main создать массив из 3х разных героев,
затем через цикл применить суперспособность каждого героя.
Дэдлайн 26.08.2020 23 59*/