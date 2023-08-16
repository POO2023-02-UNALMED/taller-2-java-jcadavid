package test;

import java.util.Arrays;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int i = 0;
        for (Asiento asiento : asientos) {
            if(asiento != null){
                i++;
            }
        }
        return i;
    }

    public String verificarIntegridad(){
        return verificarRegistros()? "Auto original": "Las piezas no son originales";
    }

    private boolean verificarRegistros() {
        if (registro != motor.registro) {
            return false;
        }
        for (Asiento asiento: asientos){
            if(asiento == null){
                continue;
            }
            if (registro != asiento.registro){
               return false;
            }
        }
        return true;
    }
}
