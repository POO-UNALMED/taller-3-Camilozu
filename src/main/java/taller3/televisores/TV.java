package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	Marca getMarca() {
		return marca;
	}
	void setMarca(Marca marca) {
		this.marca = marca;
	}
	TV getControl() {
		return control.tv;
	}
	void setControl(TV tv) {
		this.control.tv = tv;
	}
	int getPrecio() {
		return precio;
	}
	void setPrecio(int precio) {
		this.precio = precio;
	}
	int getVolumen() {
		return volumen;
	}
	void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	int getCanal() {
		return canal;
	}
	void setCanal(int canal) {
		if(estado == true) {
		this.canal = canal;
	}
	}	
	int getNumTV () {
		return numTV;
	}
	void turnOn () {
		estado = true;
	}
	void turnOff () {
		estado = false;
	}
	boolean getEstado() {
		return estado;
	}
	void canalUp() {
		if( estado == true && canal >= 1 && canal < 120 ) {
			canal++;
		}
	}
	void canalDown( ) {
		if( estado == true && canal > 1 && canal <= 120) {
			canal--;
		}
	}
	void volumenUp() {
		if( estado == true && volumen >= 0 && volumen < 7 ) {
			volumen++;
		}	
	}
	void volumenDown() {
		if( estado == true && volumen > 0 && volumen <= 7 ) {
			volumen--;
		}	
	}
	
}
