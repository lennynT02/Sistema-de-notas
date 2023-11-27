package Sistema_Notas;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner variable=new Scanner(System.in);
        Scanner variable1=new Scanner(System.in);
        Scanner variable2=new Scanner(System.in);
        System.out.println("SISTEMAS DE NOTAS DE ESTUDIANTES");
        int n=1;
        String pase="Aprobado";
        System.out.println("Cuantos alumnos va a ingresar: ");n=variable.nextInt();
        Notas[] estudiantes = new Notas[n];
        for (int i=0;i<estudiantes.length;i++){
            float Notab1=0,Notab2=0;
            System.out.println("Escribe tu nombre");
            estudiantes[i] = new Notas(variable2.nextLine());
            System.out.println("Escribe tu Apellido");
            estudiantes[i].setApellido(variable1.nextLine());
            System.out.println("Escribe tus 10 Notas del primer Bimestre");
            for (int j =0;j<10;j++){
                System.out.println("Ingresa tu NOTA "+(j+1));
                Notab1+=variable.nextInt();
            }
            estudiantes[i].setNota1Bimestre((Notab1/10));
            System.out.println(estudiantes[i].getNota1Bimestre());
            System.out.println("Escribe tus 10 Notas del segundo Bimestre");
            for (int h =0;h<10;h++){
                System.out.println("Ingresa tu NOTA "+(h+1));
                Notab2+=variable.nextInt();
            }
            estudiantes[i].setNota2Bimestre((Notab2/10));
        }
        System.out.println("SISTEMAS DE NOTAS ....................\n");
        for (int i =0;i<estudiantes.length;i++){
            if ((estudiantes[i].getNota1Bimestre()+estudiantes[i].getNota2Bimestre())<14)
                pase="No aprobado";
            System.out.println(estudiantes[i].getNombre()+" \t"+estudiantes[i].getApellido()+" \t"+estudiantes[i].getNota1Bimestre()+" \t"+estudiantes[i].getNota2Bimestre()+" \t"+pase);
        }
    }
}