package LABtuan6;

import java.util.Scanner;


public class HocSinh 
{
   public String hoten;
   public String lop;
   public double toan;
   public double ly;
   public double hoa;
     public HocSinh(){}
     public HocSinh(String hoten, String lop, double toan, double ly, double hoa) {
        this.hoten = hoten;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    public void diemtb(double ttb)
    {
     ttb = (toan+ly+hoa)/3;
    }
    public void nhap()
    {
    Scanner sc = new Scanner(System.in);
System.out.println("nhap ho ten hoc sinh");
hoten =sc.nextLine();
System.out.println("nhap diem toan");
toan =sc.nextDouble();
System.out.println("nhap diem ly");
ly =sc.nextDouble();
System.out.println("nhap diem hoa");
hoa =sc.nextDouble();
    }
    public void xuat()
    {
    System.out.println("ho ten hoc sinh "+hoten);
System.out.println("diem toan "+toan);
System.out.println("diem ly "+ly);
System.out.println("diem hoa "+hoa);
    }
}
class hsct extends HocSinh
{
    public hsct(){}
    public hsct(String hoten, String lop, double toan, double ly, double hoa) {
        super(hoten, lop, toan, ly, hoa);
    }
    @Override
    public void diemtb(double ttb)
    {
    ttb = (toan*2+ly+hoa)/4;
    System.out.println(" diem trung binh "+ttb);
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
System.out.println("nhap ho ten hoc sinh");
hoten =sc.nextLine();
System.out.println("nhap diem toan");
toan =sc.nextDouble();
System.out.println("nhap diem ly");
ly =sc.nextDouble();
System.out.println("nhap diem hoa");
hoa =sc.nextDouble();
    }
    public void xuat()
    {
    System.out.println("ho ten hoc sinh "+hoten);
System.out.println("diem toan "+toan);
System.out.println("diem ly "+ly);
System.out.println("diem hoa "+hoa);
    }
}
class main
{
  
public static void main(String[] arg)
{
HocSinh hs = new HocSinh();
HocSinh hsct = new hsct();
hsct.nhap();
hsct.xuat();
hsct.diemtb(0);
}
}