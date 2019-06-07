package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		//Declarando
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep: ")));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg: ")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Cpf: ")));
		int dis=0;
		int cur=0;
		
		try {
			dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			
			String disciplinas[] = new String[100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);	
			}
			
				
			
			professor.setDisciplinas(disciplinas);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cursos você possui?"));
			String cursos[] = new String[100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + i);	
			}
			professor.setCursos(cursos);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//Prints
		
		System.out.println("Nome: " + professor.getNome());
		System.out.println("Endereço: " + professor.getEndereco());
		System.out.println("Bairro: " + professor.getBairro());
		System.out.println("Cep: " + professor.getCep());
		System.out.println("Cidade: " + professor.getCidade());
		System.out.println("Estado: " + professor.getEstado());
		System.out.println("Rg: " + professor.getRg());
		System.out.println("Cpf: " + professor.getCpf());
		
		for (int j = 0; j < dis; j++) {
			System.out.println("Disciplinas: " + professor.getDisciplinas()[j]);
			}
		
		for (int j = 0; j < cur; j++) {
			System.out.println("Cursos: " + professor.getCursos()[j]);
			}
		
	}

}
