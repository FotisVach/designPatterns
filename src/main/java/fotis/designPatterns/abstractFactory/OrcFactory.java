package fotis.designPatterns.abstractFactory;

/**
 * Concrete implementation of {@link AbstractFactory}
 */
class OrcFactory implements AbstractFactory {

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}

	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

}
