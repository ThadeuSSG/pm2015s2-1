
public class MainProgram 
{
	public static void main(String[] args) 
	{
		VerificadorSenha verificador = new VerificadorSenha();
		boolean forte = verificador.verifica("Ab#123456");
		String resultado = forte ? "Forte" : "Fraca";
		System.out.println("Resultado: " + resultado);
	}
}