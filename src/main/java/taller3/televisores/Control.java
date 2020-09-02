package taller3.televisores;

public class Control {
TV tv;

void turnOn () {
	tv.estado = true;
}
void turnOff () {
	tv.estado = false;
}
void canalUp() {
	if( tv.estado == true && tv.canal >= 1 && tv.canal < 120 ) {
		tv.canal++;
	}
}
void canalDown( ) {
	if( tv.estado == true && tv.canal > 1 && tv.canal <= 120) {
		tv.canal--;
	}
}
void volumenUp() {
	if( tv.estado == true && tv.volumen >= 0 && tv.volumen < 7 ) {
		tv.volumen++;
	}	
}
void volumenDown() {
	if( tv.estado == true && tv.volumen > 0 && tv.volumen <= 7 ) {
		tv.volumen--;
	}	
}
void setCanal(int canal) {
	if(tv.estado == true) {
	tv.canal = canal;
	}
}
void enlazar(TV tv) {
	this.tv = tv;
	tv.control = this;
}
TV getTv() {
	return tv;
}
void setTv(TV tv) {
	this.tv = tv;
}
}
