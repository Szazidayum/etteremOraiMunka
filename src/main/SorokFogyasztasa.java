package main;

public class SorokFogyasztasa {
    
    public int db, osszDb, vanEAbrosz, osszeg, vegosszeg;
    public int maxSor = 5;
    public int ar;
    public static int asztalSzam = 3;
    public boolean abrosz;
    public String sor1 = "Dreher";
    public String sor2 = "Kőbányai";
    public String sor3 = "Aranyászok";

    public static void main(String[] args) {
        osszesAsztal();
    }

    public static void osszesAsztal(){
        for (int i = 0; i < asztalSzam; i++) {
            System.out.println("Asztal"+i+" fogyasztása:");
            SorokFogyasztasa();
        }
    }
        
    public static void SorokFogyasztasa() {
        SorokFogyasztasa asztal = new SorokFogyasztasa();
        asztal.szamla();
    }
    
    public void szamla(){
        fogyasztas();
        System.out.println("A végösszeg: "+vegosszeg+"Ft");
        System.out.println("Fogyasztott sör mennyiség: "+osszDb+"db");
        System.out.println("Abrosz van-e az asztalon: "+abrosz);
        System.out.println("");
        
    }
    public void fogyasztas(){
        Asztal asztal = new Asztal();
        
//        Dreherből
        asztal.setTipus(sor1);
        int tipOsszeg1 = tipusFogyasztas(asztal);
        System.out.println(sor1+": "+tipOsszeg1);
        
//        Kőbányaiból
        asztal.setTipus(sor2);
        int tipOsszeg2 = tipusFogyasztas(asztal);
        System.out.println(sor2+": "+tipOsszeg2);
        
//        Aranyászokból
        asztal.setTipus(sor3);
        int tipOsszeg3 = tipusFogyasztas(asztal);
        System.out.println(sor3+": "+tipOsszeg3);
        
//        Végösszeg
        vegosszeg = tipOsszeg1+tipOsszeg2+tipOsszeg3;
        
//        Abrosz
        vanEAbrosz = (int)Math.floor(Math.random() * (2 - 1 + 1) + 1);
        if(vanEAbrosz==1){
            asztal.setAbrosz(true);
        }else{
            asztal.setAbrosz(false);
        }
        abrosz=asztal.isAbrosz();
        
    }
    
    public int tipusFogyasztas(Asztal asztal){
        db = (int)Math.floor(Math.random() * (maxSor - 1 + 1) + 1);
        asztal.setSorok(db);
        System.out.println("darab: "+db);
        if(asztal.getTipus().equals(sor1)){
            ar=400;
        }else if(asztal.getTipus().equals(sor2)){
            ar=350;
        }else{
            ar=280;
        }
        asztal.setAr(ar);
        osszeg = asztal.getSorok()*asztal.getAr();
        
        osszDb+=db;
        return osszeg;
    }
}
