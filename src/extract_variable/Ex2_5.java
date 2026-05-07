package extract_variable;

public class Ex2_5 {

    public void verificarReserva(boolean salaDisponivel, int participantes, boolean eventoInstitucional) {

        boolean reservaSalaComum = salaDisponivel && participantes <= 40;
        boolean reservaEventoInstitucional = eventoInstitucional && participantes <= 60;
        boolean reservaPermitida = reservaSalaComum || reservaEventoInstitucional;

        if (reservaPermitida) {
            System.out.println("Reserva permitida");
        } else {
            System.out.println("Reserva recusada");
        }
    }

}
