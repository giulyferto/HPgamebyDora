package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class Wizard extends Character {
    protected Wand wand;

    public Wizard() {
        super();
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    //hashCode equals and toString

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizard that = (Wizard) obj;
        return super.equals(obj) && wand.equals(that.wand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return String.format(
                "Wizard{ name= %s, location= %s, life= %d, magicEnergy= %d, spells= %s, wand= %s}",
                name,
                location,
                life,
                magicEnergy,
                getSpellSet(),
                wand
        );
    }
}
