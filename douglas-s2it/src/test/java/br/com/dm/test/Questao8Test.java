package br.com.dm.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.dm.Questao8;


public class Questao8Test {

	private Questao8 questao8 = new Questao8();
	
	@Test
	public void ok1() {
		String a = "13";
		String b = "245";
		Assert.assertEquals(questao8.defineValorC(a, b), 12345);
	}
	
	@Test
	public void ok2() {
		String a = "1 3";
		String b = "245";
		Assert.assertEquals(questao8.defineValorC(a, b), 12345);
	}
	
	@Test
	public void ok3() {
		String a = "135";
		String b = "246";
		Assert.assertEquals(questao8.defineValorC(a, b), 123456);
	}
	
	@Test
	public void ok4() {
		String a = "1";
		String b = "23456";
		Assert.assertEquals(questao8.defineValorC(a, b), 123456);
	}
	
	@Test
	public void ok5() {
		String a = "1 3 6";
		String b = "245";
		Assert.assertEquals(questao8.defineValorC(a, b), 123465);
	}
	
	@Test
	public void ok6() {
		String a = "134";
		String b = "2";
		Assert.assertEquals(questao8.defineValorC(a, b), 1234);
	}
	
	@Test
	public void ok7() {
		String a = "113";
		String b = "224";
		Assert.assertEquals(questao8.defineValorC(a, b), 121234);
	}
	
	@Test
	public void mariorQue1000() {
		String a = "10256";
		String b = "51212";
		Assert.assertEquals(questao8.defineValorC(a, b), -1);
	}
	
	@Test
	public void campoANull() {
		String a = "";
		String b = "245";
		Assert.assertEquals(questao8.defineValorC(a, b), 0);
	}
	
	@Test
	public void campoBNull() {
		String a = "123";
		String b = "";
		Assert.assertEquals(questao8.defineValorC(a, b), 0);
	}
	
}
