import java.util.Scanner;
class Paras{
    float radius;
    float height;
    double CSA;
    double TSA;
    double Volume;
    public Paras(float r){
        radius=r;
    }
    public Paras(float r, float h){
        radius =r;
        height= h;
        CSA =6.28*height*radius;
        TSA = CSA + (6.28*radius*radius);
        Volume= 3.14*height*radius*radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public float getRadius() {
        return radius;
    }
    public double getCSA() {
        return CSA;
    }
    public double getTSA() {
        return TSA;
    }
    public double getVolume() {
        return Volume;
    }
}
public class Cylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        float h = sc.nextFloat();
        Paras cyl= new Paras(r,h);
        System.out.println(cyl.getRadius());
        System.out.printf("The CSA of the cylinder is %f.", cyl.getCSA());
        sc.close();
    }
}