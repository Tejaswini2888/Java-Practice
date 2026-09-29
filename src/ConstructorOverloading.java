public class ConstructorOverloading {
    double width;
    double height;
    double depth;
    //constructors used when all dimensions specified
    ConstructorOverloading(double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    ConstructorOverloading(){
        width=-1;//use -1 to indicate
        height=-1;//an uninitialized
        depth=-1;//Constructoroverloading
    }
//constructor used when cube is created
ConstructorOverloading(double len){
    width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class Overloading{
    public static void main(String[] args){
        ConstructorOverloading b1=new ConstructorOverloading(10,20,15);
        ConstructorOverloading b2=new ConstructorOverloading();
        ConstructorOverloading b3=new ConstructorOverloading(7);
        double vol;
        vol=b1.volume();
        System.out.println("volume of b1="+vol);
        vol=b2.volume();
        System.out.println("volume of b2="+vol);
        vol=b3.volume();
        System.out.println("volume of b3="+vol);
    }
}

