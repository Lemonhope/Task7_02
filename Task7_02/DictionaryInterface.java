package Task7_02;

public interface DictionaryInterface<Type>{
    void add(Type originWord, Type translatedWord);
    Type getTranslation(Type originWord);
    int getWordsCount();
}
