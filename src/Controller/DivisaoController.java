package Controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int div(int dividendo,int divisor,int resultado,int resto,int incremento) {
		
		//Condicao de parada
		// linha de if o resultado for igual a 0 retornar 0
		if (resultado == 0 ) {
		 return 0;
			
		//se for diferente de 0 faça
	} else {	
	
		// resultado vai ser dividendo / divisor
		resultado = dividendo / divisor;
		
		resto = dividendo % divisor ;
		
		// se o resto for igual a 9 conta + 1
		if (resto == 9) {
		incremento = incremento + 1;
		return incremento + div(resultado,9);
		 //return 1+ div(dividendo,divisor,resultado,resto);
			
			// fazer a proxima conta que é o resultado do anterior / divisor
			 // resultado = resultado/divisor;
		}
	}

		}
	}
	