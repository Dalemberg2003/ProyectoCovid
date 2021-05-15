package clases;

import java.util.Scanner;

public class Principal {

    AdmVacunados adm = AdmVacunados.getAdm();

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.Opcion();
    }

    public void Opcion() {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n                     GESTOR DE VACUNADOS CONTRA COVID-19                      \n");
            System.out.println("********************************************************************************");
            System.out.println("* Escoja una opcion                                                            *");
            System.out.println("* 1.  Registrar persona vacunada                                               *");
            System.out.println("* 2.  Mostrar informacion de personas vacunadas con dosis completa             *");
            System.out.println("* 3.  Mostrar cantidad de personas vacunadas                                   *");
            System.out.println("* 4.  Modificar persona vacunada                                               *");
            System.out.println("* 5.  Mostrar informacion de personas vacunadas en Envigado                    *");
            System.out.println("* 6.  Calcular promedio de edades de personas vacunadas con Pfizer             *");
            System.out.println("* 7.  Mostar el nombre de la persona con mayor edad vacunada                   *");
            System.out.println("* 8.  Calcular porcentaje de personas vacunadas con dosis completa             *");
            System.out.println("* 9.  Mostrar informacion de personas vacunadas en orden descedente (por edad) *");
            System.out.println("* 10. Salir                                                                    *");
             System.out.println("********************************************************************************");
            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    ingresarInformacion();
                    break;
                case 2:
                    Recorrer();
                    break;
                case 3:
                    CantidadVacunadosCompletos();
                    break;
                case 4:
                    ModificarVacunado();
                    break;
                case 5:
                    MostrarVacunadosEnvigado();
                    break;
                case 6:
                    PromedioEdadesPfizer();
                    break;
                case 7:
                    MayorEdadVacunado();
                    break;
                case 8:
                    PorcentajeCompleto();
                    break;
                case 9:
                    MostrarDescendente();
                    break;
            }
        } while (opcion != 10);
    }

    public void ingresarInformacion() {
        Scanner in = new Scanner(System.in);
        String tipoIdentidad, numeroIdentidad, nombre, residencia, tipoVacuna, dosisAplicada, dosisUnica, fecha;
        int edad;
        
        System.out.println("***************************************************");
        System.out.println("Ingrese el tipo de identidad del vacunado");
        System.out.println("Ruc o cedula");
        tipoIdentidad = in.nextLine();
        System.out.println("Ingrese el numero de identidad del vacunado");
        numeroIdentidad = in.nextLine();
        System.out.println("Ingrese el nombre del vacunado");
        nombre = in.next();
        System.out.println("Ingrese la edad del vacunado");
        edad = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese el municipio de residencia del vacunado");
        residencia = in.nextLine();
        System.out.println("Ingrese el tipo de vacuna aplicada al vacunado");
        tipoVacuna = in.nextLine();
        System.out.println("Ingrese el tipo de dosis aplicada al vacunado");
        dosisUnica = in.nextLine();
        System.out.println("Ingrese la dosis aplicada al vacunado");
        dosisAplicada = in.nextLine();
        System.out.println("Ingrese la fecha de aplicacion de la dosis");
        System.out.println("Use este tipo de fecha DD-MM-AA");
        fecha = in.nextLine();
        System.out.println("***************************************************");
        System.out.println("*               Persona registrada                *");
        System.out.println("***************************************************");

        Persona persona = new Persona(tipoIdentidad, nombre, residencia, tipoVacuna, dosisUnica, dosisAplicada, fecha, numeroIdentidad, edad);
        adm.agregar(persona);
    }

    public void Recorrer() {
        System.out.println("****************************************************");
        System.out.println("Informacion de personas vacunadas con dosis completa");
        System.out.println("****************************************************\n");
        adm.Recorrer();       
    }

    public void CantidadVacunadosCompletos() {
        System.out.println("***************************************************************************");
        System.out.println("*         Cantidad de personas vacunadas con dosis completa: " + adm.Acumular()+"            *");
        System.out.println("***************************************************************************");
    }

    public void ModificarVacunado() {
        Scanner in = new Scanner(System.in);
        String numeroIdentidad;
        System.out.println("Ingrese el numero de identidad: ");
        numeroIdentidad = in.nextLine();
        adm.Modificar(numeroIdentidad);
        System.out.println("\n********************");
        System.out.println("Datos actualizados");
        System.out.println("********************");
        adm.MostrarActualizar();
    }

    public void MostrarVacunadosEnvigado() {
        System.out.println("**********************************************************");
        System.out.println("Personas vacunadas que residen en el municipio de Envigado\n");
        adm.vacunadosEnvigado();
    }

    public void PromedioEdadesPfizer() {
        System.out.println("*********************************************************");
        System.out.println("Promedio de edades de personas vacunadas con Pfizer: " + adm.PromedioPfizer());
        System.out.println("*********************************************************");
    }

    public void MayorEdadVacunado() {
        System.out.println("**************************************************");
        System.out.println("La persona con mayor edad vacunada es: " + adm.ExtraerNombre());
        System.out.println("**************************************************");
    }

    public void PorcentajeCompleto() {
        System.out.println("***********************************************************");
        System.out.println("El porcentaje de personas con dosis completa es: " + adm.PorcentajePersonas() + "%");
        System.out.println("***********************************************************");
    }

    public void MostrarDescendente() {
        System.out.println("********************************************************");
        System.out.println("Informacion de vacunados en orden descendente (por edad)");
        System.out.println("********************************************************\n");
        adm.DescendenteEdad();
    }

}
