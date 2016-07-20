package day2;
import apcs.Window;
import jeffutils.arr;
import jeffutils.sort;

public class sorting {
	public static void main(String[] args) {
		sort();

	}
	public static void sort() {
		Window.size(500, 500);
		Window.frame();
		Window.setFrameRate(10000);
		int[] array = arr.randomArray(10000, 0, 255);
		sort.draw(array);
		//long startTime = System.nanoTime();
		long drawTime = sort.selection(array, true);
		//long endTime = System.nanoTime();
		sort.draw(array);
		//long duration = (endTime - startTime) - drawTime;

		//System.out.println("done in " + (duration - duration % 1000000000) / 1000000000 + "." + (duration % 1000000000) +  " seconds");
	
	}
	public static void calculateTime() {
		// selection sort
		int[] array = arr.randomArray(10000, 0, 255);
		long startTime = System.nanoTime();
		long drawTime = sort.selection(array, false);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) - drawTime;
		System.out.println("Slection Sort done in " + (duration - duration % 1000000000) / 1000000000 + "." + (duration % 1000000000) +  " seconds");
		//bubble sort
		array = arr.randomArray(10000, 0, 255);
		startTime = System.nanoTime();
		drawTime = sort.bubble(array, false);
		endTime = System.nanoTime();
		duration = (endTime - startTime) - drawTime;
		System.out.println("Bubble Sort done in " + (duration - duration % 1000000000) / 1000000000 + "." + (duration % 1000000000) +  " seconds");
		//insertion sort
		array = arr.randomArray(10000, 0, 255);
		startTime = System.nanoTime();
		drawTime = sort.insertion(array, false);
		endTime = System.nanoTime();
		duration = (endTime - startTime) - drawTime;
		System.out.println("Insertion Sort done in " + (duration - duration % 1000000000) / 1000000000 + "." + (duration % 1000000000) +  " seconds");
		
	}
	
	
}
