package aprovacao;

public class Main {
    double mediaAluno;

    void notaAluno(double nota1, double nota2, double nota3){
        mediaAluno = (nota1 + nota2 + nota3) / 3;
        if(mediaAluno >= 7) {
            System.out.println("O estudante teve média " + mediaAluno + " e foi aprovado. ");
        } else if (mediaAluno >= 5) {
            System.out.println("O estudante teve média " + mediaAluno + " e está de recuperação. ");
        } else {
            System.out.println("O estudante teve média " + mediaAluno + " e foi reprovado. ");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.notaAluno(4.5, 6, 8.3);
    }
}