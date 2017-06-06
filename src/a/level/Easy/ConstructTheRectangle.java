package a.level.Easy;

public class ConstructTheRectangle {

	public static void main(String[] args) {
		constructRectangle(8);

	}

	public static int[] constructRectangle(int area) {
		int width = 0;
		int length = 0;
		
		width=(int) Math.sqrt(area);
		length=area/width;
		
		while(area!=length*width && length>=width){
			width--;
			length=area/width;
		}
		
		return new int[]{length,width};
	}

}
