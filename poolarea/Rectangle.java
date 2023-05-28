package poolarea;

public class Rectangle {
    double width;
    double lenght;

    public Rectangle (double width, double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.lenght = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.lenght = length;
        }  else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.lenght = 0;
        }  else {
            this.width = width;
            this.lenght = length;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return lenght;
    }
    public double getArea(){
        return (width * lenght);
    }

}
