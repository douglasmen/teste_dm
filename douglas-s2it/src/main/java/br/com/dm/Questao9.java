package br.com.dm;

public class Questao9 {

	private BinaryTree binaryTree;
	
	/**
	 * Soma os valores recursivamente
	 * @param binaryTree
	 * @return
	 */
    public int somaNos(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        return binaryTree.getValor() + somaNos(binaryTree.getLeft()) + somaNos(binaryTree.getRight());
    }
    
    public BinaryTree getBinaryTree() {
		return binaryTree;
	}

	public void setBinaryTree(BinaryTree binaryTree) {
		this.binaryTree = binaryTree;
	}
	
}
