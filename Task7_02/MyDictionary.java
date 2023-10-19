//Реалізувати у найпростішому наближенні можливість використання його екземпляра.
//Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати
//- метод додавання пар елементів
//- отримання значення елемента за вказаним ключем
//- властивість (тільки для читання) для отримання загальної кількості пар елементів.
package Task7_02;

import java.util.Collections;

public class MyDictionary <Type, Type2> implements DictionaryInterface<Type, Type2>{
    private Type[] originWord;
    private Type2[] translatedWord;
    private final int defaultCapacity=10;
    private int size;

    public MyDictionary() {
        this.originWord= (Type[]) new Object[defaultCapacity];
        this.translatedWord= (Type2[]) new Object[defaultCapacity];
        size=0;
    }

    @Override
    public void add(Type origWord, Type2 transWord) {
        size++;
        if (size > defaultCapacity) {
            Type[] newOrig = (Type[]) new Object[size+size/2];
            Type2[] newTrans = (Type2[]) new Object[size+ size/2];
            System.arraycopy(this.originWord, 0, newOrig, 0, size-1);
            System.arraycopy(this.translatedWord, 0, newTrans, 0, size-1);
            this.originWord=newOrig;
            this.translatedWord=newTrans;
        }
        this.originWord[size - 1] = origWord;
        this.translatedWord[size - 1] = transWord;

    }
    @Override
    public Type2 getTranslation(Type source) {
        int index;
        for(index=0; index < this.size; index++){
            if(source == originWord[index]){
                return translatedWord[index];
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
