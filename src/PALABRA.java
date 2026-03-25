
public class PALABRA {
	private String[] español;
    private String[] ingles;
    
    public PALABRA() {
        español = new String[]{"perro", "gato", "elefante"};
        ingles = new String[]{"dog", "cat", "elephant"};
    }

	public String[] getEspañol() {
		return español;
	}

	public void setEspañol(String[] español) {
		this.español = español;
	}

	public String[] getIngles() {
		return ingles;
	}

	public void setIngles(String[] ingles) {
		this.ingles = ingles;
	}
}
