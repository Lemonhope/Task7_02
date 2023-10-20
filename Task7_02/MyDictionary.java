package Task7_02;

import java.util.Collections;

public class MyDictionary <Type> implements DictionaryInterface<Type>{

    private ObjectDictionary<Type> dictionary[];
    private static final int defaultCapacity=10;
    private int size;

    public MyDictionary() {
        this.dictionary = new ObjectDictionary[defaultCapacity];
        for (int i=0;i<defaultCapacity;i++) {
            this.dictionary[i]=new ObjectDictionary<>();
        }
        size=0;
    }

    @Override
    public void add(Type origWord, Type transWord) {
        size++;
        if (size > defaultCapacity) {
            ObjectDictionary[] newDict = new ObjectDictionary[size+ size/2];
            System.arraycopy(this.dictionary, 0, newDict, 0, size-1);
            this.dictionary = newDict;
        }

        //System.out.println(dictionary.length);
        this.dictionary[size - 1].origin = origWord;
        this.dictionary[size - 1].translation = transWord;

    }
    @Override
    public Type getTranslation(Type source) {
        int index;
        for(index=0; index < this.size; index++){
            if(source == dictionary[index].origin){
                return (Type) dictionary[index].translation;
            }
        }
        System.out.println("No word found in dictionary.");
        return null;
    }

    @Override
    public int getWordsCount() {
        return this.size;
    }

}
