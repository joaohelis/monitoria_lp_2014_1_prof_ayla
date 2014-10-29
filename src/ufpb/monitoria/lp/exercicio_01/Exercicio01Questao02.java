package ufpb.monitoria.lp.exercicio_01;

import java.util.Scanner;

// 2. Crie um procedimento/método/função que recebe 3 notas, calcula sua média e retorna sua situação 
// como aluno (aprovado, reprovado ou na final). O aluno é reprovado se tem media inferior a 4. O aluno 
// vai para final se tem nota maior ou igual a 4 e menor que 7. Caso contrário, é aprovado.

public class Exercicio01Questao02 {
	
	enum SituacaoDoAluno{
		
		REPROVADO("Reprovado"),
		APROVADO("Aprovado"),
		FINAL("Final");
		
		private String descricao;
		private float media;
		
		SituacaoDoAluno(String descricao){
			this(descricao, 0f);
		}
		
		SituacaoDoAluno(String descricao, float media){
			this.descricao = descricao;
			this.media = media;
		}
		
		public String getDescricao(){
			return this.descricao;
		}
		
		public void setMedia(float media){
			this.media = media;
		}
		
		public float getMedia(){
			return this.media;
		}
	}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = input.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float nota2 = input.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = input.nextFloat();
		
		SituacaoDoAluno aluSituacao = verificarSituacaoDoAluno(nota1, nota2, nota3);
				
		System.out.println("----------------------------------------------------------");
		System.out.println(">> Situação do aluno: " + aluSituacao.getDescricao());
		System.out.println(">> Média do aluno: " + aluSituacao.getMedia());
		System.out.println("----------------------------------------------------------");
		
	}
	
	public static SituacaoDoAluno verificarSituacaoDoAluno(float nota1, float nota2, float nota3){
		float media = (nota1 + nota2 + nota3)/3;
		SituacaoDoAluno situacao;
		if (media < 4)
			situacao =  SituacaoDoAluno.REPROVADO;
		else if(media < 7)
			situacao =  SituacaoDoAluno.FINAL;
		else
			situacao = SituacaoDoAluno.APROVADO;
		situacao.setMedia(media);
		return situacao;
	}
	
	

}
