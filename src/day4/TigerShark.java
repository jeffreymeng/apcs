/* TigerShark.java | Copyright (c) 2016 Jeffrey Meng | Apache license 2.0 (http://www.apache.org/licenses/LICENSE-2.0) | https://github.com/jeffreymeng/apcs/*/
/**
 * TigerShark.java
 * TigerShark.java Created by Jeffrey Meng on Jul 19, 2016 at 8:49:39 PM
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
package day4;

import apcs.Window;

public class TigerShark extends Shark {
	public void draw() {
		//we can access the draw class of the shark
		// runs draw method of superclass
		super.draw();
		Window.out.color("orange");
		Window.out.rectangle(x, y, radius, radius/3);
	}
}
