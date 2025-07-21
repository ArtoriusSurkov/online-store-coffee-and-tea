package ru.store.online.model;

import ru.store.online.model.enumeration.Roasting;
import ru.store.online.model.enumeration.TypeCoffee;

public class Coffee extends Drink{

    private TypeCoffee typeCoffee;

    private Roasting roasting;

    public TypeCoffee getTypeCoffee() {
        return typeCoffee;
    }

    public void setTypeCoffee(TypeCoffee typeCoffee) {
        this.typeCoffee = typeCoffee;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}
