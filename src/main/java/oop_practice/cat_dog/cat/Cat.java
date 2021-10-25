package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {
    public Cat(String animalName) {
        super(animalName);
        this.setTypeOfAnimal("Cat");
        this.setVoice("Meow");
    }

    @Override
    public void sound() {
        String voice = getVoice();
        System.out.println(this.say() + voice);
    }

    ;
}
