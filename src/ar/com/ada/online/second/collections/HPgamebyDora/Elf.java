package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class Elf extends Character {
    public Elf() {
        super();
    }

    //Se implementan metodos de la clase

    @Override
    public void recoverYourself(Integer magicPower) {
    }

    @Override
    public void receiveAttack(Integer damage, Integer magicPower, char position) {
    }

    //hashCode equals and toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elf that = (Elf) obj;
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return String.format(
                "Elf { name= %s, location= %s, life= %d, magicEnergy= %d, spells= %s}",
                name,
                location,
                life,
                magicEnergy,
                getSpellSet()
        );
    }
}