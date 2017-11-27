package boletin11;

public class Xogador extends Seleccion {
    //ATRIBUTOS
    private int dorsal;
    private int demarcacion;
    
    //CONSTRUCTORES
    public Xogador(){
        
    }
    public Xogador(int dorsal, int demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public Xogador(int dorsal, int demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    //METODOS DE ACCESO
    public int getDorsal() {
        return dorsal;
    }

    public int getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "XOGADOR:\n"+"id: " +super.getId()+ "\nnome: " +super.getNome()+ 
                "\napelido: " +super.getApelido()+ "\nedade: " +super.getEdade()+
                "\ndorsal: " + dorsal + "\ndemarcacion: " + demarcacion;
    }
    
    //METODOS
    @Override
    public void viaxar(){
        System.out.println("Viaxan os xogadores");
    }
    public void xogarPartido(){
        
    }
    public void entrenar(){
        
    }
}
