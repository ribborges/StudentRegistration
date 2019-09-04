package projeto;

public class Projeto {
    public static void main(String[] args) {
        
        Turma T1 = new Turma ("POO", 1);
        
        Aluno A1 = new Aluno("Henrique", 15);
        Aluno A2 = new Aluno("Richard", 19);
        Aluno A3 = new Aluno("Vinícius", 13);
        Aluno A4 = new Aluno("Thiago", 12);
        
        T1.CadastroAluno(A1);
        T1.CadastroAluno(A2);
        T1.CadastroAluno(A3);
        T1.CadastroAluno(A4);
        
        System.out.println(T1.getDisciplina());
        System.out.println(T1.getCodTurma());
        System.out.println(T1.AlunosTurma[0].getNome());
        System.out.println(T1.AlunosTurma[0].getIdade());
        System.out.println(T1.AlunosTurma[1].getNome());
        System.out.println(T1.AlunosTurma[1].getIdade());
        System.out.println(T1.AlunosTurma[2].getNome());
        System.out.println(T1.AlunosTurma[2].getIdade());
        System.out.println(T1.AlunosTurma[3].getNome());
        System.out.println(T1.AlunosTurma[3].getIdade());
    }
    
}