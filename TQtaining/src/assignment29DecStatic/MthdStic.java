package assignment29DecStatic;


public class MthdStic {
static void bake (String flavour)
{
System.out.println("cake flavour is..."+flavour);
}
static void bake (String flavour, String flavour2)
{
System.out.println("cake flavour is..."+flavour);
System.out.println("ice cream flavour is..."+flavour2);
}
 void bake (String flavour, String flavour2, String chk_roll)
{
System.out.println("cake flavour is..."+flavour);
System.out.println("ice cream flavour is..."+flavour2);
System.out.println("roll flavour is..."+chk_roll);
}
public static void main(String[] args) {
	MthdStic sc=new MthdStic();
	bake("strawberry"); 
	sc.bake ("red velvet","vanilla","chicken r");

    bake ("chocolate", "vanilla");
}
}