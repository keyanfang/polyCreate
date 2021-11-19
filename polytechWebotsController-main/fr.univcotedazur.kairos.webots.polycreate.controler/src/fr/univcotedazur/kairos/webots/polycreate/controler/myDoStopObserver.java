package fr.univcotedazur.kairos.webots.polycreate.controler;

import com.yakindu.core.rx.Observer;

public class myDoStopObserver implements Observer<Void> {
	
	PolyCreateControler gui;
	myDoStopObserver(PolyCreateControler sw){
		gui=sw;
	}
@Override
public void next(Void value) {
System.out.println("this is a reaction to a doStop event");
	gui.doStop();
}
}