package br.edu.uniritter.pilha;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alu201011612
 */
class Pilha<T> implements Stack<T> {

    private List<T> itens = new LinkedList();

    @Override
    public void push(T item) {
        itens.add(item);
    }

    @Override
    public T pop() {
        return itens.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return itens.isEmpty();
    }

    public void clear() {
        itens.clear();
    }

}
