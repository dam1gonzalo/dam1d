import java.util.Scanner;
import java.util.HashMap;
//peque�a modificaci�n
public class Camello {
	private String nombre;
	private static Scanner entrada;
	public HashMap<String, String> mapa;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		Camello camello = new Camello("Nachote Escobar");
		camello.saludo();
		camello.inicializarMapa();
		while(true){
			camello.conver();
		}
		
	}
	public Camello(String nombre){
		this.nombre = nombre;
	}
	public void saludo(){
		System.out.println("Hola, soy un camello, y me llamo "+ nombre+" �que te interesa?, tengo desde pirulas de PHP hasta dosis de Assembly");
		System.out.println("(Puedes poner una frase como: 'Dame un poco de php porfa' O CUALQUIER COSA QUE SE TE OCURRA)");
	}
	public void inicializarMapa(){
		mapa = new HashMap<String,String>();
		mapa.put("assembly", "Est�s seguro de que quieres Assembly?, son dosis muy potentes, puede que tu cerebro explote.");
		mapa.put("php", "Buuuu eres un d�bil, hubiese gozado m�s que me hubieses pedido Ruby on Rails");
		mapa.put("c", "Que atrevido, C goza");
		mapa.put("c++", "Yea, tu si que sabes, C++ es la ca�a");
		mapa.put("java", "Bueno, Java esta bien");
		mapa.put("ruby on rails", "jeje, pretendes ganar 40000� al mes con ruby eeee, ya ver�s que coloc�n te dan");
		mapa.put("tonto", "tonto tu");
		mapa.put("subnormal", "rebota, rebota y en tu cara explota");
		mapa.put("gilipollas", "rebota, rebota y en tu cara explota");
		mapa.put("cobol", "vas a trabajar en alguna app para un banco?, en fin, disfruta del coloc�n");
		mapa.put("javascript", "mmm conozco a una persona que te podr�a ayudar con ello, se llama Antonio, su telefono es: 555-12321312");
		mapa.put("css", "o dios santo, ten cuidado");
	}
	
	public void conver(){
		String cadena = " "+entrada.nextLine().toLowerCase()+" ";
		boolean respondido = false;
		for(String palabra : mapa.keySet()){
			if(cadena.contains(" "+palabra+" ") || cadena.contains(" "+palabra+"?") || cadena.contains(" "+palabra+"!")){
				System.out.println(mapa.get(palabra));
				respondido = true;
				break;
			}
		}
		if(respondido){
			System.out.println("�Qu� m�s deseas?");
		}
		else{
			System.out.println("No tengo de eso");
		}
		
	}
}