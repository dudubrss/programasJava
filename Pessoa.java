
package exercício1;


public class Pessoa {
    //superclass
    private String nome;
    private Double altura;
    private Double peso;
    //declaração de atributos da classe pessoa
    
    public Pessoa(String nome, Double altura, Double peso){
        //contrutor da classe pessoa com parâmetros
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getAltura(){
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso(){
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    //métodos get/set para retornar e definir variáveis
    
 public void printPessoa(){
     //método para imprimir no console os atributos declarados
     System.out.println(" nome :" + nome + "\n altura :" + altura + "\n peso :" + peso);
 }
 
}
