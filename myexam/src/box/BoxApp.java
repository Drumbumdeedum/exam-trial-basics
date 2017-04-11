package box;

public class BoxApp {

  public static void main(String[] args) {

    Cuboid box1 = new Cuboid(5,8,10);

    System.out.println("The surface of the box is: " + box1.getSurface());
    System.out.println("The volume of the box is: " + box1.getVolume());
  }
}
