package personas;

/**
 *
 * @author Heberth Córdova
 */
public class Personal2 {
String Nombrepersona;
String Apellido;
String Nacionalidad;
char Genero;
String eCivil;
int Edad;

//Creamos los constructores
Personal2 (String Nombre_a, String Apellido_a, String Nacionalidad_a,char Genero_a, String eCivil_a, int Edad_a)
{
Nombrepersona=Nombre_a;
Apellido=Apellido_a;
Nacionalidad=Nacionalidad_a;
Genero=Genero_a;
eCivil=eCivil_a;
Edad=Edad_a;
} 
public void Mostrarinf()
{
    System.out.println("NOMBRE: "+Nombrepersona +"\n APELLIDO: "+ Apellido +"\n Nacionalidad: "+Nacionalidad+"\n Genero: "+
                        Genero+"\n Estado Civil: "+eCivil+"\n Edad: "+Edad);
    
}        
}
