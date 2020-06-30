package m2inheritance;
public interface Animal {
	default public String identifyMyself() {
		return "I am an animal.";
	}
}