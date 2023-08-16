package test;

public class Asiento {
    private static final String[] coloresValidos = {"rojo", "verde", "amarillo", "negro", "blanco"};

    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color){
        for (String colorValido : coloresValidos) {
            if(colorValido.equalsIgnoreCase(color)){
                this.color = colorValido;
                return;
            }
        }
    }

}
