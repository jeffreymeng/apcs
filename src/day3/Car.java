/* Car.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 (http://www.apache.org/licenses/LICENSE-2.0) | https://github.com/jeffreymeng/apcs/*/
/**
 * Car.java
 * Car.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
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
package day3;

import apcs.Window;

//object
public class Car {

	// car characteristics
	//fields
	int size = 4;
	int speed = 9;
	String color = "red";
	int capacity= 2;
	boolean driving = false;
	double mpg = 10.5;
	
	//location
	int x = 250;
	int y = 250;
	
	public void drive() {
		x = x + speed;
		
	}
	public void draw()  {
		Window.out.background("white");
		Window.out.image("car.png", x, y);
	}
}
