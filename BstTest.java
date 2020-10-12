package com.binarysearchtree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class BstTest {

	@Test
	void test() {
		BinaryTree<Integer> bst = new BinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(60);
		bst.add(95);
		bst.add(11);
		bst.add(65);
		bst.add(3);
		bst.add(16);
		bst.add(63);
		bst.add(67);
		int size=bst.getSize();
		Assert.assertEquals(13, size);
		boolean flag = bst.searchKey(100);
		Assert.assertEquals(false, flag);
	}

}
