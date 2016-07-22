/* RecursionIntro.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 (http://www.apache.org/licenses/LICENSE-2.0) | https://github.com/jeffreymeng/apcs/*/
/**
 * RecursionIntro.java
 * RecursionIntro.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
 * Licensed under the Apache license version 2.0. 
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
package day5;

import apcs.Window;

public class RecursionIntro {

	public static void main(String[] args) {
		square(250, 250, 100);
		while(!Window.key.pressed('q')) {
			if (Window.mouse.clicked()) {
				Window.frame();
				square(250, 250, 100);
			}
		}
	}
	public static void square(int x, int y, int size) {
		if (size < 1) {
			return;
		}
		Window.out.randomColor();
		Window.out.square(x,  y,  size);
		square(x - size, y, size / 2);
		square(x + size, y, size / 2);
		square(x, y - size, size / 2);
		square(x, y + size, size / 2);
	}
	/*
	public static void recursiveCC(int number) {
		System.out.println(number);
		if (number <= 1) {
			
			return;
		}
		else if (number % 2 == 0) {
			number/=2;
			recursiveCC(number);
		}
		else {
			number = number *3 + 1;
			recursiveCC(number);
		}
		
	}
	*/
	

}
