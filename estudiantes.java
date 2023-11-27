public class Notas  {
    String nombre;
    String apellido;
    String Nota1Bimestre  ;
    String Nota2Bimestre;

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
    String getNota1Bimestre(){
        return Nota1Bimestre;
    }
    String getNota2Bimestre(){
        return Nota2Bimestre;
    }

    //---------------------------------------------------------------------------------
    void setNombre (String newNombre){
        this.nombre=newNombre;
    }
    void setApellido (String  newApellido){
        this.apellido=newApellido;
    }
    void setNota1Bimestre (String newNota1Bimestre){
        this.Nota1Bimestre=newNota1Bimestre;
    }
    void setNota2Bimestre (String newNota2Bimestre){
        this.Nota2Bimestre=newNota2Bimestre;
    }
}