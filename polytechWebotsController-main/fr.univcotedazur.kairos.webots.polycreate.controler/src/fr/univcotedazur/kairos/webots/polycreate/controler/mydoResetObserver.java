package fr.univcotedazur.kairos.webots.polycreate.controler;

import com.yakindu.core.rx.Observer;

public class mydoResetObserver implements Observer<Void> {
	
	PolyCreateControler gui;
	mydoResetObserver(PolyCreateControler sw){
		gui=sw;
	}
@Override
public void next(Void value) {
System.out.println("this is a reaction to a doReset event");
	gui.doReset();
}
}