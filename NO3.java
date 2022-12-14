public static void kucingDanTikus(int x, int y, int z) {
int jarakKucingA = Math.abs(x - z);
int jarakKucingB = Math.abs(y - z);

if (jarakKucingA == jarakKucingB) {
System.out.println("Mouse C");
}

else if (jarakKucingA < jarakKucingB) {
System.out.println("Cat A");
}

else {
System.out.println("Cat B");
}
}
