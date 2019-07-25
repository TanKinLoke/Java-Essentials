package Class;

public class CubeProgram {

	public static void main(String[] args) {
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(20,20,20);
		System.out.println(cube2.getCubeVolume());
                
                Cube cube3 = new Cube();
                cube3.bredth = 10;
                cube3.height = 10;
                cube3.length = 10;
                cube3.getCubeVolumeBy();
	}

}
