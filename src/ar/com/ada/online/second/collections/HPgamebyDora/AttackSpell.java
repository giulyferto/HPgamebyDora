package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class AttackSpell extends Spell {

    public AttackSpell() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AttackSpell that = (AttackSpell) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format(
                "AttackSpells { name= %s, recovery= $d, life= %d, magicPower== %d }",
                name,
                recovery,
                magicPower
        );
    }

}
