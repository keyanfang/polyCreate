package fr.univcotedazur.kairos.webots.polycreate.controler;

import com.yakindu.core.rx.Observer;

public class myCoverAreaObserver implements Observer<Void> {
	
	PolyCreateControler gui;
	myCoverAreaObserver(PolyCreateControler sw){
		gui=sw;
	}
@Override
public void next(Void value) {
System.out.println("this is a reaction to a coverArea event");
	gui.coverArea();
}
}