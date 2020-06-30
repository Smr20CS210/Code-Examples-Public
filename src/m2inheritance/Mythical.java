package m2inheritance;
public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}