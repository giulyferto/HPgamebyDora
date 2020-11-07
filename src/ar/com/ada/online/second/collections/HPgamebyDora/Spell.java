package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class Spell {
    protected String name;
    protected Integer damage;
    protected Integer recovery;
    protected Integer magicPower;
    private Integer counter = 0;

    public Spell() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecovery() {
        return recovery;
    }

    public void setRecovery(Integer recovery) {
        this.recovery = recovery;
    }

    public Integer getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(Integer magicPower) {
        this.magicPower = magicPower;
    }

    public Integer getDamage() { return damage; }

    public void setDamage(Integer damage) { this.damage = damage; }

    //Metodo para contar el tipo de hechizos de ataque
    public Integer addAttackSpell() {
        counter++;
        return counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, recovery, magicPower);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Spell that = (Spell) obj;
        return name.equals(that.name) &&
                recovery.equals(that.recovery) &&
                magicPower.equals(that.magicPower);
    }

    @Override
    public String toString() {
        return String.format(
                "Spell { name= %s, recovery= $d, life= %d, magicPower== %d}",
                name,
                recovery,
                magicPower
        );
    }
}
