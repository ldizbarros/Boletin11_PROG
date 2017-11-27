package boletin11;

/**Crear un proxecto que simule o comportamento dunha selección de futbol.
 * Para iso definir 3 clases que representan a obxectos xogador, adestrador e masaxista .
 * A clase Xogador ten o seguinte: 
 *  - atributos : id (int ), 
 *                nome ( String), 
 *                apelido ( String ),
 *                edade (int ), 
 *                dorsal ( int ), 
 *                demarcación ( String ).
 *  - métodos : concentrarse () : void 
 *              viaxar ( ) : void
 *              xogarPartido ( ) : void
 *              entrenar ( ) : void
 * A clase Adestrador ten o serguinte:
 *  - atributos : id (int ), 
 *                nome ( String), 
 *                apelido ( String ),
 *                edade (int ), 
 *                idFederacion ( String )
 *  - métodos : concentrarse () : void 
 *              viaxar ( ) : void
 *              dirixirPartido ( ) : void
 *              dirixirAdestramento ( ) : void
 * A clase masaxista ten o seguinte: 
 *  - atributos : id (int ), 
 *                nome ( String), 
 *                apelido ( String ),
 *                edade (int ), 
 *                titulacion (String),  
 *                anosExperiencia (int )
 *  - métodos : concentrarse () : void 
 *              viaxar ( ) : void
 *              darMasaxes ( ) : void
 */
public class Boletin11 {

    public static void main(String[] args) {
       //instancia un obxecto de cada clase 
       Seleccion s1= new Seleccion(745896,"Rogelio","Fernandez",27);
       System.out.println(s1.toString());
       Xogador x1 = new Xogador(7,5454,747485,"Pedro","Lopez",23);
       System.out.println(x1.toString());
       Entrenador e1 = new Entrenador(745896,747456,"Felipe","Vazquez",52);
       System.out.println(e1.toString());
       Masaxista m1 = new Masaxista("grado en fisoteriapia",5,745698,"Lorena","Barros",26);
       System.out.println(m1.toString());
       
       //Instancia un xogador de tipo Seleccion
       Seleccion sx1 = new Xogador(6,5374,743624,"Elias","Rodriguez",21);
       System.out.println(sx1.toString());
       
       //chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
       s1.concentrase();
       x1.concentrase();
       e1.concentrase();
       m1.concentrase();
       //ao quere chamar o metodo este non sale reslatado e da un error
       
       //Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
       s1.viaxar();
       x1.viaxar();
       e1.viaxar();
       m1.viaxar();
       
       //¿ Podes invocar a un método da superclase con un obxecto dunha subclase ?.Comprobao
        System.out.println(x1.getEdade());
       
       //¿ Podes invocar a un método da subclase con un obxecto do tipo da superclase ? .Comprobao
            //Non se pode
    }
    
}
