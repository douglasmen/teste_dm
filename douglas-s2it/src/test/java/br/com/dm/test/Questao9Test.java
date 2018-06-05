package br.com.dm.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.dm.BinaryTree;
import br.com.dm.Questao9;

public class Questao9Test {

	private Questao9 questao9;
	
	@Before
	public void init() {
		setQuestao9(new Questao9());
	}
	
	@Test
	public void somaNosNull() {
		Assert.assertEquals(0, getQuestao9().somaNos(null));
	}
	
	@Test
	public void somaOk1() {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(10);
		Assert.assertEquals(10, getQuestao9().somaNos(binaryTree));
	}

	@Test
	public void somaOk2() {
		BinaryTree principal = criaBinaryTree(10);
		BinaryTree binaryTree1 = criaBinaryTree(10);
		BinaryTree binaryTree2 = criaBinaryTree(10);
		principal.setLeft(binaryTree1);
		principal.setRight(binaryTree2);
		Assert.assertEquals(30, getQuestao9().somaNos(principal));
	}

	@Test
	public void somaOk3() {
		BinaryTree principal = criaBinaryTree(121);
		BinaryTree binaryTree = criaBinaryTree(115);
		BinaryTree binaryTree1 = criaBinaryTree(88);
		BinaryTree binaryTree3 = criaBinaryTree(548);
		binaryTree1.setLeft(binaryTree3);
		principal.setLeft(binaryTree);
		principal.setRight(binaryTree1);
		Assert.assertEquals(872, getQuestao9().somaNos(principal));
	}
	
	@Test
	public void somaOk4() {
		BinaryTree principal = criaBinaryTree(121);
		BinaryTree binaryTree = criaBinaryTree(115);
		BinaryTree binaryTree1 = criaBinaryTree(88);
		binaryTree.setLeft(binaryTree1);
		principal.setLeft(binaryTree);
		principal.setRight(binaryTree1);
		Assert.assertEquals(412, getQuestao9().somaNos(principal));
	}
	
	@Test
	public void somaOk5() {
		BinaryTree principal = criaBinaryTree(121);
		BinaryTree binaryTree = criaBinaryTree(115);
		BinaryTree binaryTree1 = criaBinaryTree(88);
		binaryTree.setLeft(binaryTree1);
		binaryTree.setRight(binaryTree1);
		principal.setLeft(binaryTree);
		principal.setRight(binaryTree1);
		Assert.assertEquals(500, getQuestao9().somaNos(principal));
	}

	public BinaryTree criaBinaryTree(int valor) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(valor);
		return binaryTree;
	}
	
	public Questao9 getQuestao9() {
		return questao9;
	}

	public void setQuestao9(Questao9 questao9) {
		this.questao9 = questao9;
	}
	
}
