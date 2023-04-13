
package exercício1;


public class Exercício1 {


    public static void main(String[] args) {
       Pessoa p = new Pessoa("zé" , 1.75 , 80.0);
        //contrutor manual
       Funcionario X2 = new Funcionario("beto" , 1.65 , 75.0 , 1000);
        //contrutor manual
       p.printPessoa();
       //objeto p chama o método printPessoa para imprimir os atributos no console
       X2.printPessoa();
       //objeto X2 chama o método
       X2.printFuncionario();
       //objeto X2 chama o método printFuncionário para imprimir os atributos da classe Pessoa + atributo matrícula
    }
    
}
