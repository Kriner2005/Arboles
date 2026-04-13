package co.uptc.edu.trees;

import java.util.ArrayList;
import java.util.List;

public class BiTree<T> {
    private Node<T> root;

    public BiTree() {
        this.root = new Node<T>(null);
    }

    public List<T> preOrder() {
        List<T> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void preOrder(Node<T> node, List<T> list) {
        if (node == null) {
            return;
        }

        list.add(node.getValue());
        preOrder(node.getLeft(), list);
        preOrder(node.getRight(), list);
    }

    public List<T> order() {
        List<T> list = new ArrayList<>();
        order(root, list);
        return list;
    }

    public void order(Node<T> node, List<T> list) {
        if (node == null) {
            return;
        }
        order(node.getLeft(), list);
        list.add(node.getValue());
        order(node.getRight(), list);
    }

    public List<T> postOrder() {
        List<T> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    public void postOrder(Node<T> node, List<T> list) {
        if (node == null) {
            return;
        }

        postOrder(node.getLeft(), list);
        postOrder(node.getRight(), list);
        list.add(node.getValue());
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
