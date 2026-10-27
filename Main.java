public class Main {
    public static void main(String[] args) {
        double vize1 = 60.0;
        double vize2 = 70.0;
        double finalnot = 75.0;

        double ort = (vize1/4)+(vize2/4)+(finalnot/2);
        if (ort<=75 && ort>=75)
            System.out.print("Geçtin");
        else if (ort>=75 && ort<=85)
            System.out.print("Teşekkür Aldın");
        else if (ort>=85)
            System.out.print("Takdir Aldınız");
        else if (ort<=50)
            System.out.print("Kaldın");
    }
}