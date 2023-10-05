package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Início do processo seletivo.");
        // Array com a lista de candidatos
        
        // String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        // for (int i = 0; i <= candidatos.length; i++){
        //     case1(valorPretendido());
        // }
        case2();
    }

    static void case1(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
    static void case2(){
        double salarioBase = 2000.0;
		
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String [] candidatosSelecionados = new String[5];
		int totalSelecionados = 0;
		int proximoCandidato = 0; 

		while(totalSelecionados < 5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
			
            if(valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
			}else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                candidatosSelecionados[totalSelecionados] = candidatos[totalSelecionados++];
				//totalSelecionados++;
			}
		}

		System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);

        System.out.println("\n-------------------\n");

        case3(candidatosSelecionados);
    }

    static void case3(String[] candidatosSelecionados) {
		// String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		//forma indexada
		//quando preciso do indice para complementar a lógica
		System.out.println("Imprimindo com a ordem de seleção pelo índice");
		for(int x=0; x<candidatosSelecionados.length; x++) {
			System.out.println("O " + (x+1)+ "° Candidato selecionado é " + candidatosSelecionados [x] );
		}
		
        System.out.println("\n-------------------\n");
		//forma abrevida
		//interação total sem precisar da posição ou indice
		System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
		
		for(String candidato: candidatosSelecionados) {
			System.out.println(candidato);
            //case4(candidato);
		}
		
	}

    static void case4(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
