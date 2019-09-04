package projeto;

public class Turma {
    int codT;
    String disciplina;
    int ultimoA;
    Aluno[] AlunosTurma;
    
    Turma (String n, int c)
    {
        AlunosTurma = new Aluno[50];
        ultimoA = 0;
        disciplina = n;
        codT = c;
    }
    
    void CadastroAluno (Aluno A){
        AlunosTurma[ultimoA] = A;
        ultimoA++;
    }
    
    String getDisciplina(){
        return disciplina;
    }
    
    int getCodTurma(){
        return codT;
    }
}
