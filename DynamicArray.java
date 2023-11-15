public class DynamicArray<T> {
    private T[] array;
    private int size;
    private int capacity;

    DynamicArray() {
        this.size = 0;
        this.capacity = 1;
        this.array = (T[]) new Object[capacity];
    }

    public void add(T element) {
        if(size == capacity) {
            T[] temp = (T[]) new Object[capacity * 2];

            for(int i = 0; i < capacity; i++) {
                temp[i] = array[i];
            }
            capacity *= 2;
            array = temp;
        }
        array[size] = element;
        size++;
    }

    public void replace(T element, int index) {
        if(index < size) array[index] = element;
    }

    public T get(int index) {
        if(size < index) return array[index];

        return null;
    }

    public void pop() {
        size--;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }
}
