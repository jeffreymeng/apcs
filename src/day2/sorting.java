/* sorting.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 | https://github.com/jeffreymeng/apcs/*/
/**
 * sorting.java
 * sorting.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
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
package day2;


import apcs.Window;
import jeffutils.arr;
import jeffutils.sort;

public class sorting {
	public static void main(String[] args) {

	}

	public static void sort() {
		Window.size(500, 500);
		Window.frame();
		Window.setFrameRate(10000);
		int[] array = arr.randomArray(9, 0, 255);
		sort.draw(array);
		long startTime = System.nanoTime();
		long drawTime = sort.selection(array, true);
		long endTime = System.nanoTime();
		sort.draw(array);
		long duration = (endTime - startTime) - drawTime;

		System.out.println("done in " + duration +  " nanoseconds");
	}

	
	
}
