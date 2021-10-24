package fotis.designPatterns.abstractFactory;

/**
 * Concrete implementation of {@link AbstractFactory}
 */
class HumanFactory implements AbstractFactory {

	@Override
	public Army createArmy() {
		return new HumanArmy();
	}

	@Override
	public Castle createCastle() {
		return new HumanCastle();
	}

	@Override
	public King createKing() {
		return new HumanKing();
	}

}
