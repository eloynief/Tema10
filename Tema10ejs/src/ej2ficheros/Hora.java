package ej2ficheros;

public class Hora {
	private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws NegativeHourException {
        if (hora < 0) {
            throw new NegativeHourException("La hora no puede ser negativa");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
