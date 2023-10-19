package Task7_02;

public interface DictionaryInterface<Type, Type2>{
    void add(Type originWord, Type2 translatedWord);
    Type2 getTranslation(Type originWord);
    int getWordsCount();
}
