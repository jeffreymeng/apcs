package jeffutils;
import apcs.Window;
import jeffutils.arr;

public class sort {
	public static long selection(int[] array, boolean draw) {
		
		long drawTime = 0;
		
		for (int i = 0; i < array.length; i ++) {
			int smallestIndex = arr.smallestIndex(array, i);
			arr.swap(array, i, smallestIndex);
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
	public static long bubble(int[] array, boolean draw) {
		
		long drawTime = 0;
		
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for (int i = 0; i < array.length - 1; i ++) {
				if (array[i] > array[i + 1]) {
					arr.swap(array, i, arr.smallestIndex(array, i));
					swapped = true;
				}
				
			}
			if (draw){
				long startTime = System.nanoTime();
				draw(array);
				long endTime = System.nanoTime();
				drawTime += (endTime - startTime);
			}
		}
		return drawTime;
	}
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
