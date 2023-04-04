
package exercício1;


public class Funcionario extends Pessoa{ 
//extends + nome da classe herda os atributos da classe pessoa
    public int matricula;
    
    public Funcionario(String nome,Double altura,Double peso, int matricula){
        super(nome, altura, peso);
        //super herda todos os métodos e atributos e são atribuídos aos parâmetros dentro do construtor funcionário
        this.matricula = matricula;
    }
        public void printFuncionario(){
            System.out.println("matrícula :" +matricula);
        }
    }

