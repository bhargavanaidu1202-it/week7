public class Box {
    double width,height,depth;
    public Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;

    }
    public double volumeOfBox(){
        return(width*depth*height);
    }
    public static void main(String args[]){
        Box b=new Box(3.5,4.6,5.4);
        double volume=b.volumeOfBox(); 
        System.out.println("volume of the box"+volume);
    }


}
