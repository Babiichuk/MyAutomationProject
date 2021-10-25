package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    public Dog(String animalName) {
        super(animalName);
        this.setTypeOfAnimal("Dog");
        this.setVoice("Gav");
    }

    @Override
    public void sound() {
        String voice = getVoice();
        System.out.println(this.say() + voice);
    }

    ;
}

