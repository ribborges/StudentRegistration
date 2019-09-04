package projeto;

public class Aluno {
    String nome;
    int idade;
    
    Aluno (String n, int i){
        nome = n;
        idade = i;
    }
    
    String getNome(){
        return nome;
    }
    
    int getIdade(){
        return idade;
    }
}
