import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner variable=new Scanner(System.in);
        System.out.println("SISTEMAS DE NOTAS DE ESTUDIANTES");

        String nombre;
        Notas minota1;
        Notas minota2;
        Notas minota3;
        Notas minota4;
        Notas minota5;

        System.out.println("Escribe tu nombre");
        minota1=new Notas(nombre=variable.nextLine());
        minota2=new Notas("Samanta");
        minota3=new Notas("Ximena");
        minota4=new Notas("Kelyn");
        minota5=new Notas("Samira");
        //  nombre=variable.nextLine();

        System.out.println("Escribe tu Apellido");
        minota1.setApellido(nombre=variable.nextLine());
        minota2.setApellido("Torres");
        minota3.setApellido("Guayanay");
        minota4.setApellido("Guayanay");
        minota5.setApellido("Guayanay");


        System.out.println("Escribe tu Nota del primer Bimestre");
        minota1.setNota1Bimestre(nombre=variable.nextLine());
        minota2.setNota1Bimestre("8");
        minota3.setNota1Bimestre("8");
        minota4.setNota1Bimestre("8");
        minota5.setNota1Bimestre("8");

        System.out.println("Escribe tu Nota del segundo Bimestre");
        minota1.setNota2Bimestre(nombre=variable.nextLine());
        minota2.setNota2Bimestre("5");
        minota3.setNota2Bimestre("5");
        minota4.setNota2Bimestre("5");
        minota5.setNota2Bimestre("5");


        //obtener los valores de cada atributos

        System.out.println("SISTEMAS DE NOTAS ....................");
        System.out.println("Nombre: "+minota1.getNombre()+"\n"+"Apellido: "+minota1.getApellido()+"\n"+"Nota 1 Bimestre: "+minota1.getNota1Bimestre()+"\n"+"Nota 2 Bimestre: "+minota1.getNota2Bimestre()+"\n");

    }
}