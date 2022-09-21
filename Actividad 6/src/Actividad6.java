import java.util.*;

//Clase secundaria para obtener los datos del estudiante y sus calificaciones
class califEstudiante
{
    //Atributo que recopilara el nombre del estudiante
    public String getNombre()
    {
        String nombre="";

        return nombre;
    }

    //Atributo tipo array para poder almacenar las 5 calificaciones del estudiante
    double calificaciones[] = new double[5];

    //Método para calcular el promedio de las calificaciones
    public double getPromedio()
    {

        //Variables necesarias para calcular el promedio
        double suma=0;
        double promedio=0;

        //Ciclo para sumas las calificaciones del arreglo
        for(int x=0; x<calificaciones.length; x++)
        {
            suma= suma + calificaciones[x];
        }

        //Operacion para calcular el promedio
        promedio = suma/calificaciones.length;

        return promedio;
    }

    //Metodo para obtener la calificacion
    public String getCalificacion()
    {
        //String para anotar la calificacion del estudiante
        String calificacion=" ";

        //Condiciones para calcular la calificacion final del estudiante
        if (getPromedio() <= 50)
        {
            calificacion ="F";
        }

        if (getPromedio() > 50 && getPromedio() <=60)
        {
            calificacion ="E";
        }

        if (getPromedio() > 60 && getPromedio() <=70)
        {
            calificacion ="D";
        }

        if (getPromedio() > 70 && getPromedio() <=80)
        {
            calificacion ="C";
        }

        if (getPromedio() > 80 && getPromedio() <=90)
        {
            calificacion ="B";
        }

        if (getPromedio() > 90)
        {
            calificacion ="A";
        }

        return calificacion;
    }

    //Metodo para que el estudiante ingrese sus datos
    public void datos()
    {
        Scanner datos= new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = datos.nextLine();
        System.out.print("Ingresa la calificacion 1: ");
        calificaciones[0]=datos.nextDouble();
        System.out.print("Ingresa la calificacion 2: ");
        calificaciones[1]=datos.nextDouble();
        System.out.print("Ingresa la calificacion 3: ");
        calificaciones[2]=datos.nextDouble();
        System.out.print("Ingresa la calificacion 4: ");
        calificaciones[3]=datos.nextDouble();
        System.out.print("Ingresa la calificacion 5: ");
        calificaciones[4]=datos.nextDouble();
        System.out.println("\n");
    }

    //Método que imprimira los resultados
    public void imprimir()
    {
        System.out.println("Nombre del estudiante: " + getNombre());
        System.out.println("Calificacion 1: " + calificaciones[0]);
        System.out.println("Calificacion 2: " + calificaciones[1]);
        System.out.println("Calificacion 3: " + calificaciones[2]);
        System.out.println("Calificacion 4: " + calificaciones[3]);
        System.out.println("Calificacion 5: " + calificaciones[4]);
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Calificacion: " + getCalificacion());
    }
}

//Clase que publicara los datos de la clase califEstudiante en la consola
public class Actividad6
{
    public static void main(String[] args)
    {
        califEstudiante estudiante = new califEstudiante();

        estudiante.datos();

        estudiante.getNombre();
        estudiante.getCalificacion();
        estudiante.getPromedio();
        estudiante.getCalificacion();

        estudiante.imprimir();
    }
}
