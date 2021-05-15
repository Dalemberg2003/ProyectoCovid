package clases;

public class Persona {

    private String tipoDoc, numeroIdentidad, nombre, residencia, tipoVacuna, dosisUnica, dosisAplicada, fecha;
    private int edad;

    public Persona(String tipoDoc, String nombre, String residencia, String tipoVacuna, String dosisUnica, String dosisAplicada, String fecha, String numeroIdentidad, int edad) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.residencia = residencia;
        this.tipoVacuna = tipoVacuna;
        this.dosisUnica = dosisUnica;
        this.dosisAplicada = dosisAplicada;
        this.fecha = fecha;
        this.numeroIdentidad = numeroIdentidad;
        this.edad = edad;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getDosisUnica() {
        return dosisUnica;
    }

    public void setDosisUnica(String dosisUnica) {
        this.dosisUnica = dosisUnica;
    }

    public String getDosisAplicada() {
        return dosisAplicada;
    }

    public void setDosisAplicada(String dosisAplicada) {
        this.dosisAplicada = dosisAplicada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String MostrarPersona() {
        return "Tipo de documento: " + tipoDoc + "\nNumero de identificacion: " + numeroIdentidad + "\nnombre: " + nombre + "\nedad:" + edad + "\nResidencia: " + residencia + "\nTipo de vacuna: " + tipoVacuna + "\nDosis unica: " + dosisUnica + "\nDosis Aplicada: " + dosisAplicada + "\nfecha: " + fecha;
    }

}
