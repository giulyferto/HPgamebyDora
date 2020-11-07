package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class Wizard extends Character {
    protected Wand wizardsWand;

    public Wizard() { super();}

    public Wand getWizardsWand() {
        return wizardsWand;
    }

    public Wand setWizardsWand(Wand wand) { return wizardsWand;
    }

    @Override
    public void attack() {

    }

    @Override
    public void heal() {

    }

    @Override
    public void recovery() {

    }

    @Override
    public void receiveAttack() {

    }

    @Override
    public void isAlive() {

    }

    @Override
    public void addSpell() {

    }

    @Override
    public void characterStatus() {

    }

    @Override
    public void darkOrFree() {

    }
    //hashCode equals and toString

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizard that = (Wizard) obj;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return String.format(
                "Wizard { name= %s, location= $s, life= %d, magicEnergy= %d, spells= %d, wand= %s }", //preguntar a Vlady %s
                name,
                location,
                life,
                magicEnergy,
                spells,
                wizardsWand
        );
    }
}
