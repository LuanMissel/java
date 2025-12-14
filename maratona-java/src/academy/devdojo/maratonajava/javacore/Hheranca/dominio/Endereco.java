package src.academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    // Constructors

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    //getters and setters

    public void setRua (String Rua){
        this.rua = Rua;
    }

    public String getRua(){
        return this.rua;
    }

    public void setCep (String Cep){
       this.cep = Cep;
    }

    public String getCep() {
        return this.cep;
    }
}
