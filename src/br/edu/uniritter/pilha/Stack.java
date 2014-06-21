package br.edu.uniritter.pilha;

/**
 *
 * @author alu201011612
 * @param <T>
 */
public interface Stack<T> {

    public void push(T object);
    public T pop();
    public boolean isEmpty();

}
