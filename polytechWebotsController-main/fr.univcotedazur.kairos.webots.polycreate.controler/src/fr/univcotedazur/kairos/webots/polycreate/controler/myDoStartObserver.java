package fr.univcotedazur.kairos.webots.polycreate.controler;

import com.yakindu.core.rx.Observer;

public class myDoStartObserver implements Observer<Void> {
	
	PolyCreateControler gui;
	myDoStartObserver(PolyCreateControler sw){
		gui=sw;
	}
@Override
public void next(Void value) {
System.out.println("this is a reaction to a doStart event");
	gui.doStart();
}
}