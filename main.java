import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner variable=new Scanner(System.in);
        System.out.println("SISTEMAS DE NOTAS DE ESTUDIANTES");

        String nombre;
        Notas minota1;
        Notas minota2;
        Notas minota3;
        Notas minota4;
        Notas minota5;

        minota1=new Notas("Jennyfer");
        minota2=new Notas("Samanta");
        minota3=new Notas("Ximena");
        minota4=new Notas("Kelyn");
        minota5=new Notas("Samira");
        //  nombre=variable.nextLine();

        minota1.setApellido("Guayanay");
        minota2.setApellido("Torres");
        minota3.setApellido("Guayanay");
        minota4.setApellido("Guayanay");
        minota5.setApellido("Guayanay");


        minota1.setNota1Bimestre("8");
        minota2.setNota1Bimestre("8");
        minota3.setNota1Bimestre("8");
        minota4.setNota1Bimestre("8");
        minota5.setNota1Bimestre("8");

        minota1.setNota2Bimestre("5");
        minota2.setNota2Bimestre("5");
        minota3.setNota2Bimestre("5");
        minota4.setNota2Bimestre("5");
        minota5.setNota2Bimestre("5");


        //obtener los valores de cada atributos

        System.out.println("SISTEMAS DE NOTAS ....................");
        System.out.println("Nombre: "+minota1.getNombre()+" Apellido: "+minota1.getApellido()+" Nota 1 Bimestre: "+minota1.getNota1Bimestre()+" Nota 2 Bimestre: "+minota2.getNota2Bimestre()+"\n");

    }
}