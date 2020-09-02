package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public TV getControl() {
		return control.tv;
	}
	public void setControl(TV tv) {
		this.control.tv = tv;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(estado == true) {
		this.canal = canal;
	}
	}	
	public int getNumTV () {
		return numTV;
	}
	public void turnOn () {
		estado = true;
	}
	public void turnOff () {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if( estado == true && canal >= 1 && canal < 120 ) {
			canal++;
		}
	}
	public void canalDown( ) {
		if( estado == true && canal > 1 && canal <= 120) {
			canal--;
		}
	}
	public void volumenUp() {
		if( estado == true && volumen >= 0 && volumen < 7 ) {
			volumen++;
		}	
	}
	public void volumenDown() {
		if( estado == true && volumen > 0 && volumen <= 7 ) {
			volumen--;
		}	
	}
	
}
