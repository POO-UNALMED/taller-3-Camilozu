package taller3.televisores;

public class Control {
TV tv;

public void turnOn () {
	tv.estado = true;
}
public void turnOff () {
	tv.estado = false;
}
public void canalUp() {
	if( tv.estado == true && tv.canal >= 1 && tv.canal < 120 ) {
		tv.canal++;
	}
}
public void canalDown( ) {
	if( tv.estado == true && tv.canal > 1 && tv.canal <= 120) {
		tv.canal--;
	}
}
public void volumenUp() {
	if( tv.estado == true && tv.volumen >= 0 && tv.volumen < 7 ) {
		tv.volumen++;
	}	
}
public void volumenDown() {
	if( tv.estado == true && tv.volumen > 0 && tv.volumen <= 7 ) {
		tv.volumen--;
	}	
}
public void setCanal(int canal) {
	if(tv.estado == true) {
	tv.canal = canal;
	}
}
public void enlazar(TV tv) {
	this.tv = tv;
	tv.control = this;
}
public TV getTv() {
	return tv;
}
public void setTv(TV tv) {
	this.tv = tv;
}
}
