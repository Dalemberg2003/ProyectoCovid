package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AdmVacunados {

    private static AdmVacunados adm = null;
    ArrayList<Persona> personas;

    private AdmVacunados() {
        personas = new ArrayList<Persona>();
    }

    public static AdmVacunados getAdm() {

        if (adm == null) {
            adm = new AdmVacunados();
        }
        return adm;
    }

    public void Recorrer() {
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getDosisAplicada().equals("segunda")) {
                    System.out.println(p.MostrarPersona());
                    System.out.println("****************************************************");
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
    }

    public void MostrarActualizar() {
        if (personas != null) {
            for (Persona p : personas) {
                System.out.println(p.MostrarPersona());
                System.out.println("**********************************************************");
            }
        } else {
            System.out.println("Lista no llena");
        }
    }

    public int Acumular() {
        int acumulador = 0;
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getDosisAplicada().equals("segunda")) {
                    acumulador++;
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
        return acumulador;
    }

    public void vacunadosEnvigado() {
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getResidencia().equalsIgnoreCase("Envigado")) {
                    System.out.println(p.MostrarPersona());
                    System.out.println("**********************************************************");
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
    }

    public float PromedioPfizer() {
        int edades = 0;
        int acumulador = 0;
        float promedio = 0;
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getTipoVacuna().equalsIgnoreCase("Pfizer")) {
                    acumulador++;
                    edades = edades + p.getEdad();
                    promedio = edades / acumulador;
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
        return promedio;
    }

    public int MayorEdadVacunada() {
        int acumulador = 0, mayor = 0;
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getEdad() != 0) {
                    mayor = p.getEdad();
                    if (mayor > acumulador) {
                        acumulador = mayor;
                    } else if (mayor == acumulador) {
                        return mayor;
                    }
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
        return mayor;
    }

    public String ExtraerNombre() {
        String nombre = "";
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getEdad() == MayorEdadVacunada()) {
                    nombre = p.getNombre();
                }
            }
        }
        return nombre;
    }

    public int CantidadPersonas() {
        int acumulador = 0;

        if (personas != null) {
            for (Persona p : personas) {
                if (p.getDosisAplicada().equalsIgnoreCase("segunda")) {
                    acumulador++;
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
        return acumulador;
    }

    public double PorcentajePersonas() {
        int acumulador = 0;
        double porcentaje = 0.0;
        if (personas != null) {
            for (Persona p : personas) {
                acumulador++;
            }
            porcentaje = 100 * ((CantidadPersonas() / (double) (acumulador)));
        }
        return porcentaje;
    }

    public void DescendenteEdad() {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
            }
        });
        if (personas != null) {
            for (Persona p : personas) {
                System.out.println(p.MostrarPersona());
                System.out.println("********************************************************");
            }
        } else {
            System.out.println("Lista no llena");
        }
    }

    public void Modificar(String numeroIdentidad) {
        Scanner in = new Scanner(System.in);
        String tipodoc, numeroIdentidadnuevo, residencia, tipoVacuna, dosisUnica, dosisAplicada, fecha;
        if (personas != null) {
            for (Persona p : personas) {
                if (p.getNumeroIdentidad().equals(numeroIdentidad)) {
                    System.out.println("Tipo de documento actual: " + p.getTipoDoc());
                    System.out.print("Nuevo tipo de documento: ");
                    tipodoc = in.nextLine();
                    p.setTipoDoc(tipodoc);
                    System.out.println("Numero de identidad actual: " + p.getNumeroIdentidad());
                    System.out.print("Nuevo numero de identidad: ");
                    numeroIdentidadnuevo = in.nextLine();
                    p.setNumeroIdentidad(numeroIdentidadnuevo);
                    System.out.println("Nombre actual: " + p.getNombre());
                    System.out.println("edad actual: " + p.getEdad());
                    System.out.println("residencia actual: " + p.getResidencia());
                    System.out.print("Nueva residencia: ");
                    residencia = in.nextLine();
                    p.setResidencia(residencia);
                    System.out.println("Tipo de vacuna actual: " + p.getTipoVacuna());
                    System.out.print("Nuevo tipo de vacuna: ");
                    tipoVacuna = in.nextLine();
                    p.setTipoVacuna(tipoVacuna);
                    System.out.println("Tipo de dosis unica actual: " + p.getDosisUnica());
                    System.out.print("Nuevo tipo de dosis unica: ");
                    dosisUnica = in.nextLine();
                    p.setDosisUnica(dosisUnica);
                    System.out.println("Tipo de dosis aplicada actual: " + p.getDosisAplicada());
                    System.out.print("Nuevo tipo de dosis aplicada: ");
                    dosisAplicada = in.nextLine();
                    p.setDosisAplicada(dosisAplicada);
                    System.out.println("Fecha de vacunacion actual: " + p.getFecha());
                    System.out.print("Nueva fecha de vacunacion: ");
                    fecha = in.nextLine();
                    p.setFecha(fecha);
                }
            }
        } else {
            System.out.println("Lista no llena");
        }
    }

    public void agregar(Persona p) {
        personas.add(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

}
