package boletin11;

public class Seleccion {
    //ATRIBUTOS
    private int id;
    private String nome;
    private String apelido;
    private int edade;

    //CONSTRUCTORES
    public Seleccion(){
        
    }
    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
    
    //METODOS DE ACCESO
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "SELECCION:\n"+"id: " + id + "\nnome: " + nome + "\napelido: " + apelido + "\nedade: " + edade;
    }
    
    //METODOS
    public void concentrase(){
        System.out.println("Concentrase a seleccion");
    }
    public void viaxar(){
        System.out.println("Viaxa a seleccion");
    }
}
