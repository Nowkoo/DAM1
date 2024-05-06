package U8_interfaces_gráficas.GestionDeEquipos;

public class AltaJugador {
    private String demarcacion;
    private String nombre;

    public String getDemarcacion() {
        return demarcacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getAltura() {
        return altura;
    }

    public String getDorsal() {
        return dorsal;
    }

    public String getClub() {
        return club;
    }

    private String fechaNacimiento;
    private String altura;
    private String dorsal;
    private String club;

    public AltaJugador(String demarcacion, String nombre, String fechaNacimiento, String altura, String dorsal, String club) {
        this.demarcacion = demarcacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.dorsal = dorsal;
        this.club = club;
    }
}
