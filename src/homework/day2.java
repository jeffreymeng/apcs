/* day2.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 | https://github.com/jeffreymeng/apcs/*/
/**
 * day2.java
 * day2.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
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
package homework;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

import jeffutils.str;
import jeffutils.arr;

public class day2 {
	public static void main(String[] args) {
		System.out.println("Is Alphabetical:" + str.isAlphabetical(str.Alphabet));
		System.out.println("Is Alphabetical:" + str.isAlphabetical("aabbcck"));
		System.out.println("Is Alphabetical:" + str.isAlphabetical("aabbckc"));
		System.out.println("Is Palendrome:" + isPalendrome("Hello"));
		System.out.println("Is Palendrome:" + isPalendrome("racecar"));
		System.out.println("Is Palendrome:" + isPalendrome("Degas, are we not drawn onward, we freer few, drawn onward to new eras aged?"));
		System.out.println("Is Palendrome:" + isPalendrome("Eva, can I stab bats in a cave?"));
		System.out.println("Is Secure:" + isSecure("asdUdjs@"));
		System.out.println("Is Secure:" + isSecure("Udjs@"));
		System.out.println("Is Secure:" + isSecure("asdffs#"));
		System.out.println("Digit Sum:" + digitSum(281));
		System.out.println("Candy Distribute:" + candyDistribute(6));
	}
	public static boolean isPalendrome(String word) {
		return (word.toLowerCase().replaceAll("[^a-z]", "").equals(str.part(word.toLowerCase().replaceAll("[^a-z]", ""), word.toLowerCase().replaceAll("[^a-z]", "").length() - 1, 0)));
	}
	public static boolean isSecure(String password) {
		Pattern p = Pattern.compile("[!#$@]");
		Matcher m = p.matcher(password);
		Pattern p2 = Pattern.compile(str.AlphabetCaps);
		Matcher m2 = p2.matcher(password);
		return (password.length() >= 8) && m.find() && m2.find();
	}
	public static int digitSum(int number) {
		
		int[] intArr = new int[Integer.toString(number).length()];
		for (int i = 0; number > 0; i ++) {
		    intArr[i] = number % 10;
		    number = number / 10;
		}
		return arr.sum(intArr);
		
	}
	public static int candyDistribute(int candy) {
		int i = 1;
		for(;candy > 0; i ++) {
			//System.out.println(":" + i * i);
			
			
			candy -= i * i;
		}
		return i - 1;
	}
}
