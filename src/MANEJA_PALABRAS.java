
public class MANEJA_PALABRAS {
	private PALABRA p;

	public MANEJA_PALABRAS() {
		p = new PALABRA();
	}

	public String traducir(String palabra) {

		String[] esp = p.getEspañol();
		String[] ing = p.getIngles();

		for (int i = 0; i < esp.length; i++) {
			if (palabra.equalsIgnoreCase(esp[i])) {
				return ing[i];
	        }
		}
	    return "NO ENCONTRADO";
	}
}
