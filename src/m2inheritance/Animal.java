package m2inheritance;
public interface Animal {
    // constants must be initialized in interfaces
    public String ANIMAL = "Animal";
	default public String identifyMyself() {
		return "I am an animal.";
	}
}