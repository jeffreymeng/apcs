/* str.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 | https://github.com/jeffreymeng/apcs/*/
/**
 * str.java
 * str.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
 * Licensed under the apache license version 2.0. 
 * 
 * Copyright 2016 Jeffrey Meng
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package jeffutils;


public class str {
	public static String SpecialCharacters = "~`(!)@-#_$+%=^{[&}]*\\|/'\"?.,<>";
	public static String Numbers = "0123456789";
	public static String Alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static String AlphabetCaps = Alphabet.toUpperCase();
	public static String AlphaNumeric = Alphabet + AlphabetCaps + Numbers;
	public static String Characters = AlphaNumeric + SpecialCharacters;
	public static String[] SpecialCharactersArr = SpecialCharacters.split("");
	public static String[] NumbersArr = Numbers.split("");
	public static String[] AlphabetArr = Alphabet.split("");
	public static String[] AlphaNumericArr = AlphaNumeric.split("");
	public static String[] CharactersArr = Characters.split("");
	public static String part(String str, int index, int index2) {
		String[] strArr = str.split("");
		String result = "";
		if (index > index2) {
			for (int i = index; i > index2 - 1; i --) {
				result += strArr[i];
			}
		} else {
			for (int i = index; i < index2 + 1; i ++) {
				result += strArr[i];
			}
		}
		return result;

	}
	
	public static boolean isAlphabetical(String w) {
		int lastLetter = 0;// A
		String[] word = w.toLowerCase().split("");
		for (int i = 0; i <= word.length - 1; i ++) {
			
			// if letter is before current letter, return false
			if (Alphabet.indexOf(word[i]) < lastLetter) {
				return false;
			} 
			lastLetter = Alphabet.indexOf(word[i]);
		}
		return true;
	}
	

}
