package Sistema_Notas;
public class Notas  {
    String nombre;
    String apellido;
    float Nota1Bimestre  ;
    float Nota2Bimestre;

    //---------------------------------------------------------------------------------
    Notas  (String  nuevoNombre){
        nombre=nuevoNombre;
    }
    String getNombre(){
        return nombre;
    }
    String  getApellido(){
        return apellido;
    }
    float getNota1Bimestre(){
        return Nota1Bimestre;
    }
    float getNota2Bimestre(){
        return Nota2Bimestre;
    }

    //---------------------------------------------------------------------------------
    void setNombre (String newNombre){
        this.nombre=newNombre;
    }
    void setApellido (String  newApellido){
        this.apellido=newApellido;
    }
    void setNota1Bimestre (float newNota1Bimestre){
        this.Nota1Bimestre=newNota1Bimestre;
    }
    void setNota2Bimestre (float newNota2Bimestre){
        this.Nota2Bimestre=newNota2Bimestre;
    }
}