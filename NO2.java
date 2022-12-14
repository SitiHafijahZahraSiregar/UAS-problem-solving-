public class Elips {
private double rx;
private double ry;

public Elips(double rx, double ry) {
this.rx = rx;
this.ry = ry;
}

public double getRx() {
return rx;
}

public void setRx(double rx) {
this.rx = rx;
}

public double getRy() {
return ry;
}

public void setRy(double ry) {
this.ry = ry;
}

public double getLuas(){
double hasil = Math.PI*rx*ry;
return hasil;
}
}
