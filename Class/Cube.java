package Class;

public class Cube {
		int length;
		int bredth;
		int height;
		
                public int getCubeVolumeBy() {
                int sum = length*bredth*height;
                System.out.println(sum);
                return sum;
                }
                        
		public int getCubeVolume() {
			return (length * bredth * height);
		}
		
//Class constructor
		Cube () {
			length = 10;
			bredth = 20;
			height = 30;
		}
		
		Cube (int l, int b, int h) {
			length = l;
			bredth = b;
			height = h;
		}
	}
