
package exercício1;

//classe filha herdeira de Pessoa
public class Funcionario extends Pessoa{ 
//extends + nome da classe herda os atributos String Double e Double da classe pessoa
    public int matricula;
    
    public Funcionario(String nome,Double altura,Double peso, int matricula){
        super(nome, altura, peso);
        //super herda todos os métodos e atributos do construtor Pessoa e são atribuídos aos parâmetros dentro do construtor Funcionário
        this.matricula = matricula;
    }
        public void printFuncionario(){
            System.out.println("matrícula :" +matricula);
        }
    }

