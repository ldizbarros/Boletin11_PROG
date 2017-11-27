package boletin11;

public class Masaxista extends Seleccion  {
    //ATRIBUTOS
    private String titulacion;
    private int anosEsperiencia;
    
    //CONSTRUCTORES
    public Masaxista(){
        
    }
    public Masaxista(String titulacion, int anosEsperiencia) {
        this.titulacion = titulacion;
        this.anosEsperiencia = anosEsperiencia;
    }
    public Masaxista(String titulacion, int anosEsperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosEsperiencia = anosEsperiencia;
    }
    
    //METODOS DE ACCESO
    public String getTitulacion() {
        return titulacion;
    }
    public int getAnosEsperiencia() {
        return anosEsperiencia;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosEsperiencia(int anosEsperiencia) {
        this.anosEsperiencia = anosEsperiencia;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "MASAXISTA:\n"+"id: " +super.getId()+ "\nnome: " +super.getNome()+ 
                "\napelido: " +super.getApelido()+ "\nedade: " +super.getEdade()+
                "\ntitulacion: " + titulacion + "\nanosEsperiencia: " + anosEsperiencia;
    }
    
    //METODOS
    @Override
    public void viaxar(){
        System.out.println("Viaxan os xogadores");
    }
    public void darMasaxe(){
        
    }
}
