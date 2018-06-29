package com.lcc;

import java.util.regex.Pattern;

/**
 * @author: lcc
 * @Date: 2018-06-11
 **/
public class TestLcc {

	public static void main(String[] args) {
		boolean a = Pattern.matches("[^\\w\\s]{1}", " ");
		boolean b= Pattern.matches("[^\\w\\s]{1}", ";");
		boolean c =Pattern.matches("[^\\w\\s]{1}", "\"");
		boolean d =Pattern.matches("[^\\w\\s]{1}", ".");

		boolean e =Pattern.matches("[^\\w\\s]{1}", "$");

		 e =Pattern.matches("[^\\w\\s]{1}", "$$");
		e =Pattern.matches("[^\\w\\s]{1}", "阿达");

	}
	public void dealSolrString(String conent){


	}


}


