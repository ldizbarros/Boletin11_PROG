package boletin11;

public class Entrenador extends Seleccion {
    //ATRIBUTOS
    private int idFederacion;
    
    //CONSTRUCTORES
    public Entrenador(){
        
    }
    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    public Entrenador(int idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }
    
    //METODOS DE ACCESO
    public int getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "ENTRENADOR:\n"+"id: " +super.getId()+ "\nnome: " +super.getNome()+ 
                "\napelido: " +super.getApelido()+ "\nedade: " +super.getEdade()+
                "\nidFederacion: " + idFederacion;
    }
    
    //METODOS
    @Override
    public void viaxar(){
        System.out.println("Viaxan os xogadores");
    }
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }
}
