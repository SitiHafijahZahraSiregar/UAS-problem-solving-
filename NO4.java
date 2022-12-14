public class Titik {

private int x;
private int y;

public Titik(int x, int y) {
this.x = x;
this.y = y;
}

public int getX() {
return x;
}

public void setX(int x) {
this.x = x;
}

public int getY() {
return y;
}

public void setY(int y) {
this.y = y;
}

public double jarak(Titik o){
double r = ((o.x - this.x)*(o.x - this.x)) + ((o.y - this.y) *(o.y - this.y));
double hasil = Math.sqrt(r);
return hasil;
}
}

public class SegiTiga {
private Titik A;
private Titik B;
private Titik C;

public Titik getA() {
return A;
}

public void setA(Titik A) {
this.A = A;
}

public Titik getB() {
return B;
}

public void setB(Titik B) {
this.B = B;
}

public Titik getC() {
return C;
}

public void setC(Titik C) {
this.C = C;
}

public double keliling(){
double rumus = (A.jarak(B) + B.jarak(C) + C.jarak(A));
return rumus;
}
}
