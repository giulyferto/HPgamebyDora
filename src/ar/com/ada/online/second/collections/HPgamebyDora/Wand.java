package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.Objects;

public class Wand {
    private String wandName;
    private Integer wandPower;

    public Wand() {
    }

    public Wand(String wandName, Integer wandPower) {
        this.wandName = wandName;
        this.wandPower = wandPower;
    }

    public String getWandName() {
        return wandName;
    }

    public void setWandName(String wandName) {
        this.wandName = wandName;
    }

    public Integer getWandPower() {
        return wandPower;
    }

    public void setWandPower(Integer wandPower) {
        this.wandPower = wandPower;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wand that = (Wand) obj;
        return wandName.equals(that.wandName) &&
                wandPower.equals(that.wandPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wandName, wandPower);
    }


    @Override
    public String toString() {
        return String.format(
                "Wand{ name= %s, power= %d}",
                wandName,
                wandPower
        );
    }
}
