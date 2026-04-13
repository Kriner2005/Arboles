package co.uptc.edu;

import co.uptc.edu.trees.BiTree;
import co.uptc.edu.trees.Node;

public class Main {
    // leer archivo yaml subirlo a memoria en strings a lista
    public static void main(String[] args) throws Exception {
        // Crear nodos
        Node<String> A = new Node<>("A");
        Node<String> B = new Node<>("B");
        Node<String> C = new Node<>("C");
        Node<String> D = new Node<>("D");
        Node<String> E = new Node<>("E");
        Node<String> F = new Node<>("F");

        // Construir relaciones
        A.setLeft(B);
        A.setRight(C);

        B.setLeft(D);
        B.setRight(E);

        C.setRight(F);

        // Crear árbol
        BiTree<String> tree = new BiTree<>();
        tree.setRoot(A);

        for (String value : tree.postOrder()) {
            System.out.println(value);
        }
    }

}