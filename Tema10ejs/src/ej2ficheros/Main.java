package ej2ficheros;

public class Main {
	public static void main(String[] args) {
        try {
            Hora hora1 = new Hora(12, 30, -15);
        } catch (NegativeHourException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NegativeMinuteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NegativeSecondException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
