package main;

public class Asztal {
    public int sorok, ar;
    public boolean abrosz;
    public String tipus;

    public void setAbrosz(boolean abrosz) {
        this.abrosz = abrosz;
    }
    

    public int getSorok() {
        return sorok;
    }

    public int getAr() {
        return ar;
    }

    public void setSorok(int sorok) {
        this.sorok = sorok;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public boolean isAbrosz() {
        return abrosz;
    }
    
}
