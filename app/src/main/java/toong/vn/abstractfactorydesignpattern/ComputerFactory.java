package toong.vn.abstractfactorydesignpattern;

import toong.vn.abstractfactorydesignpattern.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
	}
}