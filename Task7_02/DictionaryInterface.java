package Task7_02;

public class ObjectDictionary<Type>{
    public Type origin;
    public Type translation;

    public ObjectDictionary() {
        this.origin = (Type) new Object();
        this.translation = (Type) new Object();
    }
}
