package tp3ejercicio4;

public class AreaEmpresa {
	private String ID;
	private int tardanza;
	
	public AreaEmpresa (String ID, int tardanza) {
		this.ID = ID;
		this.tardanza = tardanza;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getTardanza() {
		return tardanza;
	}

	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
}