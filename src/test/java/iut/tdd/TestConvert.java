package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zero";
		Convert myConvert = new Convert();
		// When
		
		Assert.assertEquals(expected, myConvert.num2text(input));
		
	
		//0.1-->16
		//10-->100
		//23
		//72
	}
	@Test
	public void test_num2text_un () {
		// Given
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_deux () {
		// Given
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_trois () {
		// Given
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_quatre () {
		// Given
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_cinq () {
		// Given
		String input = "5";
		String expected = "cinq";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_six () {
		// Given
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_sept () {
		// Given
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_huit () {
		// Given
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_neuf () {
		// Given
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_dix () {
		// Given
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_onze () {
		// Given
		String input = "11";
		String expected = "onze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_douze () {
		// Given
		String input = "12";
		String expected = "douze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_treize () {
		// Given
		String input = "13";
		String expected = "treize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_quatorze () {
		// Given
		String input = "14";
		String expected = "quatorze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_quinze () {
		// Given
		String input = "15";
		String expected = "quinze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void test_num2text_seize () {

		Convert myConvert = new Convert();

		Assert.assertEquals("seize", myConvert.num2text("16"));
		
	}
	

	@Test
	public void test_num2text_quatre_vingt_dix () {

		Convert myConvert = new Convert();

		Assert.assertEquals("quatre_vingt_dix", myConvert.num2text("90"));
		
	}
	@Test
	public void test_num2text_quatre_vingt () {

		Convert myConvert = new Convert();

		Assert.assertEquals("quatre_vingt", myConvert.num2text("80"));
		
	}
	@Test
	public void test_num2text_vingt () {

		Convert myConvert = new Convert();

		Assert.assertEquals("vingt", myConvert.num2text("20"));
		
	}
	@Test
	public void test_num2text_trente () {

		Convert myConvert = new Convert();

		Assert.assertEquals("trente", myConvert.num2text("30"));
		
	}
	@Test
	public void test_num2text_quarente () {

		Convert myConvert = new Convert();

		Assert.assertEquals("quarente", myConvert.num2text("40"));
		
	}
	@Test
	public void test_num2text_cinquante () {

		Convert myConvert = new Convert();

		Assert.assertEquals("cinquante", myConvert.num2text("50"));
		
	}
	@Test
	public void test_num2text_soixante () {

		Convert myConvert = new Convert();

		Assert.assertEquals("soixante", myConvert.num2text("60"));
		
	}
	
}
