package AbstractFactoryPattern.abst;

public interface BikeFactory {
	Body createBody();
	Wheel createWheel();
}
