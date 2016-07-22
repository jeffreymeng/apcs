/* sort.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 | https://github.com/jeffreymeng/apcs/*/
/**
 * sort.java
 * sort.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
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
import apcs.Window;
import jeffutils.Arr;

public class Sort {
	public static long selection(int[] array, boolean draw) {
		
		long drawTime = 0;
		
		for (int i = 0; i < array.length; i ++) {
			int smallestIndex = Arr.smallestIndex(array, i);
			Arr.swap(array, i, smallestIndex);
			if (draw) {
				//add the draw time to the drawTime variable
				long startTime = System.nanoTime();
				draw(array);
				long endTime = System.nanoTime();
				drawTime += (endTime - startTime);
				
			}
			
		}
		return drawTime;
	}
	//for two numbers, if 
	public static long bubble(int[] array, boolean draw) {
		
		long drawTime = 0;
		int sortCount = 0;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for (int i = 0; i < array.length - 1 - sortCount; i ++) {
				if (array[i] > array[i + 1]) {
					Arr.swap(array, i, i + 1);
					swapped = true;
				}
				
			}
			sortCount ++;
			if (draw){
				long startTime = System.nanoTime();
				draw(array);
				long endTime = System.nanoTime();
				drawTime += (endTime - startTime);
			}
		}
		return drawTime;
	}
	//keep moving a element left until it reaches either the end or a number smaller
	public static long insertion(int[] array, boolean draw) {
		long drawTime = 0;
		for (int i = 1; i < array.length; i ++) {
			int temp = array[i];
			int shiftIndex = i - 1;
			while (shiftIndex >= 0 && array[shiftIndex] > temp) {
				array[shiftIndex + 1] = array[shiftIndex];
				shiftIndex --;
			}
			array[shiftIndex + 1] = temp;
			if (draw) {
			long startTime = System.nanoTime();
			draw(array);
			long endTime = System.nanoTime();
			drawTime += (endTime - startTime);
			}
		}
		return drawTime;
	}
	public static void draw(int[] array) {
        Window.out.background();
        int count = (int) Math.sqrt(array.length);
        int side = Window.height() / count;
        for (int i = 0; i < array.length; i++) {
            int x = (i % count) * side + side / 2;
            int y = (i / count) * side + side / 2;
            Window.out.color(array[i], array[i], array[i]);
            Window.out.square(x, y, side);
        }
        Window.frame();
    }
}
