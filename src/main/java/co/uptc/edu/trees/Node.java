package co.uptc.edu.trees;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;


    public Node(T value) {
        this.value = value;
    }

    // Getters y setters
    public T getValue() {
        return value;
    }

    public void setValor(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    
}
