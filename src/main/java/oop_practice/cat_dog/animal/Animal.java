package oop_practice.cat_dog.animal;

public class Animal {
    private String name;
    private String voice;
    private String typeOfAnimal;

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Animal(String animalName) {
        this.name = animalName;
    };

    public String say() {
        return ("I'm a " + typeOfAnimal + "." + " my name is " + name + ". ");

    }

    public void sound() {
        System.out.println("I'm saying something");
    };
};

