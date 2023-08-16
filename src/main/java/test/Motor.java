package test;

public class Motor {

    private static String[] tiposValidos = {"electrico", "gasolina"};
    public int numeroCilindros;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        for (String tiposValido : tiposValidos) {
            if(tiposValido.equalsIgnoreCase(tipo)){
                this.tipo = tiposValido;
            }
        }
    }
}
